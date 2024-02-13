import java.util.ArrayList;

public class intruduction {
  public static void main(String[] args) {
    int arr[] = { 2, 5, 1, 8, 2, 9, 1 };
    ArrayList<Integer> ans = new ArrayList<>();
    int n = 3;
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i];
    }

    ans.add(sum);

    for (int i = 0, j = n; j < arr.length; i++, j++) {
      sum += arr[j];
      sum = sum - arr[i];
      ans.add(sum);
    }

    int max = Integer.MIN_VALUE;

    for (int i = 0; i < ans.size(); i++) {
      if (max < ans.get(i)) {
        max = ans.get(i);
      }
    }

    System.out.println("The maximum  sum of subarray in the given array is:-" + max);

  }
}
