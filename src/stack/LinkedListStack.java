package stack;

public class LinkedListStack {

    Node top;
    private int size=0;

    //insert data into stack

    public void push(int data)
    {
        Node temp=new Node(data);
        if(top==null) {
            top = temp;
        }
        else {
            temp.setNext(top);
            top = temp;
        }
        size++;
    }


    // delete top element and return

    public int pull()
    {

        System.out.print("pull operation is performed ");
        Node temp=top;
        top=top.getNext();
        temp.setNext(null);
        size--;
        return temp.getData();
    }

    // return top element

    public int pop()
    {
        System.out.print("pop operation is performed ");
        return top.getData();
    }

    // check is stack is empty

    public boolean isEmpty()
    {
        if(top==null)
            return true;

        return false;
    }

    // give size of stack

    public int getSize()
    {

        return size;
    }

    //print stack

    public void printStack()
    {
        Node temp=top;

        System.out.print("Stack element is ");
        while (temp!=null)
        {
            System.out.print(" <- "+temp.getData());
            temp=temp.getNext();
        }
        System.out.println();
    }
}
