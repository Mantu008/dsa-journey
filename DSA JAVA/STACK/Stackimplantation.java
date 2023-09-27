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

      public  void display(){
             for(int i=0;i<=top;i++){
                  System.out.print(arr[i]+" ");
             }
      }

}

public class Stackimplantation {

    
    public static void main(String[] args) {
    
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
      
      s.display();



      


  
}

}
