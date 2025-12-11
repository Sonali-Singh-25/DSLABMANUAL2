//question 3
 class q3 {

    static void add2D(int[][] a, int[][] b, int r, int c, int[][] res) {
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                res[i][j] = a[i][j] + b[i][j];
    }

    static void mul2D(int[][] a, int[][] b, int r1, int c1, int c2, int[][] res) {
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                res[i][j] = 0;
                for (int k = 0; k < c1; k++)
                    res[i][j] += a[i][k] * b[k][j];
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Sonali Singh 24scse1010245");

        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{7, 8, 9}, {10, 11, 12}};
        int[][] resAdd = new int[2][3];

        add2D(a, b, 2, 3, resAdd);

        System.out.println("Addition:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) System.out.print(resAdd[i][j] + " ");
            System.out.println();
        }

        int[][] x = {{1, 2}, {3, 4}};
        int[][] y = {{5, 6, 7}, {8, 9, 10}};
        int[][] resMul = new int[2][3];

        mul2D(x, y, 2, 2, 3, resMul);

        System.out.println("Multiplication:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) System.out.print(resMul[i][j] + " ");
            System.out.println();
        }
    }
}
