package DS.SinglyLinkedList;

public class Node {
    protected Node next;
    private int value;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return this.value;
    }

}
