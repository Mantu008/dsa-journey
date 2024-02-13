import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Maximum_of_all_subarray_of_size_k {
  public static void main(String[] args) {

    // in thios code som time complixity error in the gfg scnerio

    int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
    // int arr[] = { 198, 2, 3, 2, 1, 0 };
    // int arr[] = { 1, 2, 3, 4, 5 };
    int N = arr.length;
    int k = 3;
    ArrayList<Integer> ans = new ArrayList<>();

    int i = 0;
    int j = 0;

    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

    while (j < N) {
      pq.add(arr[j]);
      if ((j - i + 1) < k) {
        j++;
      } else if ((j - i + 1) == k) {
        ans.add(pq.peek());
        pq.remove(arr[i]);
        i++;
        j++;
      }
    }

    System.out.println("the max amonf all subarray:-" + ans);

  }
}
