import java.util.Scanner;

public class stringpalindrome {
    public static String rev(String in,String op,int i){
         if(i<0){
            return op;
         }
          return rev(in,op+in.charAt(i),i-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String:");
        String in=sc.next();
        int i=in.length()-1;
        String op=rev(in,"",i);
        System.out.println(op);

        if(op.equals(in)){
               System.out.println("string is palindrome..");
        }else{
            System.out.println("string is not palindrome..");
        }
        


    }
}
