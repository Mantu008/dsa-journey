import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class revqueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> st=new Stack<>();

        q.offer(4);
        q.offer(3);
        q.offer(1);
        q.offer(10);
        q.offer(2);
        q.offer(6);

         while(!q.isEmpty()){
            st.push(q.poll());
         }

          while(!st.empty()){
            q.offer(st.pop());
         }


         System.out.println(q);


    }
}
