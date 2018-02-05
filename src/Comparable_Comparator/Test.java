package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Test {

    public static void main(String[] args)
    {
        Student obj1=new Student("jogendra","jogi@gmail.com");
        Student obj2=new Student("joni","joni@gmail.com");
        Student obj3=new Student("alok","alok@gmail.com");
        Student obj4=new Student("dheeraj","dheeraj@gmail.com");
        Student obj5=new Student("pawan","pawan@gmail.com");
        Student obj6=new Student("aashutosh","aashutosh@gmail.com");
        Student obj7=new Student("rishab","rishab@gmail.com");
        Student obj8=new Student("arvind","arvind@gmail.com");


        ArrayList<Student> obj=new ArrayList<Student>();

        obj.add(obj1);
        obj.add(obj2);
        obj.add(obj3);
        obj.add(obj4);
        obj.add(obj5);
        obj.add(obj6);
        obj.add(obj7);
        obj.add(obj8);

        Collections.sort(obj,new CustomSort());

        Iterator<Student> iterator=obj.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next().getName());
        }

    }
}
