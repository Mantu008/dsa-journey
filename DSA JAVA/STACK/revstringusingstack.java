import java.util.Stack;
import java.util.*;

public class revstringusingstack {
public static void main(String[] args) {
    
    Stack<Character> s=new Stack<>();
  

     Scanner sc=new Scanner(System.in); 
     System.out.print("enter string:");
     String str=sc.next(); 
         

    for(int i=0;i<str.length();i++){
        s.push(str.charAt(i));
    }

    System.out.print("the reverced string is:");

    System.out.println("the size of the given stack is:"+s.size());

    String k="";
    while(!s.empty()){
         k=k+s.pop(); 
    }

    System.out.println(k);
    
}
    
}