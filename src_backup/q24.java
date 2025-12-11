//question 24
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

 class GraphBFS {
    static int MAX = 100;
    static int[][] adj = new int[MAX][MAX];
    static boolean[] visited = new boolean[MAX];
    static int n;

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");
            for (int i = 0; i < n; i++) {
                if (adj[v][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Sonali Singh 24SCSE1010245");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of vertices: ");
            n = sc.nextInt();
            System.out.print("Enter number of edges: ");
            int edges = sc.nextInt();

            System.out.println("Enter edges (u v):");
            for (int i = 0; i < edges; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                adj[u][v] = adj[v][u] = 1;
            }

            System.out.print("Enter start vertex: ");
            int start = sc.nextInt();

            System.out.print("BFS traversal: ");
            bfs(start);
        }
        System.out.println();
    }
}
