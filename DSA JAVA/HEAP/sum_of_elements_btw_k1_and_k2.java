import java.util.Collections;
import java.util.PriorityQueue;

public class sum_of_elements_btw_k1_and_k2 {
  public static PriorityQueue<Integer> maxHeap;

  public static void main(String[] args) {

    int arr[] = { 1, 3, 12, 5, 15, 11 };
    int k1 = 3;
    int k2 = 6;
    maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    int k1smallestelement = KthSmallestElement(arr, maxHeap, k1);
    maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    int k2smallestelement = KthSmallestElement(arr, maxHeap, k2);

    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > k1smallestelement && arr[i] < k2smallestelement) {
        sum += arr[i];
      }
    }

    System.out.println("sum btw k1 and k2 smallest element is:-" + sum);

  }

  public static int KthSmallestElement(int arr[], PriorityQueue<Integer> maxHeap, int k) {
    for (int i = 0; i < arr.length; i++) {
      maxHeap.add(arr[i]);
      if (maxHeap.size() > k) {
        maxHeap.poll();
      }
    }

    return maxHeap.peek();
  }
}