package stack;

import java.util.Random;

public class TestLinkedStack {

    public static void main(String[] args)
    {
        LinkedListStack linkedListStack=new LinkedListStack();
        Random r=new Random();

        //push elemt into stack

        for(int i=0;i<10;i++)
        {

            linkedListStack.push(i+r.nextInt(100));
        }

        //print stack

        linkedListStack.printStack();

       System.out.print("Size is "+linkedListStack.getSize());

       linkedListStack.pop();

       linkedListStack.printStack();

       linkedListStack.pull();

       linkedListStack.printStack();

       System.out.print("Size is "+linkedListStack.getSize());

        for(int i=0;i<10;i++)
        {

            linkedListStack.push(i+r.nextInt(100));
        }

        linkedListStack.printStack();

        System.out.print("Size is "+linkedListStack.getSize());

    }
}
