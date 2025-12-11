//question 8
import java.util.Scanner;

 class Q8 {

    public static void printNumbers(int n) {
        if (n <= 0)
            return;
        printNumbers(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        System.out.println("Sonali Singh 24SCSE1010245");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printNumbers(n);
        sc.close();
    }
}
