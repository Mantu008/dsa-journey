import java.util.ArrayList;
import java.util.List;

public class all_operation_of_path {
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

    int source = 0;
    int dest = 6;

    // check if path exist or not..

    visited = new boolean[vrtx];
    boolean isPathPrasent = isPath(graph, source, dest, vrtx, visited);
    System.out.println("path exectience is:-" + isPathPrasent);

    // print all path...
    System.out.println("all path of " + source + "->" + dest + " is:-");
    visited = new boolean[vrtx];
    addAllPaths(graph, source, dest, vrtx, visited, source + "");

    System.out.println("all opration");
    visited = new boolean[vrtx];
    allOp(graph, source, dest, vrtx, visited, source + "", 0);
    printAllOp();

  }

  public static void addAllPaths(ArrayList<ArrayList<Edge>> graph, int source, int dest, int vrtx, boolean visited[],
      String psf) {

    if (source == dest) {
      System.out.println(psf);
      return;
    }

    visited[source] = true;

    for (Edge u : graph.get(source)) {
      if (!visited[u.nbr]) {
        addAllPaths(graph, u.nbr, dest, vrtx, visited, psf + u.nbr);
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

  static String spath;
  static Integer spathwt = Integer.MAX_VALUE;
  static String lpath;
  static Integer lpathwt = Integer.MIN_VALUE;
  static String cpath;
  static Integer cpathwt = Integer.MAX_VALUE;
  static String fpath;
  static Integer fpathwt = Integer.MIN_VALUE;

  public static void printAllOp() {
    System.out.println("smallest path :- " + spath + "@" + spathwt);
    System.out.println("smallest path :- " + lpath + "@" + lpathwt);
    System.out.println("smallest path :- " + cpath + "@" + cpathwt);
    System.out.println("smallest path :- " + fpath + "@" + fpathwt);
  }

  public static void allOp(ArrayList<ArrayList<Edge>> graph, int source, int dest, int vrtx, boolean visited[],
      String psf, int wsf) {

    if (source == dest) {

      if (wsf < spathwt) {
        spathwt = wsf;
        spath = psf;
      }

      if (wsf > lpathwt) {
        lpathwt = wsf;
        lpath = psf;
      }

      if (wsf > 40 && wsf < cpathwt) {
        cpathwt = wsf;
        cpath = psf;
      }

      if (wsf < 40 && wsf > fpathwt) {
        fpathwt = wsf;
        fpath = psf;
      }

      return;
    }

    visited[source] = true;

    for (Edge u : graph.get(source)) {
      if (!visited[u.nbr]) {
        allOp(graph, u.nbr, dest, vrtx, visited, psf + u.nbr, wsf + u.wt);
      }
    }

    visited[source] = false;

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
