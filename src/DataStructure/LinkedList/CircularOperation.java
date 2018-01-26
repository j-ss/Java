package DataStructure.LinkedList;

public class CircularOperation {

    CircularList head;
    CircularList end;

    // insert at end

    public void insertAtEnd(int data)
    {
        CircularList circularList=new CircularList(data);

        if(head==null)
        {
            head=circularList;
            circularList.setNext(head);
            end=head;
        }
        else
        {
            end.setNext(circularList);
            end=circularList;
            circularList.setNext(head);
        }
    }

    //insert at front

    public void insertAtFront(int data)
    {
        CircularList circularList=new CircularList(data);

        end.setNext(circularList);
        circularList.setNext(head);
        head=circularList;
    }

    //insert at position

    public void insertAtPosition(int data,int position)
    {
        CircularList circularList=new CircularList(data);
        if(head==null)
        {
            head=circularList;
            circularList.setNext(head);
            end=head;
        }
        else {
            CircularList temp = head;
            int count = 1;
            while (temp.getNext() != end && count != position - 1) {
                temp = temp.getNext();
                count++;
            }
            circularList.setNext(temp.getNext());
            temp.setNext(circularList);

        }
    }

    //traverse

    public void traverse()
    {
     if(head==null)
     {
         System.out.print("Empty list");
     }
     else
     {
         CircularList temp=head;
         while (temp.getNext()!=head)
         {
             System.out.print(temp.getData()+"-->");
             temp=temp.getNext();
         }
         System.out.print(temp.getData());
     }

     System.out.println();
    }

    //check is circular

    public void checkCircular()
    {
        CircularList temp=head;
        while(temp.getNext()!=null)
        {
            System.out.print(temp.getData()+"-->");
            temp=temp.getNext();
        }
    }
}
