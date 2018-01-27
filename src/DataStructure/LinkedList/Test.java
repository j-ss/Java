package DataStructure.LinkedList;

public class Test {

    public static void main(String[] args)
    {
        LinkList linkList=new LinkList();

        //insert at end
        for(int i=0;i<10;i++) {
            linkList.insertEnd(i);
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

        linkList.traverse("Linked list before traversal");

        //  reverse list

        linkList.reverse();

        //traverse

        linkList.traverse("Linked list after traversal");


    }
}
