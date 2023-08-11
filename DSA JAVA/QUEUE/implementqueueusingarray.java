
public class implementqueueusingarray {


        static int count=0;
        static int front=0;
        static int rear=0;

    public static void push(int x,int arr[],int n){
        if(count==n){
            System.out.println("queue is full");
        }else{
            arr[rear%n]=x;
            rear++;
            count++;
            System.out.println("element push sucessfully in queue");
        }
    }

    public static void pop(int arr[],int n){
        if(count==0){
            System.out.println("stack is empty");
        }else{
             arr[front%n]=-1;
             front++;
             count--;
             System.out.println("element pop sucessfully from queue");
        }
    }

     public static void top(int arr[],int n){
         if(count==0){
            System.out.println("queue is empty");
        }else{
              
             System.out.println("top element of queue is:"+ arr[front%n]);
        }      
    }

    public static void display(int arr[],int n){

             for(int i=front;i<rear;i++){
                  System.out.println("arr["+i%n+"]="+arr[i%n]);
             }               
    }
    
   


    public static void main(String[] args) {
        
        //implement queue using array

        int n=5;
        int arr[]=new int[n];
      


    


        push(3, arr,n);
        push(2, arr,n);
        push(1, arr,n);
        push(8, arr,n);
        push(6, arr,n);
        push(7, arr,n);

        top(arr,n);
        pop(arr,n);
        top(arr,n);

       push(9, arr,n);

       pop(arr, n);
       push(17, arr, n);

       display(arr, n);




       



       




    }
    
}