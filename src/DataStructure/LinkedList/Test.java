package DataStructure.LinkedList;

public class Test {

    public static void main(String[] args)
    {
        LinkList linkList=new LinkList();

        //insert at end
        for(int i=0;i<10;i++) {
            linkList.insertEnd(i);
        }

        //insert at front

        linkList.insertFront(10);
        linkList.insertFront(11);

       //insert at position

        linkList.insertAtPosition(15,6);
        linkList.insertAtPosition(16,9);

        //traverse

        linkList.traverse();

        //delete at front

        linkList.deleteAtBegining();
        linkList.deleteAtBegining();

        //traverse

        linkList.traverse();

        //delete At last

        linkList.deleteAtLast();
        linkList.deleteAtLast();

        //traverse

        linkList.traverse();

        //delete At Position

        linkList.deleteAtPosition(5);
        linkList.deleteAtPosition(6);

        //traverse

        linkList.traverse();
    }
}
