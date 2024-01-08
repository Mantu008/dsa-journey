import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class check_if_two_string_is_equwelent {
  public static void main(String[] args) {
    
    String[] word1 = {"ab", "c"};
    String[] word2 = {"a", "bc"};
   
    String ans="";
    String ans1="";
   

     for(int i=0;i<word1.length || i<word2.length;i++){
        if(i<word1.length){
            ans=ans+word1[i];
        }
        if(i<word2.length){
            ans1=ans1+word2[i];
        }
     }

     System.out.println(ans+" "+ans1);

     if(ans.equals(ans1)){
        System.out.println("both are equewelent");
     }else{
          System.out.println("not equwelent");
     }    


  }
}
