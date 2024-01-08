import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class check_path_exist_or_not {
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

    boolean isPathPrasent = isPath(graph, 0, 6, vrtx);
    System.out.println("path exectience is:-" + isPathPrasent);

  }

  // here i am apply bfs algorithm for checking if path is presnt or not..

  public static boolean isPath(ArrayList<ArrayList<Edge>> graph, int source, int dest, int vrtx) {
    boolean visited[] = new boolean[vrtx];
    Queue<Integer> q = new ArrayDeque<>();
    q.offer(source);
    visited[source] = true;
    while (!q.isEmpty()) {
      int top = q.poll();

      if (top == dest) {
        return true;
      }

      for (Edge u : graph.get(top)) {
        if (!visited[u.nbr]) {
          visited[u.nbr] = true;
          q.offer(u.nbr);
        }
      }
    }

    // or i can return false because i am reac at the end but be didnot get top
    // equal to dest it mins dest is not present in the graph or not path between
    // sourcr and dest

    return visited[dest];
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
