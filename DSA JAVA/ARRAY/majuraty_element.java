import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Arrays;

public class majuraty_element {
  public static void main(String[] args) {
      int arr[]={3,1,3,3,2};

      Arrays.sort(arr);
      if(arr[arr.length/2]!=arr[arr.length/2-1] || arr.length==1){
          System.out.println("invalid input");
      }

      System.out.println(arr[arr.length/2]);

      
  }
}
       