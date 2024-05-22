package DS.Queue;

public class intQueue {
    private final int DEFAULT_SIZE = 10;
    int[] arr = new int[DEFAULT_SIZE];
    private int pushHead = -1;
    private int popHead = -1;

    public static void main(String[] args) {
        intQueue queue = new intQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }

    public void push(int value) {
        if (pushHead == DEFAULT_SIZE) {
            System.out.println("큐가 다 찼습니다");
        }
        if (popHead == -1) {
            arr[++pushHead] = value;
            ++popHead;
        } else {
            arr[++pushHead] = value;
        }
    }

    public int pop() {
        if (popHead == -1) {
            System.out.println("큐가 비었습니다");
            return -1;
        } else {
            return arr[popHead++];
        }
    }
}
