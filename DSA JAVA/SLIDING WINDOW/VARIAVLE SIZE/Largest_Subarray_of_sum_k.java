import java.util.ArrayList;

public class Largest_Subarray_of_sum_k {
  public static void main(String[] args) {
    int arr[] = { 4, 1, 1, 1, 2, 3, 5 };
    int k = 5;

    ArrayList<Integer> ans = new ArrayList<>();

    int i = 0;
    int j = 0;
    long sum = 0;
    int max = 0;

    while (j < arr.length) {
      sum += arr[j];
      if (sum < k) {
        j++;
      } else if (sum == k) {
        max = (j - i + 1);
        ans.add(max);
        j++;
      } else if (sum > k) {
        while (sum > k) {
          sum -= arr[i];
          i++;
          if (sum == k) {
            max = (j - i + 1);
            ans.add(max);
          }
        }
        j++;
      }

    }

    System.out.println(ans);
  }
}
