import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class spread_infection {
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

    // check infection

    int source = 6;
    int t = 3;
    ArrayDeque<pair> q = new ArrayDeque<>();
    visited = new int[vrtx];
    Arrays.fill(visited, 0);
    int count = 0;
    q.add(new pair(source, 1));

    while (q.size() > 0) {
      pair top = q.removeFirst();

      if (visited[top.v] > 0) {
        continue;
      }

      visited[top.v] = top.time;

      if (top.time > t) {
        break;
      }

      count++;

      for (Edge u : graph.get(top.v)) {
        if (visited[u.nbr] == 0) {
          q.add(new pair(u.nbr, top.time + 1));
        }
      }

    }

    System.out.println("total infected persion is:-" + count);

  }

  public static class pair {
    int v;
    int time;

    pair(int v, int time) {
      this.v = v;
      this.time = time;
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
