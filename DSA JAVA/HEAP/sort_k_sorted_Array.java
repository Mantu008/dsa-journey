import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class sort_k_sorted_Array {
  public static void main(String[] args) {
    int arr[] = { 50, 24, 43 };
    int k = 1;
    ArrayList<Integer> ans = new ArrayList<>();

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    for (int i = 0; i < arr.length; i++) {
      minHeap.add(arr[i]);
      if (minHeap.size() > k) {
        ans.add(minHeap.poll());
      }
    }

    while (minHeap.size() > 0) {
      ans.add(minHeap.poll());
    }

    System.out.println("sort k sorted array:-" + ans);

  }
}