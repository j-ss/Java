package string;

public class ReverseStringRecursion {
    static int i=0;
    static StringBuilder stringBuilder=new StringBuilder("");
    public static void main(String... args)
    {
        String str="jogendra singh shekhawat";
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        reverse(str,str.length());
        System.out.print(ReverseStringRecursion.stringBuilder);
    }
    public static void reverse(String str,int length)
    {

        if(i==length)
        {
            return;
        }
        char c=str.charAt(i);
        i++;
        reverse(str,length);
        stringBuilder.append(c);
    }
}
