package stack;

public class DynArrayStack {

    private int[] array=new int[10];

   private int top=-1;


    // insert data into stack

    public void push(int data)
    {


        if(top==array.length-1)
        {
            int[] temp=new int[array.length*2];
            for(int i=0;i<=top;i++)
            {
                temp[i]=array[i];
            }
            array=temp;
        }
        else
        {
            array[++top]=data;
        }

    }

    // remove top element form stack and return removed element

    public int pop()
    {
        return array[top--];
    }

    //return top element from stack without removing it

    public int pull()
    {
        return array[top];
    }

    // tell is stack empty or not

    public boolean isEmpty()
    {
        if(top==-1)
            return true;
        return false;
    }


    // return size of stack

    public int getSize()
    {
        return top+1;
    }

   public void printStack()
   {
       System.out.print("Stack element is :- ");
       for(int i=0;i<=top;i++)
       {
           System.out.print(array[i]+" ");
       }

       System.out.println();
   }
}
