import java.util.ArrayList;
import java.util.List;

public class largest_odd_number_in_string {
public static void main(String[] args) {
  
      String str="12345";    
      int ans=Integer.MIN_VALUE;

      

      for(int i=0;i<str.length();i++){
         String b=""+str.charAt(i);

         if (ans<=Integer.parseInt(b) && Integer.parseInt(b)%2!=0) {
              ans=Integer.parseInt(b);
         }
         
      }

      System.out.println(ans);

      

}
  
}