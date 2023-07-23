import java.util.Stack;

public class validparanthitis {
    public static void main(String[] args) {

        Character []c={'[',']','{','}'};

      Stack<Character>s=new Stack<>();

      for(int i=0;i<c.length;i++){

        char ch=c[i];

        if(ch=='(' ||ch=='{'||ch=='['){
                 s.push(ch);
        }else{
            if(!s.empty()){
                char top=s.peek();

                if( ch==')' && top=='(' || ch=='}' && top=='{' || ch==']' && top=='['){
                  s.pop();
                }else{
                        break;
                }
            }else{
               break;
            }
            
        }
      }

      if(!s.empty()){
           System.out.println("not valid paranthesis");
      }else{
        System.out.println("valid paranthesis");
      }

      
    }
}
