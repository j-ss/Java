package DataStructure.LinkedList;

public class DoublyTest {

    public static void main(String[] args)
    {
        DoublyOperation doublyOperation=new DoublyOperation();

        // insert at end

        for(int i=0;i<10;i++)
        {
            doublyOperation.insertAtEnd(i);
        }

        //insert at front

        doublyOperation.insertAtFront(69);
        doublyOperation.insertAtFront(56);

        // insert At position

        doublyOperation.insertAtPosition(70,5);
        doublyOperation.insertAtPosition(30,7);
        //traverse

        doublyOperation.traverse();

        //delete at front

        doublyOperation.deleteAtFront();
        doublyOperation.deleteAtFront();

        //traverse

        doublyOperation.traverse();

        ///delete at end

        doublyOperation.deleteAtEnd();
        doublyOperation.deleteAtEnd();

        //traverse

        doublyOperation.traverse();

        ///delete at position

        doublyOperation.deleteAtPosition(6);
        doublyOperation.deleteAtPosition(3);

        //traverse

        doublyOperation.traverse();

    }
}
