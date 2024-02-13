import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class kth_smallest_element {
  public static void main(String[] args) {
    int arr[] = { 7, 10, 4, 3, 20, 15 };
    int k = 3;

    PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

    for (int i = 0; i < arr.length; i++) {
      maxheap.add(arr[i]);
      if (maxheap.size() > k) {
        maxheap.poll();
      }
    }

    System.out.println(maxheap);

    // kth smallest element in the given max heap at the top of max heap...

    System.out.println("kth smallest element in the array is:-" + maxheap.peek());

  }
}
