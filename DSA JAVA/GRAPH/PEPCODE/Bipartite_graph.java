import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class Bipartite_graph {
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

  static int visited[];

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
    graph.get(4).add(new Edge(4, 6, 3));

    graph.get(5).add(new Edge(5, 4, 3));
    graph.get(5).add(new Edge(5, 6, 3));

    graph.get(6).add(new Edge(6, 5, 3));
    graph.get(6).add(new Edge(6, 4, 8));

    display(graph, vrtx);
    // check bipartite
    visited = new int[vrtx];
    Arrays.fill(visited, -1);
    for (int i = 0; i < vrtx; i++) {
      if (visited[i] == -1) {
        boolean isBipartite = check_Bipartite(graph, i, visited);
        if (isBipartite == false) {
          System.out.println(false);
          return;
        }
      }
    }

    System.out.println(true);

  }

  public static boolean check_Bipartite(ArrayList<ArrayList<Edge>> graph, int source, int[] visited) {

    ArrayDeque<pair> q = new ArrayDeque<>();
    q.add(new pair(source, source + "", 0));

    while (!q.isEmpty()) {
      pair top = q.removeFirst();

      if (visited[top.v] != -1) {
        if (top.lavel != visited[top.v]) {
          return false;
        }
      } else {
        visited[top.v] = top.lavel;
      }

      for (Edge u : graph.get(top.v)) {
        if (visited[u.nbr] == -1) {
          q.add(new pair(u.nbr, top.psf + u.nbr, top.lavel + 1));
        }
      }
    }

    return true;
  }

  public static class pair {
    int v;
    String psf;
    int lavel;

    pair(int v, String psf, int lavel) {
      this.v = v;
      this.psf = psf;
      this.lavel = lavel;
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
