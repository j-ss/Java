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

    public void traverse()
    {
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
}
