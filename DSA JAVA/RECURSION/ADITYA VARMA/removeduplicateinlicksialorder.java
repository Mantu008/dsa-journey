import java.util.Stack;

public class removeduplicateinlicksialorder {

    public static void main(String[] args) {
     Stack<Character>st=new Stack<>();
     Stack<Character>st1=new Stack<>();  
     String ip="leetcode";

     char min = 'z';
      
     // find smallest alphabet
     for (int i=0; i<ip.length();i++)  { 
         if (ip.charAt(i) < min)
             min = ip.charAt(i);  
    }
    System.out.println(min);
    int minindex=ip.indexOf(min);

    for(int i=minindex;i<ip.length();i++){
         if(!st.contains(ip.charAt(i))){
                 st.push(ip.charAt(i));
         }
    }

    System.out.println(st);

    for(int i=0;i<minindex;i++){
         if(!st1.contains(ip.charAt(i))){
                 st1.push(ip.charAt(i));
         }
    }

    System.out.println(st1);

    while(!st.empty()){
             if(!st1.contains(st.peek())){
                  st1.push(st.pop());
             }
    }

    
    

      


     String op="";
    while(!st1.empty()){
       op=op+st1.peek();
       st1.pop();
    }




    System.out.println(op);



   

    
      
    }
}

