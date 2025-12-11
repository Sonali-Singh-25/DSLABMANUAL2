//question 12
import java.util.Scanner;

 class q12 {

    public static void main(String[] args) {
        System.out.println("Sonali Singh 24SCSE1010245");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Apka sorted array h :");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        sc.close();
    }
}
