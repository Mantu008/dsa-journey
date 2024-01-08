import java.util.ArrayList;
import java.util.List;

public class get_connected_component {
  static class Edge {
    int src;
    int nbr;
    int wt;

    Edge(int src, int nbr, int wt) {
      this.src = src;
      this.nbr = nbr;
      this.wt = wt;
    }
  }

  static boolean visited[];

  public static void main(String[] args) {

    int vrtx = 7; // 0,1,2,3,4,5,6
    ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
    for (int i = 0; i < vrtx; i++) {
      graph.add(new ArrayList<Edge>());
    }

    graph.get(0).add(new Edge(0, 1, 10));
    graph.get(1).add(new Edge(1, 0, 10));

    graph.get(2).add(new Edge(2, 3, 10));
    graph.get(3).add(new Edge(3, 2, 10));

    graph.get(4).add(new Edge(4, 5, 3));
    graph.get(4).add(new Edge(4, 6, 8));

    graph.get(5).add(new Edge(5, 4, 3));
    graph.get(5).add(new Edge(5, 6, 3));

    graph.get(6).add(new Edge(6, 5, 3));
    graph.get(6).add(new Edge(6, 4, 8));

    display(graph, vrtx);

    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    ArrayList<Integer> path = new ArrayList<>();
    DfS(graph, vrtx, ans, path);
    System.out.println("all connected component in the given graph is:-" + ans);

  }

  public static void DfS(ArrayList<ArrayList<Edge>> graph, int vrtx, ArrayList<ArrayList<Integer>> ans,
      ArrayList<Integer> path) {
    boolean visited[] = new boolean[vrtx];
    for (int i = 0; i < vrtx; i++) {
      if (!visited[i]) {
        getConnectedComponent(graph, i, path, vrtx, visited);
        ans.add(new ArrayList<>(path));
        path = new ArrayList<>();
      }
    }
  }

  public static void getConnectedComponent(ArrayList<ArrayList<Edge>> graph, int source, ArrayList<Integer> path,
      int vrtx, boolean visited[]) {

    visited[source] = true;
    path.add(source);
    for (Edge u : graph.get(source)) {
      if (!visited[u.nbr]) {
        getConnectedComponent(graph, u.nbr, path, vrtx, visited);
      }
    }
  }

  public static void display(ArrayList<ArrayList<Edge>> graph, int vrtx) {
    for (int i = 0; i < vrtx; i++) {
      System.out.print("Vertex " + i + " :");
      for (Edge u : graph.get(i)) {
        System.out.print(u.nbr + " ");
      }
      System.out.println();
    }
  }

}
