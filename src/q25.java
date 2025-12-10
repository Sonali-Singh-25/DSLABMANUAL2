//question 25
import java.util.Scanner;

 class DFSGraph {
    static final int MAX = 100;
    static int[][] adj = new int[MAX][MAX];
    static boolean[] visited = new boolean[MAX];
    static int n;

    static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int i = 0; i < n; i++) {
            if (adj[v][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sonali Singh 24scse1010245");
        System.out.print("Enter number of vertices: ");
        n = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u][v] = 1;
            adj[v][u] = 1;
        }
        System.out.print("Enter start vertex: ");
        int start = sc.nextInt();
        System.out.print("DFS traversal: ");
        dfs(start);
        System.out.println();
        sc.close();
    }
}
