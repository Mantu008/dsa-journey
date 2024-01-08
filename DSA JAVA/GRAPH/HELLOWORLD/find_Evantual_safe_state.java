import java.util.ArrayList;
import java.util.List;

public class find_Evantual_safe_state {
  static int v = 0;
  static List<List<Integer>> adj;

  public static void main(String[] args) {

    int[][] graph = { { 1, 2 }, { 2, 3 }, { 5 }, { 0 }, { 5 }, {}, {} };
    adj = new ArrayList<>();
    v = graph.length;
    for (int i = 0; i < v; i++) {
      adj.add(new ArrayList<>());
    }

    for (int i = 0; i < v; i++) {
      for (int j = 0; j < graph[i].length; j++) {
        adj.get(i).add(graph[i][j]);
      }
    }
    System.out.println();

    Display();

    // find evantitual safe state..
    boolean presentCycle[] = new boolean[v];

    DFS(adj, v, presentCycle);
    System.out.print("the evantitual safe states is:-");
    for (int i = 0; i < presentCycle.length; i++) {
      if (presentCycle[i] == false) {
        System.out.print(i + " ");
      }
    }

  }

  public static void DFS(List<List<Integer>> adj, int v, boolean presentCycle[]) {
    boolean visited[] = new boolean[v];
    boolean dfsVisited[] = new boolean[v];

    for (int i = 0; i < v; i++) {
      if (!visited[i]) {
        cycle(adj, i, visited, dfsVisited, presentCycle);
      }
    }

  }

  public static boolean cycle(List<List<Integer>> adj, int source, boolean visited[], boolean dfsVisited[],
      boolean presentCycle[]) {
    visited[source] = true;
    dfsVisited[source] = true;

    for (int u : adj.get(source)) {
      if (!visited[u]) {
        if (cycle(adj, u, visited, dfsVisited, presentCycle)) {
          return presentCycle[source] = true;
        }
      } else if (visited[u] == true && dfsVisited[u] == true) {
        return presentCycle[source] = true;
      }

    }

    dfsVisited[source] = false;
    return false;
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
}
