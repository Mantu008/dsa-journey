   class queue{

      int size;
      int front;
      int rear;
      int count;
      int arr[];

      queue(int size){
          this.size=size;
          arr=new int[size];
          int front=0;
          int rear=0;
          int count=0;
      }

      public void push(int x){
           if(count==size){
             System.out.println("overflow..");
           }else{
               arr[rear%size]=x;
               System.out.println(arr[rear%size]+":-is push sucessfully");
               rear++;
               count++; 
           }
      }

      public void pop(){
           if(count==0){
                System.out.println("underflow...");
           }else{
               System.out.println(arr[front%size]+":-is poped sucessfully");
               arr[front%size]=-1;
               front++;
               count--;
           }
      }

      public void peek(){
          if(count==0){
                System.out.println("underflow...");
           }else{
                System.out.println(arr[front%size]+":-is the top element..");
           }
      } 


      public void display(){
          System.out.println("displaying element:-");
          for(int i=front;i<rear;i++){
             System.out.println("arr["+i%size+"]="+arr[i%size]+" ");
          }
          System.out.println();
      }




  } 

public class circular_queue {
  public static void main(String[] args) {
    
    queue q=new queue(5);

    q.push(1);
    q.push(2);
    q.push(3);
    q.push(4);
    q.push(5);
    q.push(6);
    q.display();

    q.pop();
    q.display();
    q.push(7);

    q.display();
   

  }
}
