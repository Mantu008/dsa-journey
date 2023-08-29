public class print1ton { 
    
    public static void print(int n){
          if(n==1){
               System.out.print(n+" ");
               return;
          }
           print(n-1);
           System.out.print(n+" ");
    }
   public static void main(String[] args) {
         //print 1 to n using recursion    
         print(10);    
    }
}