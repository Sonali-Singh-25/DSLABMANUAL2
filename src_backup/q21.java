//question 21
 class q21 {
    static final int SIZE = 5;
    static int[] queue = new int[SIZE];
    static int front = -1, rear = -1;

    public static void enqueue(int val) {
        if ((front == 0 && rear == SIZE - 1) || (rear == (front - 1 + SIZE) % SIZE)) {
            System.out.println("Queue is Full");
            return;
        }
        if (front == -1) front = rear = 0;
        else if (rear == SIZE - 1 && front != 0) rear = 0;
        else rear++;
        queue[rear] = val;
    }

    public static int dequeue() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int data = queue[front];
        if (front == rear) front = rear = -1;
        else if (front == SIZE - 1) front = 0;
        else front++;
        return data;
    }

    public static boolean isEmpty() {
        return front == -1;
    }

    public static boolean isFull() {
        return (front == 0 && rear == SIZE - 1) || (rear == (front - 1 + SIZE) % SIZE);
    }

    public static void main(String[] args) {
        System.out.println("Sonali Singh 24SCSE1010245");
        enqueue(10);
        enqueue(20);
        enqueue(30);
        System.out.println("Dequeued: " + dequeue());
        System.out.println("Dequeued: " + dequeue());
    }
}
