package DS.Stack;

public class intStack {
    private static final int DEFAULT_SIZE = 10;
    private int size;
    private int head = -1;
    private int[] arr = new int[DEFAULT_SIZE];

    public static void main(String[] args) {
        intStack stack = new intStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

    public int pop() {
        if (head == -1) {
            System.out.println("스택이 비었습니다");
            return head;
        }
        return arr[head--];
    }

    public void push(int value) {
        if (head == DEFAULT_SIZE) {
            System.out.println("스택이 다 찼습니다");
        } else {
            arr[++head] = value;
        }
    }

}
