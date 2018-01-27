package DataStructure.LinkedList;

public class CircularList {

    private int data;
    private CircularList next;

    CircularList(int data)
    {
     this.data=data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public CircularList getNext() {
        return next;
    }

    public void setNext(CircularList next) {
        this.next = next;
    }
}
