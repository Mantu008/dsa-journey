// import java.util.Stack;


class stack{
 
    int []arr;
    int top;
    int size;

    stack(int size){
        this.size=size;
        arr=new int[size];
        top=-1;
    }

      void push(int element){
          if(size-top>1){
            top++;
            arr[top]=element;
            System.out.println("element is push sucessufully");
          }else{
            System.out.println("stack overflow");
          }
      }

      void pop(){
         if(top>=0 && top<size){
          top--;
          System.out.println("element is pop sucessufully");
         }else{
          System.out.println("stack underflow");
         }
      }
      void peak(){
         if(top>=0 && top<size){
             System.out.println("the top element of the given stack is:"+arr[top]);
         }else{
          System.out.println("stack is empty");
         }
      }
      void isEmpty(){
           if(top==-1){
              System.out.println("true");
           }else{
            System.out.println("false");
           }
      }

}

public class Stackimplantation {

    
    public static void main(String[] args) {
      //   Stack<Integer> s=new Stack<>();
      //   s.push(1);
      //   s.push(2);
      //   s.push(3);
      //   s.push(3);

      // System.out.println(s);

      // System.out.println("thestack is empty or not:"+s.isEmpty());

      // System.out.println("the stack size is:"+s.size());

      // System.out.println("the element on the top of the given stack is:"+s.peek());

      //  System.out.println(s.pop());

      stack s=new stack(5);

      s.push(5);
      s.push(3);
      s.push(9);
      s.push(6);
      s.push(88);
      s.push(89);
      s.peak();
      s.isEmpty();
      s.pop();
      s.peak();
      s.isEmpty();
      s.pop();
      s.peak();
      s.isEmpty();
      s.pop();
      s.peak();
      s.isEmpty();
      s.pop();


  
}

}
