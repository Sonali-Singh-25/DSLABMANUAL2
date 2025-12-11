import java.util.*;

public class Q6 {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many terms you want:");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Fibonacci series using iteration:");
        if (n >= 1) System.out.println(a);
        if (n >= 2) System.out.println(b);

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

        System.out.println("Fibonacci series using recursion:");
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i));
        }

        sc.close();
    }
}
