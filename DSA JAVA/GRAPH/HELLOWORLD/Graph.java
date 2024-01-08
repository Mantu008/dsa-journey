import java.util.ArrayList;

public class Graph{
   static int v=0;
   static int e=0;

   static ArrayList<ArrayList<Integer>> adj;
   
    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int source,int dest){
        adj.get(source).add(dest);
        adj.get(dest).add(source);  
   }

   public static void printGraph() {
    for (int i = 0; i <= v; i++) {
        System.out.print("Vertex " + i + ": ");
        for (int neighbor :adj.get(i)) {
            System.out.print(neighbor + " ");
        }
        System.out.println();
    }
}
    
  public static void main(String[] args) {
    
     v=5;
     e=10;
    adj=new ArrayList<>();
    for(int i=0;i<=v;i++){
         adj.add(new ArrayList<>());
    }

     addEdge(adj, 3, 1);
     addEdge(adj, 2, 4);
     addEdge(adj, 3, 2);
     addEdge(adj, 5, 0);
     printGraph();

    

  }   

}
