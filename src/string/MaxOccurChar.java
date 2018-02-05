package string;

import sun.nio.cs.US_ASCII;

public class MaxOccurChar {

    public static void main(String[] args)
    {
        String string="geeksforgeeks";
        maxoccur(string);
        StringBuilder stringBuilder=new StringBuilder("");
        int[] count=new int[string.length()];
        int i=0;
        while(string.length()>0)
        {
            int initial=string.length();
            char c=string.charAt(0);
            string=string.replaceAll(c+"","");
            int later=string.length();
            stringBuilder.append(c);
            count[i++]=initial-later;
        }
       string= stringBuilder.toString();

        for(int j=0;j<string.length();j++)
        {
            System.out.println(string.charAt(j)+" "+count[j]);
        }
        int max=count[0];
        int index=0;
        i=1;
        while(count[i]!=0)
        {
            if(max<count[i])
            {
                max=count[i];
                index=i;
            }
            i++;
        }

        System.out.print(string.charAt(index));

    }

    public static void maxoccur(String string)
    {
        int length=string.length();
        int[] count=new int[256];
        int max=-1;
        char result=' ';
        for(int i=0;i<length;i++)
        {
            count[string.charAt(i)]++;
        }
        for(int j=0;j<length;j++)
        {
            if(max<count[string.charAt(j)])
            {
                max=count[string.charAt(j)];
                result=string.charAt(j);
            }
        }

        System.out.println(result+" "+max);

    }
}
