import java.util.Scanner;

public class n_fibbonacchinumber {
     public static int print(int n){
        if(n==0){
           return 0;
        }else if(n==1){
            return 1;
        }else{
          return print(n-1)+print(n-2);  
        }  
    }

     public static void  print_up_to_n(int n){
          for(int i=0;i<=n;i++){                                //this is a recursive function for fibbonacchi solution
             System.out.print(print(i)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n:-");
        int n=sc.nextInt();

        // int i=0;
        // int j=1;                                       //  this is simple ittration solution
        // System.out.print(i+" "+j+" ");
        // int p=2;            
        // while(p<n){
        //     int k=i+j;
        //     System.out.print(k+" ");
        //     i=j;
        //     j=k;
        //     p++;
        // }
  

        print_up_to_n(n);

        

      



    }
}
