//question 4
 class MaxMin {

    static void max_min(int[] arr, int n, int[] max, int[] min) {
        max[0] = arr[0];
        min[0] = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max[0]) max[0] = arr[i];
            if (arr[i] < min[0]) min[0] = arr[i];
        }
    }

    public static void main(String[] args) {
        System.out.println("Sonali Singh 24scse1010245");

        int[] arr = {10, 2, 30, 4, 50};
        int n = 5;
        int[] max = new int[1];
        int[] min = new int[1];

        max_min(arr, n, max, min);

        System.out.println("Max: " + max[0] + " Min: " + min[0]);
    }
}
