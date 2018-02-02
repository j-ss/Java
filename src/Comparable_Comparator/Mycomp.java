package Comparable_Comparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Mycomp implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {


        return o2.compareTo(o1);
    }
}
class Test
{
    public static void main(String[] args)
    {
        TreeSet<String> ts=new TreeSet<String>(new Mycomp());

        ts.add("a");
        ts.add("r");
        ts.add("e");
        ts.add("p");
        ts.add("b");


        for(String value:ts)
        {
            System.out.print(value);
        }
    }
}
