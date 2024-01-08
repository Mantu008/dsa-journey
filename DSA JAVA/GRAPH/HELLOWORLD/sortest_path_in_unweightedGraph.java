import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class sortest_path_in_unweightedGraph {
  static int v = 0;
  static ArrayList<ArrayList<Integer>> adj;

  public static void main(String[] args) {
    v = 9;
    adj = new ArrayList<>();
    for (int i = 0; i < v; i++) {
      adj.add(new ArrayList<>());
    }
    addEdge(adj, 0, 1);
    addEdge(adj, 0, 3);
    addEdge(adj, 3, 4);
    addEdge(adj, 4, 5);
    addEdge(adj, 5, 6);
    addEdge(adj, 1, 2);
    addEdge(adj, 2, 6);
    addEdge(adj, 6, 7);
    addEdge(adj, 7, 8);
    addEdge(adj, 6, 8);

    Display();

    // bfs traversal
    ArrayList<Integer> bfsList = new ArrayList<>();
    int path[] = new int[v];
    // or use Arrays.fill(path,-1); inbult ,method
    for (int i = 0; i < v; i++) {
      path[i] = -1;
    }

    BFS(adj, bfsList, v, 0, path);
    System.out.println("bfs traversal is:-" + bfsList);

    System.out.println("sortest path of each node to source 0 is:-");
    for (int i = 0; i < path.length; i++) {
      System.out.print(path[i] + " ");
    }
  }

  public static void addEdge(ArrayList<ArrayList<Integer>> adj, int source, int dest) {
    adj.get(source).add(dest);
    adj.get(dest).add(source);
  }

  public static void Display() {
    for (int i = 0; i < v; i++) {
      System.out.print("Vertex " + i + ": ");
      for (int list : adj.get(i)) {
        System.out.print(list + " ");
      }
      System.out.println();
    }
  }

  public static void BFS(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> bfsList, int v, int sourse, int path[]) {
    boolean visited[] = new boolean[v];
    Queue<Integer> q = new ArrayDeque<>();
    visited[sourse] = true;
    path[sourse] = 0;
    q.offer(sourse);

    while (!q.isEmpty()) {
      int top = q.peek();
      q.poll();
      bfsList.add(top);

      for (int u : adj.get(top)) {
        if (visited[u] == false) {
          path[u] = path[top] + 1;
          visited[u] = true;
          q.offer(u);
        }
      }
    }
  }
}
