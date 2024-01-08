import java.util.Arrays;

public class max_product_btw_two_element {
  public static void main(String[] args) {
    

      int arr[]={3,4,5,2};

      Arrays.sort(arr);      //first i am sort this array...

      //then after i am going go find max product...
      System.out.println((arr[arr.length-1])*(arr[arr.length-2]));


  }
}
