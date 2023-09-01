import java.util.Stack;

public class revstack {

    public static void rev( Stack<Integer> s){
        //base condition...
         if(s.empty()==true){            
            return;
         }

         //Hypothesis
         int temp=s.peek();                  
         s.pop();
         rev(s);

         //induction step
         
         incert(s,temp);

   
      }

      public static void incert(Stack<Integer> s,int temp){
        if(s.empty()==true){
            s.push(temp);
            return;
        }

        int val=s.peek();
        s.pop();
        incert(s, temp);
        s.push(val);

      }

    public static void main(String[] args) {
    Stack<Integer> s=new Stack<>();
    Stack<Integer> st=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        rev(s);
        System.out.println(s);

    
    }
}
