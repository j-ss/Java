package DataStructure.LinkedList;

public class LinkList {

    Node head=null;

    // insert an element at end

    public void insertEnd(int data)
    {
        Node node=new Node(data);
        if(head==null)
        {
            head=node;
        }
        else
        {
            Node temp=head;
            while(temp.getNext()!=null)
            {
                temp=temp.getNext();
            }
            temp.setNext(node);
        }
    }

    //Traverse a linked list

    public void traverse(String str)
    {
        System.out.print(str+" : ");
        Node temp=head;
        if(temp==null)
        {
            System.out.print("Linked lIst is Empty");
        }
        else{

            while (temp != null)
            {
                System.out.print(temp.getData()+"->");
                temp=temp.getNext();
            }
        }System.out.println();
    }

    //insert at front

    public void insertFront(int data)
    {
        Node node=new Node(data);
        if(head==null)
        {
            head=node;
        }
        else
        {
            node.setNext(head);
            head=node;
        }
    }

    //insert at position

    public void insertAtPosition(int data,int position)
    {
        Node node=new Node(data);

        if(head==null)
        {
            head=node;
        }
        else
        {
            Node temp=head;
            int count=1;
            while(temp.getNext()!=null&&count!=position-1)
            {
                temp=temp.getNext();
                count++;
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
            if(count!=position-1)
            {
                System.out.print("enter valid position-->Enter short position");
            }
        }

    }

    //delete a node at begining

    public void deleteAtBegining()
    {
        if(head==null)
        {
            System.out.print("Linked List is Empty");
        }
        else {
            head = head.getNext();
        }
    }

    //delete a node at end

    public void deleteAtLast()
    {
        if(head==null)
        {
            System.out.print("Linked List IS Empty");
        }
        else{
            Node temp=head;
            while(temp.getNext().getNext()!=null)
            {
                temp=temp.getNext();
            }
            temp.setNext(null);
        }
    }

    //delete At Position

    public void deleteAtPosition(int position)
    {
        Node temp=head;

        if(temp==null)
        {
            System.out.print("Linked List IS Empty");
        }
        else {
            int count=1;
            while(temp.getNext()!=null&&count!=position-1)
            {
                temp=temp.getNext();
                count++;
            }

            temp.setNext(temp.getNext().getNext());
        }
    }

    //find node from end of linked list

    public void findNodeFromEnd(int position)
    {
        Node firstNode=head;
        Node secondNode=head;
        int count=0;
        while (firstNode!=null)
        {
            if(count>=position)
            {
                secondNode=secondNode.getNext();
            }
            count++;
            firstNode=firstNode.getNext();
        }

        System.out.println(position+"th node from end is "+secondNode.getData());
    }

    // by using recursion
    int count=0;
    public void findNodeWithRecursion(Node node,int position)
    {

        if(node==null)
        {
            return;
        }
        findNodeWithRecursion(node.getNext(),position);
        count++;
        if(count==position)
        {
            System.out.println(position+"th node from end is "+node.getData());
        }
    }

    //find a list is cyclic or not

    public boolean isLoop(Node head)
    {
        Node fPtr=head;
        Node sPtr=head;

        while (fPtr!=null)
        {
            fPtr=fPtr.getNext().getNext();
            sPtr=sPtr.getNext();

            if(sPtr==fPtr)
            return true;
        }
        return false;

    }

    /**
     *  *********************create a cyclic list*************************
     */


    public Node createLoopList()
    {   int count=0;
        Node head=null;
        Node start=null;
        Node temp=null;
        for(int i=0;i<10;i++)
        {
            Node node=new Node(i);
            if(head==null)
            {
                head=node;
                temp=head;
                count++;
            }
            else
            {

                count++;
                while (temp.getNext()!=null)
                {
                    temp=temp.getNext();
                }
                temp.setNext(node);
                if (count==6)
                    start=temp;
            }
        }
        temp.getNext().setNext(start);
        return head;
    }

    /**
     * *************reverse a linked list*********************
     */

    public void reverse()
    {
        Node current=head;
        Node next=null;
        Node prev=null;

        while(current!=null)
        {
            next=current.getNext();
            current.setNext(prev);
            prev=current;
            current=next;
        }

        head=prev;

    }

    /**
     * **********************insert node into sorted  list********************
     */
}
