import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.*;

public class all_lth_largest_elements {
  public static void main(String[] args) {
    int arr[] = { 12, 5, 787, 1, 23 };
    int k = 2;

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    for (int i = 0; i < arr.length; i++) {
      minHeap.add(arr[i]);
      if (minHeap.size() > k) {
        minHeap.poll();
      }
    }

    int ans[] = new int[minHeap.size()];
    ArrayList<Integer> ans1 = new ArrayList<>();

    for (int i = ans.length - 1; i >= 0; i--) {
      ans[i] = minHeap.peek();
      ans1.add(minHeap.peek());
      minHeap.poll();
    }

    System.out.print("all kth largest elements via array is:-");
    for (int i = 0; i < ans.length; i++) {
      System.out.print(ans[i] + " ");
    }

    System.out.println();

    System.out.print("all kth largest elements via arraylist is:-" + ans1);

  }
}
