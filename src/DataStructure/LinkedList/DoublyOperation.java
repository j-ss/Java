package DataStructure.LinkedList;

public class DoublyOperation {

    private DoublyNode head;

    //traverse list

    public void traverse()
    {
        DoublyNode temp=head;
        if(temp==null)
        {
            System.out.print("empty list");
        }
        else {
            while (temp!=null) {
                System.out.print(temp.getData() + "-->");
                temp=temp.getNext();
            }
        }
        System.out.println();

    }

    // insert at end

    public void insertAtEnd(int data)
    {
        DoublyNode doublyNode=new DoublyNode(data);

        if(head==null)
        {
            head=doublyNode;
        }
        else
        {
            DoublyNode temp=head;
            while(temp.getNext()!=null)
            {
                temp=temp.getNext();
            }
            temp.setNext(doublyNode);
            doublyNode.setPrevious(temp);
        }
    }

    //insert At front

    public void insertAtFront(int data)
    {
        DoublyNode doublyNode=new DoublyNode(data);
        if(head==null)
        {
            head=doublyNode;
        }
        else
        {
            doublyNode.setNext(head);
            head.setPrevious(doublyNode);
            head=doublyNode;
        }
    }

    //insert at position

    public void insertAtPosition(int data,int position)
    {
        DoublyNode doublyNode=new DoublyNode(data);

        if(head==null)
        {
            head=doublyNode;
        }
        else
        {
            DoublyNode temp=head;
            int count=1;
            while(temp.getNext()!=null&&count!=position-1)
            {
                temp=temp.getNext();
                count++;
            }
            doublyNode.setNext(temp.getNext());
            temp.getNext().setPrevious(doublyNode);
            temp.setNext(doublyNode);
            doublyNode.setPrevious(temp);
        }
    }

    //delete at front

    public void deleteAtFront()
    {
        if (head == null)
        {
            System.out.print("List is Empty");
        }
        else
        {
            DoublyNode temp=head;
            head=head.getNext();
            temp.setNext(null);
        }
    }

    //delete at end

    public void deleteAtEnd()
    {

        if(head==null)
        {

        }
        else
        {
            DoublyNode temp=head;
            while(temp.getNext().getNext()!=null)
            {
                temp=temp.getNext();
            }
            temp.setNext(null);
        }
    }

    //delete at position

    public void deleteAtPosition(int position)
    {
        if(head==null)
        {
            System.out.print("List is Empty");
        }
        else
        {
            DoublyNode temp=head;
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
