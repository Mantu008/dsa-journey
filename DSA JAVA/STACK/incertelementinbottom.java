import java.util.Stack;

public class incertelementinbottom {

    static void addbottom(int element){

       Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        int size=s.size();
        int arr[]=new int[size];

        System.out.println("the element present in stack is:"+s);
 
        while(!s.empty()){
            arr[size-1]=s.pop();
            size--;
       }

       if(s.isEmpty()){
            s.push(element);
       }

       System.out.println("the incerted element on the bottom is:"+s);

       for(int i=0;i<arr.length;i++){
          s.push(arr[i]);
       }
         
           System.out.println("the whole stack after incerting element on the bottom:"+s);
     } 
    public static void main(String[] args) {
       

        
     
       addbottom(9);

       addbottom(343);







      

    }
}
