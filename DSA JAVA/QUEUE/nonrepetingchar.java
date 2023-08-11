import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class nonrepetingchar {

    public static void   nonrep(Map<Character,Integer> count,Queue<Character> q,char []A ,int n,String ans){
          
        for(int i=0;i<n;i++){
            char ch=A[i];

            int p=count.get(ch);
            p++;
            count.equals('a');

             count.put(ch, p);
             q.offer(ch);

             while(!q.isEmpty()){
                  if(count.get(q.peek())>1){
                        q.poll();
                  }else{
                          ans=ans+q.peek();
                          break;
                  }
             }

             if(q.isEmpty()){
                ans=ans+'#';
             }
        }
        
        
      }
    public static void main(String[] args) {
         char []A={'a','a','b','c'};
         int n=A.length;
        Map<Character,Integer> count=new LinkedHashMap<>();
        Queue<Character> q=new LinkedList<>();
        String ans="";

        nonrep(count, q, A, n,ans);


        // System.out.println(ans);

        System.out.println(count);









        // count.put('a', 1);

        // System.out.println(count);

        // int p=count.get('a');
        // p++;

        //  count.put('a', p);

        //   System.out.println(count);

        




    }
}
