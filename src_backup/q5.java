

//question 5 part b

 class q5 {
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


