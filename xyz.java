import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class xyz {

    public static void main(String[] args) {
      String str ="race a car";
     
        System.out.println(isPalindrome(str));


        Stack<Integer> s=new Stack<>();
        List<Integer> i=new ArrayList<>();
        List<Integer> ni=new ArrayList<>();
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(4);
        i.add(5);
        System.out.println(i);

        for(int k=i.size()-1;k>=0;k--){
            ni.add(i.get(k));
        }

        System.out.println(ni);

        

      
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