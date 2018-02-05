package string;

public class ReverseExceptSpChar {

    public static void main(String[] args)
    {
        String str=new String("abc@f$fg&");
        char[] chars=str.toCharArray();
        int end=str.length()-1;
        int start=0;
        while(start<end)
        {
            if(!isAlphabet(chars[start]))
            {
                start++;
            }
            else if (!isAlphabet(chars[end]))
            {
                end--;
            }
            else
            {
                char temp=chars[start];
                chars[start]=chars[end];
                chars[end]=temp;
                start++;
                end--;
            }
        }
        System.out.print(new String(chars));

    }
    static boolean isAlphabet(char c)
    {
        if(c>='A'&&c<='Z'||c>='a'&&c<='z'||c>=48&&c<=57)
        {
            return true;
        }
        return false;
    }
}
