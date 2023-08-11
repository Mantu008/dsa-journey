import java.util.Stack;

public class queuqusingtwostack {

      static void pushh(Stack<Integer>s1,int data){
            s1.push(data);
      }

      static void popp(Stack<Integer>s1,Stack<Integer>s2){
           while(!s1.empty()){
            s2.push(s1.pop());
           }

           int ans=s2.pop();

           while(!s2.empty()){
            s1.push(s2.pop());
           }

           System.out.println("pop element is:"+ans);
      }



      static void peekk(Stack<Integer>s1,Stack<Integer>s2){
             while(!s1.empty()){
            s2.push(s1.pop());
           }

           int ans=s2.peek();

           while(!s2.empty()){
            s1.push(s2.pop());
           }

           System.out.println("peek element is:"+ans);
      }


    public static void main(String[] args) {
        
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        

        System.out.println("implement queue using stack.......");

        pushh(s1, 1);
        pushh(s1, 2);
        pushh(s1, 3);
        pushh(s1, 4);
        pushh(s1, 5);

        System.out.println(s1);

        popp(s1, s2);
        System.out.println(s1);

        peekk(s1, s2);
        
   

 
    }
}
