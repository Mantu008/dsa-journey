import java.util.ArrayList;
import java.util.List;

public class check_graph_connected {
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

    graph.get(0).add(new Edge(0, 3, 40));
    graph.get(0).add(new Edge(0, 1, 10));

    graph.get(1).add(new Edge(1, 0, 10));
    graph.get(1).add(new Edge(1, 2, 10));

    graph.get(2).add(new Edge(2, 3, 10));
    graph.get(2).add(new Edge(2, 1, 10));

    graph.get(3).add(new Edge(3, 0, 40));
    graph.get(3).add(new Edge(3, 2, 10));
    graph.get(3).add(new Edge(3, 4, 2));

    graph.get(4).add(new Edge(4, 3, 2));
    graph.get(4).add(new Edge(4, 5, 3));
    graph.get(4).add(new Edge(4, 6, 8));

    graph.get(5).add(new Edge(5, 4, 3));
    graph.get(5).add(new Edge(5, 6, 3));

    graph.get(6).add(new Edge(6, 5, 3));
    graph.get(6).add(new Edge(6, 4, 8));

    display(graph, vrtx);

    // check connection..

    visited = new boolean[vrtx];
    int source = 0;
    int count = 0;
    for (int i = 0; i < vrtx; i++) {
      if (!visited[i]) {
        count++;
        checkConnection(graph, source, visited, vrtx);
      }
    }

    if (count == 1) {
      System.out.println("the given graph is a connected graph");
    } else {
      System.out.println("given graph is not a connected graph");
    }

  }

  public static void checkConnection(ArrayList<ArrayList<Edge>> graph, int source, boolean visited[], int vrtx) {

    visited[source] = true;
    for (Edge u : graph.get(source)) {
      if (!visited[u.nbr]) {
        checkConnection(graph, u.nbr, visited, vrtx);
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
