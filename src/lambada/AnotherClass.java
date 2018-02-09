package lambada;

public class AnotherClass {
    public String doSomething()
    {

        //annonymous method
//        System.out.println("Another class name is: "+getClass().getName());
//         return Main.doStringStuff(new UpperConcat() {
//        @Override
//        public String upperConcat(String s1, String s2) {
//            System.out.println("Anonymous class name is: "+getClass().getName());
//            return s1.toUpperCase()+s2.toUpperCase();
//        }
//    },"string1","string2");


        //lambada expression class implement an interface and override its method

        UpperConcat us=(s1,s2)->{
            return s1.toUpperCase()+s2.toUpperCase();
        };

        return Main.doStringStuff(us,"string1","string2");
    }
}
