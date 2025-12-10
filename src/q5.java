//question 5 part a

import java.util.Scanner;

 class FactorialIterative {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
    
    public static void main(String[] args) {
        System.out.println("Sonali Singh 24SCSE1010245");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.printf("Factorial of %d is %d\n", n, factorial(n));
        }
        sc.close();
    }
}


//question 5 part b

 class FactorialRecursive {
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        System.out.println("Sonali Singh 24SCSE1010245");
        int n = 5;
        System.out.printf("Factorial of %d is %d", n, factorial(n));
    }
}


