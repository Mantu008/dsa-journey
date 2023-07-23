import java.util.Stack;

public class deletemiddleelementfromstack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);

     int size=s.size();
     int top=size;
     int mid=size/2;
     int [] arr=new int[size];
     System.out.println("the size of the stack is:"+size);

      System.out.println(s);

      for(int i=top-1;i>=0;i--){
        arr[i]=s.pop();
      }
     
       

       

        // System.out.println("size of the stack is:"+s.size());

        // int mid=(s.size())/2;

        // while(!s.empty()){
        //     if()
        // }
    }
}
