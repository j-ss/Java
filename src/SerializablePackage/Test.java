package SerializablePackage;

import java.io.*;

public class Test {

    public static void main(String[] args)
    {

        Student student=new Student();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter First name");

        try {
            student.setFname(bufferedReader.readLine());
            System.out.println("Enter Last name");
            student.setLname(bufferedReader.readLine());
            System.out.println("Enter address");
            student.setAddress(bufferedReader.readLine());
            System.out.println("Enter phone number");
            student.setNumber(bufferedReader.read());

            //save object into file

            FileOutputStream fileOutputStream=new FileOutputStream("jogi.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);

            // access object

            FileInputStream fileInputStream=new FileInputStream("jogi.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            Student object=(Student)objectInputStream.readObject();

            System.out.print(object.getFname()+" "+object.getLname()+" "+object.getAddress()+
            " "+object.getNumber());

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }



    }
}
