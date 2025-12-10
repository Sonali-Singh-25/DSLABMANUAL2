//question 6 part a
 class Fibonacci {

    static void fib(int n) {
        int a = 0, b = 1, c;
        while (a <= n) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        System.out.println("Sonali Singh 24scse1010245");
        System.out.print("Fibonacci series up to 20: ");
        fib(20);
    }
}

//question 6 part b
 class FibonacciRecursive {

    static void fib(int n, int a, int b) {
        if (a > n)
            return;
        System.out.print(a + " ");
        fib(n, b, a + b);
    }

    public static void main(String[] args) {
        System.out.println("Sonali Singh 24scse1010245");
        System.out.print("Fibonacci series up to 20: ");
        fib(20, 0, 1);
    }
}
 
