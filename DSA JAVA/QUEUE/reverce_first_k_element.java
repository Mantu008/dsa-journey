import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverce_first_k_element {

    public static void rev(Stack<Integer> st,Queue<Integer> q,Queue<Integer> q1,int k){

        int i=0;
         while(!q.isEmpty()){
            if(i<k){
                st.push(q.poll());
            }else{
                q1.offer(q.poll());
            }
            i++;
         }

          while(!st.empty()){
                   q.offer(st.pop()); 
         }

            while(!q1.isEmpty()){
                   q.offer(q1.poll()); 
         }

    }
public static void main(String[] args) {
     
    Stack<Integer> st=new Stack<>();
    Queue<Integer> q=new LinkedList<>();
    Queue<Integer> q1=new LinkedList<>();
    int k=3;

     q.offer(1);
     q.offer(2);
     q.offer(3);
     q.offer(4);
     q.offer(5);  

     rev(st,q,q1,k);



     // printing value of queue after revercing  to K element.........
       
     System.out.println("the queue is:"+q);


}   

}