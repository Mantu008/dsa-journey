import java.util.Arrays;

public class max_product_btw_two_pair {
  public static void main(String[] args) {
    
    int arr[]={5,6,2,7,4};

    Arrays.sort(arr);

    int ans=((arr[arr.length-1])*(arr[arr.length-2]))-((arr[0])*(arr[1]));
    System.out.println(ans);

  }
}
