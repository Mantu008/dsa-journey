import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class path_excestance {
   static int v=0;
   static int e=0;
   static ArrayList<ArrayList<Integer>>adj;

  public static void main(String[] args) {
   v=6;
   adj=new ArrayList<>();
   for(int i=0;i<v;i++){
      adj.add(new ArrayList<>());
   }
   addEdge(adj, 0, 1);
   addEdge(adj, 0, 2);
   addEdge(adj, 3, 5);
   addEdge(adj, 5, 4);
   addEdge(adj, 4, 3);

   Display();

   //bfs traversal
   ArrayList<Integer> bfsList=new ArrayList<>();
   findBfs(adj, bfsList, v, 0,2);
   System.out.println(bfsList);

   //find path

   boolean ans=findPath(adj, 0, 5);
   System.out.println("fath exectance is:-"+ans);

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
  
  

  public static void BFS(ArrayList<ArrayList<Integer>>adj,ArrayList<Integer> bfsList,int v,int sourse,boolean visited[]){
      Queue<Integer> q=new ArrayDeque<>();
      visited[sourse]=true;
      q.offer(sourse);
      
      while (!q.isEmpty()) {
         int top=q.peek();
         q.poll();
         bfsList.add(top);

         for(int l:adj.get(top)){
             if(visited[l]==false){
                visited[l]=true;
                q.offer(l);
             }
         }
      }
    
  }


  public static void findBfs(ArrayList<ArrayList<Integer>>adj,ArrayList<Integer> bfsList,int v,int sourse,int dest){
         boolean visited[]=new boolean[v];
           for(int i=0;i<v;i++){
               if(visited[i]==false){
                  BFS(adj, bfsList, v, i,visited);
               }

           }
         
  }

  public static boolean findPath(ArrayList<ArrayList<Integer>>adj,int source,int dest){
    boolean visited[]=new boolean[v];
       Queue<Integer>q=new ArrayDeque<>();
       q.offer(source);
       visited[source]=true;

       while(!q.isEmpty()){
         int top=q.peek();
         q.poll();

         for(int l:adj.get(top)){
             if(visited[l]==false){
                 visited[l]=true;
                 q.offer(l);
             }
         }
       }

       if(visited[dest]){
         return true;
       }else{
         return visited[dest];
       }

  }

}
