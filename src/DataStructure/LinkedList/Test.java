package DataStructure.LinkedList;

import java.util.Random;

public class Test {

    public static void main(String[] args)
    {
        LinkList linkList=new LinkList();

        //insert at end
        for(int i=0;i<10;i++) {
            Random r=new Random();
            linkList.insertEnd(r.nextInt(100));
        }

//        //insert at front
//
//        linkList.insertFront(10);
//        linkList.insertFront(11);
//
//       //insert at position
//
//        linkList.insertAtPosition(15,6);
//        linkList.insertAtPosition(16,9);
//
//        //traverse
//
//        linkList.traverse(" linked list ");
//
//        //delete at front
//
//        linkList.deleteAtBegining();
//        linkList.deleteAtBegining();
//
//        //traverse
//
//        linkList.traverse(" linked list ");
//
//        //delete At last
//
//        linkList.deleteAtLast();
//        linkList.deleteAtLast();
//
//        //traverse
//
//        linkList.traverse(" linked list ");
//
//        //delete At Position
//
//        linkList.deleteAtPosition(5);
//        linkList.deleteAtPosition(6);
//
//        //traverse
//
//        linkList.traverse(" linked list ");

          // find node from last

//        linkList.findNodeWithRecursion(linkList.head,6);
//        linkList.findNodeFromEnd(6);

        // create a linked list with loop

//        Node node=linkList.createLoopList();

//        // is loop present or not
//
//        boolean isLoop=linkList.isLoop(node);
//        System.out.print(isLoop);


        // traverse

        linkList.traverse("Linked list before reverse");

        //  reverse list

        linkList.reverse();

        //traverse

        linkList.traverse("Linked list after reverse");


        //linkList.sortList();

        // recursively traverse

        linkList.traverseRecurse(linkList.head);

        //even or odd

        linkList.checkList();

        //merge two sorted link list

        //linkList.merge(head1,head2);

        //reverse list into group

        linkList.reverseInGroup(3);

        linkList.traverse("Linked list : ");

    }
}
