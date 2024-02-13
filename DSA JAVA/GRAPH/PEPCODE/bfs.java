import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

import javax.management.Query;

public class bfs {
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
  static boolean ans;
  public static int parent[];

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

    // bfs traversal of a graph
    visited = new boolean[vrtx];
    parent = new int[vrtx];
    ArrayList<Integer> bfs = new ArrayList<>();
    BFS(graph, vrtx, visited, bfs);
    System.out.println("bfs traversal of given grpah is:-" + bfs);
    System.out.println("cycle detection in  the given graph is:-" + ans);

  }

  public static void BFS(ArrayList<ArrayList<Edge>> graph, int vrtx, boolean visited[], ArrayList<Integer> bfs) {
    for (int i = 0; i < vrtx; i++) {
      if (!visited[i]) {
        traverceBfs(graph, i, vrtx, visited, bfs);
      }
    }
  }

  public static void traverceBfs(ArrayList<ArrayList<Edge>> graph, int source, int vrtx, boolean visited[],
      ArrayList<Integer> bfs) {
    Queue<Integer> q = new ArrayDeque<>();
    q.add(source);
    visited[source] = true;
    while (!q.isEmpty()) {
      int top = q.poll();
      bfs.add(top);

      for (Edge u : graph.get(top)) {
        if (!visited[u.nbr]) {
          q.add(u.nbr);
          visited[u.nbr] = true;
          parent[u.nbr] = top;
        } else if (u.nbr != parent[top]) {
          ans = true;
        }
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
