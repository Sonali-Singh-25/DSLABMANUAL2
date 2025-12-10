//question 20
 class StackArray {
    static final int SIZE = 100;
    static int[] stack = new int[SIZE];
    static int top = -1;

    public static void push(int val) {
        if (top == SIZE - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = val;
        }
    }

    public static int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public static boolean isEmpty() {
        return top == -1;
    }

    public static boolean isFull() {
        return top == SIZE - 1;
    }

    public static void main(String[] args) {
        System.out.println("Sonali Singh 24SCSE1010245");
        push(10);
        push(20);
        push(30);
        System.out.println("Popped: " + pop());
        System.out.println("Popped: " + pop());
    }
}

