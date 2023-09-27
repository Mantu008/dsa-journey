import java.util.Scanner;

public class basic {
     public static void print_name_n_time(int n){
         if(n==1){                                   //base condition
            System.out.print("mantu"+" ");   
            return;
         }
         System.out.print("mantu"+" ");                //induction step
         print_name_n_time(n-1);                       //hypothesis step
         
     }

     public static void print_1to_n(int n){  
        if(n==1){                               //base condition
           System.out.print(n+" ");
           return;
        } 
        print_1to_n(n-1);                         //hypthesis step
        System.out.print(n+" ");                  //induction step
     }

      public static void print_nto_1(int n){  
        if(n==1){                               //base condition
           System.out.print(1+" ");
           return;
        } 
        System.out.print(n+" ");                  //induction step
        print_nto_1(n-1);                         //hypthesis step
     }  

    
     public static int print_sum_of_1to_n(int n){
            if(n==0){                                            //base condition                       
               return 0;
           } 
    
     return n+print_sum_of_1to_n(n-1);
                                
     }

      public static int factrioal_of_n(int n){
            if(n==1){                                            //base condition                       
               return 1;
           } 
    
       return n*factrioal_of_n(n-1);
                                
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n:-");
        int n=sc.nextInt();

        print_name_n_time(n);                //call recursion function for print_name_n_time
        System.out.println();

        print_1to_n(n);                      //call recursion function print_1to_n

        System.out.println();
        
        print_nto_1(n);                      //call recursion function print_nto_1

        System.out.println();

        int sum=print_sum_of_1to_n(n);              //call recursion function print_sum_of_1to_n
        System.out.println("sum of n natural number is:-"+sum);

        int fact=factrioal_of_n(n);                 //call recursion function for factriol
        System.out.println("factriol of given number is:-"+fact);





    }
}
