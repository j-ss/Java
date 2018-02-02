package stack;

import java.util.Random;

public class TestStack {


    public static void main(String[] args)
    {
        DynArrayStack dynArrayStack=new DynArrayStack();


        // insert element into stack
        Random r=new Random();
        for(int i=0;i<7;i++)
        {

            dynArrayStack.push(i+r.nextInt(100));

        }

        // print stack

        dynArrayStack.printStack();

        //size of stack

        System.out.println("Size of stack is "+dynArrayStack.getSize());

        //pop element

        System.out.println("pop operation is performed "+dynArrayStack.pop());

        dynArrayStack.printStack();

        System.out.println("pull operation is performed "+dynArrayStack.pull());

        dynArrayStack.printStack();

        for(int i=0;i<7;i++)
        {

            dynArrayStack.push(i+r.nextInt(100));

        }

        dynArrayStack.printStack();

        System.out.println("Size of stack is "+dynArrayStack.getSize());
    }
}
