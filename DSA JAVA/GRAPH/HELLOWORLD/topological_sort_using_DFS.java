import java.util.ArrayList;
import java.util.Stack;

public class topological_sort_using_DFS {
  static int v = 0;
  static ArrayList<ArrayList<Integer>> adj;

  public static void main(String[] args) {
    v = 7;
    adj = new ArrayList<>();
    for (int i = 0; i < v; i++) {
      adj.add(new ArrayList<>());
    }

    addEdge(adj, 0, 3);
    addEdge(adj, 0, 1);
    addEdge(adj, 1, 2);
    addEdge(adj, 2, 3);
    addEdge(adj, 4, 3);
    addEdge(adj, 4, 5);
    addEdge(adj, 4, 6);
    addEdge(adj, 5, 6);

    Display(); // display the all graph

    // topological sort
    Stack<Integer> st = new Stack<>();
    int ans[] = new int[v];
    DFS(adj, v, st);
    System.out.println("topological sort in stack is:-" + st);

    for (int i = 0; i < v; i++) {
      ans[i] = st.peek();
      st.pop();
    }

    System.out.print("topological sort is:-");

    for (int i = 0; i < v; i++) {
      System.out.print(ans[i] + " ");
    }

  }

  public static void DFS(ArrayList<ArrayList<Integer>> adj, int v, Stack<Integer> st) {

    boolean visited[] = new boolean[v];

    for (int i = 0; i < v; i++) {
      if (!visited[i]) {
        topologicalSort(adj, i, visited, st);
      }
    }

  }

  public static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int source, boolean visited[],
      Stack<Integer> st) {
    visited[source] = true;
    for (int u : adj.get(source)) {
      if (!visited[u]) {
        topologicalSort(adj, u, visited, st);
      }
    }
    st.add(source);
  }

  public static void addEdge(ArrayList<ArrayList<Integer>> adj, int source, int dest) {
    adj.get(source).add(dest);
  }

  public static void Display() {
    for (int i = 0; i < v; i++) {
      System.out.print("Vertex " + i + ": ");
      for (int u : adj.get(i)) {
        System.out.print(u + " ");
      }

      System.out.println();
    }
  }
}
