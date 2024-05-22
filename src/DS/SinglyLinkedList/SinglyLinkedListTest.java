package DS.SinglyLinkedList;

public class SinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.append(85);
        singlyLinkedList.append(70);
        singlyLinkedList.append(30);
        singlyLinkedList.append(12);

        System.out.println("단일 연결 리스트: ");
        singlyLinkedList.printAll();

        singlyLinkedList.delete(70);
        singlyLinkedList.printAll();

        singlyLinkedList.delete(30);
        singlyLinkedList.printAll();
    }
}
