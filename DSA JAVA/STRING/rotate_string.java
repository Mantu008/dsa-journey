import java.util.Stack;

public class rotate_string {
public static void main(String[] args) {

  Stack<Character> st=new Stack<>();

    String str="abcde";
    String ans="";


    for(int i=0;i<str.length();i++){
        st.push(str.charAt(i));
    }


     System.out.println(st);

     while(!st.isEmpty()){
           ans=ans+st.pop();
     }

     System.out.println("the reverse string is:-["+ans+"]");
    



}
  
}