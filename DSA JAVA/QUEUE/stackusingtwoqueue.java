import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stackusingtwoqueue {

 
    static void pushh(Queue<Integer>q1,Queue<Integer>q2,int data){

               while(!q1.isEmpty()){
                q2.offer(q1.poll());
               }
            

             q1.offer(data);

            while(!q2.isEmpty()){
                q1.offer(q2.poll());
               }      
            
      }

      static void popp(Queue<Integer>q1,Queue<Integer>q2){

           System.out.println("pop element is:"+q1.poll());
      }



      static void peekk(Queue<Integer>q1,Queue<Integer>q2){

           System.out.println("peek element is:"+q1.peek());
      }

    public static void main(String[] args) {
        
       Queue<Integer> q1=new LinkedList<>();
       Queue<Integer> q2=new LinkedList<>();

    

       pushh(q1, q2, 1);
       pushh(q1, q2, 2);
       pushh(q1, q2, 3);
       pushh(q1, q2, 4);
       pushh(q1, q2, 5);
    

       System.out.println(q1);

       peekk(q1, q2);
       popp(q1, q2);

       peekk(q1, q2);

       System.out.println(q1);





      
    
    }
}
