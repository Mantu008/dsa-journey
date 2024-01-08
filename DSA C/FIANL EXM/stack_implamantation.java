
 class stack{

       int arr[];
       int top;
       int size;
   
       stack(int size){
            this.size=size;
            arr=new int[size];
            int top=-1;
       }


     public void push(int x){
         if(top>=size){
           System.out.println("stack overflow");
         }else{
          top++;
          arr[top]=x;
          System.out.println(arr[top]+":is push sucessfully..");  
         }
     }

     public void pop(){
          if(top==-1){
              System.out.println("stack underflow");
          }else{
             System.out.println(arr[top]+":is pop sucessfully..");
             top--;
          }
     }

     public void peak(){
         if(top==-1){
           System.out.println("stack underflow");
         }else{
              System.out.println(arr[top]+":-is the top element");
         }
     }


     public void display(){
            System.out.println("stack element is:-");
          for(int i=0;i<=top;i++){
              if(arr[i]!=0){
                System.out.print(arr[i]+" ");
              }
          }
     }

   
 }

public class stack_implamantation {
  public static void main(String[] args) {
    
      stack s= new stack(5);
      s.push(1);
      s.push(2);
      s.push(3);
      s.peak();
       s.pop();

      s.display();
    

  }
}
