import java.util.Stack;

public class min_stack_withextraspace {

     static void pussh(int x,Stack<Integer>s,Stack<Integer>ss){
          
          s.push(x);
          
          if(ss.size()==0 || s.peek()<=ss.peek()){
                 ss.push(x);
          }

          System.out.println("push element sucessfully");
        
     }



     static int poop(Stack<Integer>s,Stack<Integer>ss){
        if(s.size()==0){
            return -1;
        }else{       
            int ans=s.pop();

            if(ss.peek()==ans){
                ss.pop();
            }
            return ans;
        }
          
     }



     static int getminelement(Stack<Integer>ss){

          if(ss.size()==0){
            return -1;
          }else{
            return ss.peek();
          }

           
     }
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        Stack<Integer>ss=new Stack<>();

        int arr[]={18,19,29,15,16};
       



        pussh(512, s, ss);
        pussh(-1024, s, ss);
        pussh(-1024, s, ss);
        pussh(512, s, ss);

        System.out.println(s);
        System.out.println(ss);

     
     

       int p=poop(s, ss);
       System.out.println("this is pop element of this given stack:"+p);
 
       int m=getminelement(ss);
       System.out.println("this is min element of thr given stack:"+m);
       

       System.out.println(s);
       System.out.println(ss);


          

    }
}