import java.util.Stack;

public class reverce_string {

      public static void rev(char s[],int n,Stack<Character> st){
        for(int i=s.length-1;i>=0;i--){
            st.push(s[i]);
          }
      }
public static void main(String[] args) {
     
    char s[]={'h','e','l','l','o'};
    int n=s.length;
    Stack<Character> st=new Stack<>();

    rev(s, n, st);


      System.out.println(st);

}
    
}