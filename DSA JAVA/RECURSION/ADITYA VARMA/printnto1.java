public class printnto1 { 
    
    public static void print(int n){
          if(n==1){
               System.out.print(n+" ");
               return;
          }
           System.out.print(n+" ");
           print(n-1);
    }
   public static void main(String[] args) {
         //print 1 to n using recursion    
         print(10);    
    }
}