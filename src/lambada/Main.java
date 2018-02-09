package lambada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args)
    {
        //this is ex of anonymous class

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("runnsble");
            }
        }).start();




        //lambada contains three token
        //1--argument list
        //2--  '->'
        //3--body of function

        //lambada ex is used with functionak interface which has only one function to implememt
        

        new Thread(()->System.out.println("lambada ex")).start();

        //if we have multiple state ment then we use this

        new Thread(()->{
            System.out.println("first");
            System.out.println("second");
        }).start();


        Employe emp=new Employe("jogi",25);
        Employe emp1=new Employe("pawan",23);
        Employe emp2=new Employe("alok",24);
        Employe emp3=new Employe("dheeraj",25);
        Employe emp4=new Employe("arvind",25);
        Employe emp5=new Employe("abhishek",24);

        ArrayList<Employe> employes=new ArrayList<>();


        employes.add(emp);
        employes.add(emp1);
        employes.add(emp2);
        employes.add(emp3);
        employes.add(emp4);
        employes.add(emp5);


        //here we need to implement comparable interface
        Collections.sort(employes);

        //may or may not implement comparable depend on you
        Collections.sort(employes, new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                if(o1.compareTo(o2)<0)
                    return -1;
                else if(o1.compareTo(o2)>0)
                    return 1;
                else
                    return 0;
            }
        });
//---------------------------------------------------------------------------------
        //lambad  1
        Collections.sort(employes,(Employe o1,Employe o2)->
                 o2.getName().compareTo(o1.getName())
        );
        //lambada2
        Collections.sort(employes,( o1, o2)->
                        o2.getName().compareTo(o1.getName())
        );


        //print array

//        for(Employe e:employes)
//        {
//        System.out.println("Name "+e.getName()+" Age "+e.getAge());
//        }

        //another way to print

        employes.forEach(obj-> System.out.println(obj.getName()));
        //print employe whose age is 25

        employes.forEach(obj-> {
            if (obj.getAge()==25)
            System.out.println(obj.getName());
        });



        String string=doStringStuff(new UpperConcat()
        {
            @Override
            public String upperConcat(String s1,String s2){
            return s1.toUpperCase()+s2.toUpperCase();}
        },employes.get(0).getName(),employes.get(1).getName());

    }

    public static String doStringStuff(UpperConcat uc,String s1,String s2)
    {
        return uc.upperConcat(s1,s2);
    }
}

interface UpperConcat
{
    public abstract String upperConcat(String s1,String s2);
}