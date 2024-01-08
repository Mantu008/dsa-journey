import java.util.Arrays;

public class minimum_spanning_tree {
  public static void main(String[] args) {
    int graph[][] = { { 0, 9, 75, 0, 0 }, { 9, 0, 95, 19, 42 }, { 75, 95, 0, 51, 66 }, { 0, 19, 51, 0, 31 },
        { 0, 42, 66, 31, 0 } };

    int V = graph.length;
    prims(graph, V);
  }

  public static void prims(int graph[][], int V) {
    boolean visited[] = new boolean[V];
    Arrays.fill(visited, false);
    int no_edge;
    int total = 0;
    no_edge = 0;
    visited[0] = true;

    System.out.println("Edge  : Weight");

    while (no_edge < V - 1) {

      int x = 0;
      int y = 0;
      int min = Integer.MAX_VALUE;

      for (int i = 0; i < V; i++) {
        if (visited[i] == true) {
          for (int j = 0; j < V; j++) {
            if (!visited[j] && (graph[i][j] != 0 || graph[j][i] != 0)) {
              if (min > graph[i][j]) {
                min = graph[i][j];
                x = i;
                y = j;
              }
            }
          }
        }
      }

      System.out.println(x + " --> " + y + " :  " + min);
      visited[y] = true;
      total += min;
      no_edge++;

    }

    System.out.println("total minimum weight cover by minimum spaning tree is:-" + total);

  }
}
