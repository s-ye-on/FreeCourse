package DS.SinglyLinkedList;

public class SinglyLinkedList {
    private Node head = null;

    SinglyLinkedList() {
        this.head = null;
    }

    public Node getHead() {
        return this.head;
    }

    public void append(int value) {
        if (this.head == null) {
            this.head = new Node(value, null);
            return;
        }
        Node pointer = this.head;
        while (pointer.next != null) {
            pointer = pointer.next;
        }
        pointer.next = new Node(value, null);
    }

    public void delete(int value) {
        Node pointer = this.head;
        if (pointer.getValue() == value) {
            Node removeNode = this.head;
            this.head = this.head.next;
            removeNode = null;
            return;
        }
        Node temp = pointer;
        while (pointer != null && pointer.getValue() != value) {
            pointer = pointer.next;
        }
        if (pointer.next == null) {
            temp.next = null;
        } else {
            temp.next = pointer.next;
        }
        pointer = null;
    }

    /**
     * 모든 노드 출력
     */
    public void printAll() {
        Node pointer = this.head;
        StringBuilder sb = new StringBuilder();
        while (pointer.next != null) {
            sb.append(pointer.getValue());
            sb.append(" -> ");
            pointer = pointer.next;
        }
        sb.append(pointer.getValue());
        System.out.println(sb.toString());
    }
}
