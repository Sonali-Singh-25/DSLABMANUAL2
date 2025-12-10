//question 11
 class FirstLastOccurrence {

    public static void main(String[] args) {
        System.out.println("Sonali Singh 24SCSE1010245");
        int n = 8, x = 15, first = -1, last = -1;
        int[] arr = {5, 10, 15, 15, 20, 25, 30, 15};

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                first = i;
                break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == x) {
                last = i;
                break;
            }
        }

        System.out.println(first + " " + last);
    }
}
