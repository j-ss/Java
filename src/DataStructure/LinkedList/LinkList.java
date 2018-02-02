package DataStructure.LinkedList;

import java.util.*;

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

    public void insertNode(Node node)
    {

    }

    /**
     * ************************sorting a linked list****************************
     */

    public void sortList()
    {
        HashMap<Node,Integer> hashMap=new HashMap<Node, Integer>();
        Node temp=head;
        Node prev=null;
        while(temp!=null)
        {
            hashMap.put(temp,temp.getData());
            prev=temp;
            temp=temp.getNext();
            prev.setNext(null);

        }
        Set<Node> set=hashMap.keySet();
        for(Node n:set)
        {
            System.out.println(n+"  "+n.getData()+" ");
        }
        temp=null;
        prev=null;
        ArrayList<Node> arrayList=new ArrayList<>(set.size());
        for(Node n:set)
        {
            arrayList.add(n);
        }
        for(int i=0;i<arrayList.size();i++)
        {
            if(temp==null)
            {
                temp=arrayList.get(i);
            }
            else
            {
                temp.setNext(arrayList.get(i));
            }

        }

        while(temp!=null)
        {
            System.out.print(temp.getData()+" ");
            temp=temp.getNext();
        }
    }

    /**
     * **********traverse list recursively ********************************
     */


        public void traverseRecurse(Node node)
        {
            if(node==null)
            {
                return;
            }
            traverseRecurse(node.getNext());
            System.out.print(node.getData());
        }

    /**
     * ***************check even or odd*************************
     */

    public void checkList()
    {
        Node temp=head;

        while(temp.getNext()!=null)
        {
            temp=temp.getNext().getNext();

            if(temp==null)
            {
                System.out.println(" even ");
                 return;
            }
        }
        System.out.println(" odd ");
        return;
    }

    /**
     * *******************merge two sorted array***********************
     */

    public void merge(Node head1,Node head2)
    {
        Node first=head1;
        Node seccond=head2;
        Node third=null;
        while(first!=null&&seccond!=null)
        {
            if(first.getData()>seccond.getData())
            {
                if(third==null)
                    third=seccond;
                else
                {
                    third.setNext(seccond);
                    seccond=seccond.getNext();
                }
            }
            if(first.getData()<seccond.getData())
            {
                if(third==null)
                    third=first;
                else
                {
                    third.setNext(first);
                    first=first.getNext();
                }
            }
            if(first.getData()==seccond.getData())
            {
                if(third==null) {
                    third = seccond;
                    third.setNext(first);


                }
                else
                {
                    third.setNext(first);
                    third.setNext(seccond);
                }
                first=first.getNext();
                seccond=seccond.getNext();
            }
        }
        if(first==null)
            third.setNext(seccond);
        if(seccond==null)
            third.setNext(first);
    }

    /**
     * ********************** reverse list into group****************************
     */

    public void reverseInGroup(int size)
    {
        Node current=head;
        Node prev=null;
        Node next=null;
        Node pre=null;
        Node node=head;
        int count=1;
        while(current!=null)
        {
            if(count==size)
            {
                next=current.getNext();
                current.setNext(prev);
                prev=node;
                node=next;
                current=next;
             count=1;
            }
            pre=current;
            current=current.getNext();
            count++;

        }
        if(count!=size)
        {
            next.setNext(prev);
            prev=next;
        }
        head=prev;
    }
}

