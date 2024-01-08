import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class remove_duplacate {
public static void main(String[] args) {
       String s="zvvo";
       Queue<Character> q=new ArrayDeque<>();

       for(int i=0;i<s.length();i++){
            if(!q.contains(s.charAt(i))){
                  q.offer(s.charAt(i));
            }
       }

         System.out.println(q);


         String ans="";
         
         while (!q.isEmpty()) {
              ans+=q.poll();
         }

       System.out.println(ans);

    
}
  
}