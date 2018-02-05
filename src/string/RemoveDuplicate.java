package string;

public class RemoveDuplicate {

    public static void main(String[] args)
    {
        String str=new String("geeksforgeeks");
        StringBuilder stringBuilder=new StringBuilder("");
        stringBuilder.append(str.charAt(0));
        int length=str.length();
        for(int i=1;i<length;i++)
        {
            char c=str.charAt(i);
            if(stringBuilder.indexOf(c+"")<0)
            {
                stringBuilder.append(c);
            }


        }

        System.out.print(str+"\n"+stringBuilder);
    }
}
