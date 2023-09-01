import java.util.Stack;

public class delitmiddleofstack {

      public static void solve( Stack<Integer> s,int k){
        //base condition...
         if(k==1){
            s.pop();                
            return;
         }

         //Hypothesis
         int val=s.peek();                  
         s.pop();
         k=k-1;
         solve(s, k);

         //induction step
         
         s.push(val);

   
      }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        int k=(s.size()/2)+1;
        solve(s,k);
        System.out.println(s);
   
    }
}
