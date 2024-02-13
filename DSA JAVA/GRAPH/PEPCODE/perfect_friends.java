import java.util.ArrayList;

public class perfect_friends {
  public static class Edge {
    int src;
    int nbr;

    Edge(int src, int nbr) {
      this.src = src;
      this.nbr = nbr;
    }
  }

  static boolean visited[];

  public static void main(String[] args) {

    int vrtx = 7;
    ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

    for (int i = 0; i < vrtx; i++) {
      graph.add(new ArrayList<>());
    }

    graph.get(0).add(new Edge(0, 1));
    graph.get(1).add(new Edge(1, 0));
    graph.get(2).add(new Edge(2, 3));
    graph.get(3).add(new Edge(3, 2));
    graph.get(4).add(new Edge(4, 5));
    graph.get(5).add(new Edge(5, 4));
    graph.get(5).add(new Edge(5, 6));
    graph.get(6).add(new Edge(6, 5));
    graph.get(4).add(new Edge(4, 6));
    graph.get(6).add(new Edge(6, 4));

    Display(graph, vrtx);

    // get all connected graph...

    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    ArrayList<Integer> path = new ArrayList<>();
    visited = new boolean[vrtx];
    for (int i = 0; i < vrtx; i++) {
      if (!visited[i]) {
        DFS(graph, i, vrtx, visited, ans, path);
        ans.add(new ArrayList<>(path));
        path = new ArrayList<>();
      }
    }

    System.out.println("all connected graph is:-" + ans);

    // find perfect friends count where each are not from same componene (it mins
    // each from diiferent component)

    int count = 0;

    for (int i = 0; i < ans.size(); i++) {
      for (int j = i + 1; j < ans.size(); j++) {
        count += ans.get(i).size() * ans.get(j).size();
      }
    }

    System.out.println("the count of perfect frends where each are from different component:" + count);

  }

  public static void DFS(ArrayList<ArrayList<Edge>> graph, int source, int vrtx, boolean Vertex[],
      ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> path) {
    visited[source] = true;
    path.add(source);
    for (Edge u : graph.get(source)) {
      if (!visited[u.nbr]) {
        DFS(graph, u.nbr, vrtx, Vertex, ans, path);
      }
    }
  }

  public static void Display(ArrayList<ArrayList<Edge>> graph, int vrtx) {

    for (int i = 0; i < vrtx; i++) {
      System.out.print("Vertex " + i + " : ");
      for (Edge u : graph.get(i)) {
        System.out.print(u.nbr + " ");
      }
      System.out.println();
    }

  }

}