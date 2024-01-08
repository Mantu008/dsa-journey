import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class chech_path {
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
    graph.get(4).add(new Edge(4, 6, 3));

    graph.get(5).add(new Edge(5, 4, 3));
    graph.get(5).add(new Edge(5, 6, 3));

    graph.get(6).add(new Edge(6, 5, 3));
    graph.get(6).add(new Edge(6, 4, 8));

    display(graph, vrtx);

    int source = 0;
    int dest = 6;

    // check if path exist or not..

    visited = new boolean[vrtx];
    boolean isPathPrasent = isPath(graph, source, dest, vrtx, visited);
    System.out.println("path exectience is:-" + isPathPrasent);

    // print all path...
    System.out.println("all path of " + source + "->" + dest + " is:-");
    visited = new boolean[vrtx];
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    path.add(source);
    addAllPaths(graph, source, dest, vrtx, visited, path, ans);
    // System.out.println(ans);

  }

  public static void addAllPaths(ArrayList<ArrayList<Edge>> graph, int source, int dest, int vrtx, boolean visited[],
      List<Integer> path, List<List<Integer>> ans) {

    if (source == dest) {
      ans.add(new ArrayList<>(path));
      System.out.println(path);
      return;
    }

    visited[source] = true;

    for (Edge u : graph.get(source)) {
      if (!visited[u.nbr]) {
        path.add(u.nbr);
        addAllPaths(graph, u.nbr, dest, vrtx, visited, path, ans);
        path.remove(path.size() - 1);
      }
    }

    visited[source] = false;

  }

  public static boolean isPath(ArrayList<ArrayList<Edge>> graph, int source, int dest, int vrtx, boolean visited[]) {
    if (source == dest) {
      return true;
    }
    visited[source] = true;
    for (Edge u : graph.get(source)) {
      if (!visited[u.nbr]) {
        boolean haspath = isPath(graph, u.nbr, dest, vrtx, visited);
        if (haspath == true) {
          return true;
        }
      }
    }

    return false;

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
