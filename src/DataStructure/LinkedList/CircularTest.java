package DataStructure.LinkedList;

public class CircularTest {

    public static void main(String[] args) {

        CircularOperation circularOperation = new CircularOperation();

        //insert at end
        for(int i=0;i<10;i++) {
            circularOperation.insertAtEnd(i);
        }

        //traverse

        circularOperation.traverse();

        //insert at front

        circularOperation.insertAtFront(55);
        circularOperation.insertAtFront(47);

        //traverse

        circularOperation.traverse();

        //insert at position

        circularOperation.insertAtPosition(34,5);
        circularOperation.insertAtPosition(35,8);

        //traverse

        circularOperation.traverse();

        //is circular
        boolean ans=circularOperation.isLoop();
        System.out.print(ans);



    }

}
