//question 1
 class q1 {
    static void insert(int[] arr, int[] n, int pos, int val) {
        for (int i = n[0]; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = val;
        n[0]++;
    }

    static void delete(int[] arr, int[] n, int pos) {
        for (int i = pos; i < n[0] - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n[0]--;
    }

    public static void main(String[] args) {
        int[] arr = new int[100];
        int[] n = {5};

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        insert(arr, n, 2, 10);
        System.out.print("After insertion: ");
        for (int i = 0; i < n[0]; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        delete(arr, n, 3);
        System.out.print("After deletion: ");
        for (int i = 0; i < n[0]; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("Sonali Singh 24scse1010245");
    }
}
