import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class sortest_path_in_directed_asyaclic_graph {
  static int v = 0;
  public static ArrayList<ArrayList<Edge>> adj;

  // Edge class to represent edges with weights
  public static class Edge {
    int destination;
    int weight;

    Edge(int destination, int weight) {
      this.destination = destination;
      this.weight = weight;
    }
  }

  public static void main(String[] args) {
    v = 6;
    adj = new ArrayList<>();
    for (int i = 0; i < v; i++) {
      adj.add(new ArrayList<>());
    }

    addEdge(adj, 4, 5, 4);
    addEdge(adj, 4, 2, 2);
    addEdge(adj, 0, 4, 1);
    addEdge(adj, 0, 1, 2);
    addEdge(adj, 1, 2, 3);
    addEdge(adj, 2, 3, 6);
    addEdge(adj, 5, 3, 1);

    Display(); // display the all graph

    int ans[] = new int[v];
    Stack<Integer> st = new Stack<>();
    DFS(adj, v, st);

    for (int i = 0; i < v; i++) {
      ans[i] = st.pop();
    }

    System.out.print("topological sort is:-");

    for (int i = 0; i < v; i++) {
      System.out.print(ans[i] + " ");
    }

    System.out.println();

    System.out.print("Sortest path for each vertices in weighted graph..");

    int dist[] = new int[v];
    Arrays.fill(dist, Integer.MAX_VALUE);

    dist[0] = 0;
    for (int i = 0; i < v; i++) {
      for (Edge u : adj.get(i)) {
        if (dist[u.destination] > dist[i] + u.weight) {
          dist[u.destination] = dist[i] + u.weight;
        }
      }
    }

    for (int i = 0; i < v; i++) {
      System.out.print(dist[i] + " ");
    }

  }

  public static void DFS(ArrayList<ArrayList<Edge>> adj, int v, Stack<Integer> st) {
    boolean visited[] = new boolean[v];
    for (int i = 0; i < v; i++) {
      if (!visited[i]) {
        topologicalSort(adj, i, visited, st);
      }
    }
  }

  public static void topologicalSort(ArrayList<ArrayList<Edge>> adj, int source, boolean visited[],
      Stack<Integer> st) {
    visited[source] = true;
    for (Edge u : adj.get(source)) {
      if (!visited[u.destination]) {
        topologicalSort(adj, u.destination, visited, st);
      }
    }
    st.push(source); // Use st.push() instead of st.add()
  }

  public static void addEdge(ArrayList<ArrayList<Edge>> adj, int source, int dest, int weight) {
    adj.get(source).add(new Edge(dest, weight));
  }

  public static void Display() {
    for (int i = 0; i < v; i++) {
      System.out.print("Vertex " + i + ": ");
      for (Edge u : adj.get(i)) {
        System.out.print(u.destination + " ");
      }

      System.out.println();
    }
  }
}
