import java.util.Stack;

public class removealladjecentduplicate {

   public static void remove_all_duplicate(Stack<Character> st,String s,int n){
            for(int i=0;i<n;i++){
                 if(st.empty()==true){
                  st.push(s.charAt(i));
             }else if(st.peek()==s.charAt(i)){
                    st.pop();
             }else{
                  st.push(s.charAt(i));
             }
            }
    }
    public static void main(String[] args) {
         Stack<Character> st=new Stack<>();
         Stack<Character> st1=new Stack<>();
         String s="abbaca";
         int n=s.length();

        remove_all_duplicate(st, s, n);
        
        String op="";
        while(!st.empty()){
              st1.push(st.pop());
        }

         while(!st1.empty()){
              op=op+st1.pop();
        }


        System.out.println(op);


    }
}
