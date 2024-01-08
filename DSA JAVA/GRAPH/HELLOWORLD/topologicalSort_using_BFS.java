import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class topologicalSort_using_BFS {
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

    int ans[] = new int[v];
    int indegree[] = new int[v];
    for (int i = 0; i < v; i++) {
      for (int u : adj.get(i)) {
        indegree[u]++;
      }
    }
    System.out.print("indegree of each node is:-");
    for (int i = 0; i < indegree.length; i++) {
      System.out.print(indegree[i] + " ");
    }

    topologicalSort(adj, ans, indegree);
    System.out.println();

    System.out.print("topological sort is:-");

    for (int i = 0; i < v; i++) {
      System.out.print(ans[i] + " ");
    }

  }

  public static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int ans[], int indegree[]) {

    Queue<Integer> q = new ArrayDeque<>();
    for (int i = 0; i < indegree.length; i++) {
      if (indegree[i] == 0) {
        q.add(i);
      }
    }

    int pos = 0;

    while (!q.isEmpty()) {
      int top = q.peek();
      q.poll();
      ans[pos++] = top;

      for (int u : adj.get(top)) {
        indegree[u]--;
        if (indegree[u] == 0) {
          q.add(u);
        }
      }
    }

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
