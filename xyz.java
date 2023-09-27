import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

public class xyz {

    public static void main(String[] args) {
      String str ="race a car";
     
        System.out.println(isPalindrome(str));

      
    }

    public static boolean isPalindrome(String str){
            str= str.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
            int i=0;
            int j=str.length()-1;

            while(i<=j){
                 if(str.charAt(i)!=str.charAt(j)){
                      return false;
                 }

                 i++;
                 j--;
            }


            return true;
    }
}