public class max_sum_subarray_of_size_k {
  public static void main(String[] args) {
    int arr[] = { 2, 5, 1, 8, 2, 9 };
    int k = 3;

    int i = 0;
    int j = 0;
    int sum = 0;
    int max = Integer.MIN_VALUE;
    while (j < arr.length) {
      sum += arr[j];

      if ((j - i + 1) < k) {
        j++;
      } else if ((j - i + 1) == k) {
        max = Math.max(max, sum);
        sum -= arr[i];
        i++;
        j++;
      }
    }

    System.out.println("the max sum subarray of size k is:-" + max);
  }
}
