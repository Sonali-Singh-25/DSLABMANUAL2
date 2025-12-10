//question 10
import java.util.Scanner;

 class BinarySearch {

    public static void main(String[] args) {
        System.out.println("Sonali Singh 24SCSE1010245");
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int LB = 0, UB = arr.length - 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want to find between 1 to 10: ");
        int n = sc.nextInt();
        int mid;
        boolean found = false;

        while (LB <= UB) {
            mid = (LB + UB) / 2;
            if (arr[mid] == n) {
                System.out.println("Value found at index " + mid);
                found = true;
                break;
            }
            if (arr[mid] < n) {
                LB = mid + 1;
            } else {
                UB = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Value not found");
        }
        sc.close();
    }
}
