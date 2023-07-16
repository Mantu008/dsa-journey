import java.util.Scanner;

public class replacevowel {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);

        System.out.print("enter string:");
         String str1=sc.nextLine();
         System.out.println("the string before removing vowel:"+str1);

         String str2="";

         str2=str1.replaceAll("[aeiouAEIOU]", "");

         System.out.println("string after removing vowel:"+str2);

    }
    
}
