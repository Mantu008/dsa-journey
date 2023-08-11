import java.util.Stack;

public class minstack_withconstant_space {

    static long  minelement;

     static void pussh( long x,Stack<Long>s){
         if(s.size()==0){
               s.push(x);
               minelement=x;
         }else{
            if(x>=minelement){
                 s.push(x);
            }else if(x<minelement){
               s.push((2*x-minelement));
               minelement=x;
            }
         }
          System.out.println("push element sucessfully");  
     }

     static long poop(Stack<Long>s){
        
            if(s.size()==0){
                 return -1;
            }else{
                 if(s.peek()>=minelement){
                     return s.pop();
                 }else if(s.peek()<minelement){
                      minelement=2*minelement-s.peek();
                       return s.pop();
                    }
                 }
                 return -2;
            }
         
     static long getminelement(Stack<Long>s){
         if(s.size()==0){
            return -1;
         }else{
             return minelement;
         }  
   }


    static long top(Stack<Long>s){
          
        if(s.size()==0){
            return -1;
        }else{
            if(s.peek()>=minelement){
                return s.peek();
            }else if(s.peek()<minelement){
                return minelement;
            }
            return -2;
        }
   }
        
     
    public static void main(String[] args) {

        Stack<Long>s=new Stack<>();


//         ["MinStack","push","push","push","top","pop","getMin","pop","getMin","pop","push","top","getMin","push","top","getMin","pop","getMin"]
// [[],[2147483646],[2147483646],[2147483647],[],[],[],[],[],[],[2147483647],[],[],[-2147483648],[],[],[],[]]
  
     
   pussh(2147483647, s);
   System.out.println("stack is:"+s);
   long t= top(s);
   System.out.println("top element is:"+t);
    System.out.println("min element is:"+minelement);

    pussh(-2147483648, s);
    System.out.println("stack is:"+s);
    t= top(s);
    System.out.println("top element is:"+t);
    System.out.println("min element is:"+minelement);
    long p=poop(s);
    System.out.println("pop element is:"+p);
     System.out.println("min element is:"+minelement);



         


          

    }
     
}
