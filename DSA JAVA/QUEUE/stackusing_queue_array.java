
public class  stackusing_queue_array{


        static int count=0;
        static int front=0;
        static int rear=0;

    public static void push(int x,int arr[],int n){
        if(count==n){
            System.out.println("stack is full");
        }else{
            arr[rear%n]=x;
            rear++;
            count++;
            System.out.println("element push sucessfully in stack");
        }
    }

    public static void display(int arr[],int n){

        for(int i=front;i<rear;i++){
             System.out.println("arr["+i%n+"]="+arr[i%n]);
        }               
}


     public static void stack(int arr[],int n,int arr2[]){
            int j=0;
             for(int i=rear-1;i>=front;i--,j++){
                  arr2[j]=arr[i%n];
             }               
    }



    public static void main(String[] args) {
        
        //implement array using queue

        int n=5;
        int arr[]=new int[n];
        int arr2[]=new int[5];
    


        push(3, arr,n);
        push(2, arr,n);
        push(1, arr,n);
        push(8, arr,n);
        push(6, arr,n);
       

        System.out.println("print queue");
        display(arr, n);

       stack(arr, n, arr2);
       
       System.out.println("stack using queue...");
       display(arr2, n);

      



       



       




    }
    
}