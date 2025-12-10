//question 2
 class ReverseArray {

    static void reverse(int[] arr, int n) {
        for (int i = 0; i < n / 2; i++) {
            int t = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = t;
        }
    }

    public static void main(String[] args) {
        System.out.println("Sonali Singh 24scse1010245");
        int[] arr = {1, 2, 3, 4, 5};
        int n = 5;

        System.out.print("Original: ");
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
        System.out.println();

        reverse(arr, n);

        System.out.print("Reversed: ");
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }
}

