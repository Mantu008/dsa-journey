import java.util.Scanner;

public class string_is_palindrome {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("enter string:-");
      String str=sc.next();
      int i=0;
      int j=str.length()-1;
      boolean ispalindrome=true;
    
      while(i<=j){
          if(str.charAt(i)!=str.charAt(j)){
            ispalindrome=false;
            break;
          }else{
               i++;
               j--;
          }
      }

      System.out.println("is the given string is palindrom:-"+ispalindrome); 
         
    }
}
