//question 9
import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Sonali Singh 24SCSE1010245");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Found at index " + i);
                sc.close();
                return;
            }
        }

        System.out.println("Not found");
        sc.close();
    }
}
