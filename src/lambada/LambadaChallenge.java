package lambada;

public class LambadaChallenge {

    public static void main(String[] args)
    {
        //create a thread which take string input and split into string array anfd print

        new Thread(()->{

            String[] strings="jogendra singh shekhawat".split(" ");

            //now print string array

            for(String s:strings)
            {
                System.out.println(s);
            }
        }).start();

        System.out.println("Main Thread end");
    }
}
