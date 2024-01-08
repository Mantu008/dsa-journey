import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class ditect_cycle_in_undirected_graph {
   static int v=0;
   static int e=0;
   static ArrayList<ArrayList<Integer>>adj;
   static boolean ans=false;

  public static void main(String[] args) {
   v=5;
   adj=new ArrayList<>();
   for(int i=0;i<v;i++){
      adj.add(new ArrayList<>());
   }
   addEdge(adj, 4, 2);
   addEdge(adj, 1, 2);
   addEdge(adj, 2, 3);
   // addEdge(adj, 4, 3);
   // addEdge(adj, 3, 2);
   // addEdge(adj, 2, 0);

   Display();

   //dfs traversal
   DFS(adj,v);
   System.out.println("cycle present or not is:-"+ans);



  }

  public static void addEdge(ArrayList<ArrayList<Integer>>adj,int source,int dest){
       adj.get(source).add(dest);
       adj.get(dest).add(source);
  }

  public static void Display(){
      for (int i=0;i<v;i++) { 
        System.out.print("Vertex "+i+": ");
        for (int list:adj.get(i)) {
             System.out.print(list+" ");
        }
        System.out.println();
      }
  }

 public static void DFS(ArrayList<ArrayList<Integer>>adj,int v){
    boolean visited[]=new boolean[v];
       for(int i=0;i<v;i++){
          if(visited[i]==false){
            DFSRec(adj,i,visited,-1);
          }
       }

 }

 public static void DFSRec(ArrayList<ArrayList<Integer>>adj,int s,boolean []visited,int parent){
      visited[s]=true;
      for(int u:adj.get(s)){
         if(visited[u]==false){
          DFSRec(adj, u, visited,s);
         }else if(parent!=u){
            ans=true;
         }
      }
 }

}


