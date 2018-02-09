package lambada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.function.Function;

public class LambadaChallenge {

    public static void main(String[] args)
    {
        //Challenge one

        //create a thread which take string input and split into string array anfd print

        new Thread(()->{

            String[] strings="jogendra singh shekhawat".split(" ");

            //now print string array

            for(String s:strings)
            {
                System.out.println(s);
            }
        }).start();

        //Challenge two

        //write a function as lambada
        // return type of lambada is functional interface

       Function<String,String> lambadaResult=(source)->{
            StringBuilder builder=new StringBuilder();
            for(int i=0;i<source.length();i++)
            {
                if(i%2==1)
                    builder.append(source.charAt(i));

            }
            return builder.toString();
        };

       // call everySecondCharacter

        System.out.println(everySecondCharacter(lambadaResult,"hello"));

        //challange sort and first char upper using lambada

        ArrayList<String> list=new ArrayList<>();
        list.add("jogi");
        list.add("dheeraj");
        list.add("pawan");
        list.add("alok");
        list.add("arvind");
        list.add("rishab");

        Collections.sort(list,(o1,o2)->o1.compareTo(o2));
        ListIterator<String> iterator=list.listIterator();
        while (iterator.hasNext())
        {
            String name=iterator.next();
            String c=name.charAt(0)+"";
            String newname=name.replaceFirst(c,c.toUpperCase());
            iterator.set(newname);
        }

        list.forEach(name-> System.out.println(name));

        System.out.println("Main Thread end");
    }

    //challenge three
    //write method which take function as argument



    public static String everySecondCharacter(Function<String, String> func, String str)
    {

        return func.apply(str);
    }
}
