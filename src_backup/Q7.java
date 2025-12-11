//question 7
import java.util.Scanner;

 class Q7 {

    public static void solveHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        solveHanoi(n - 1, source, destination, auxiliary);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        solveHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        System.out.println("Sonali Singh 24SCSE1010245");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();
        System.out.println("Steps to solve Tower of Hanoi:");
        solveHanoi(n, 'A', 'B', 'C');
        sc.close();
    }
}
