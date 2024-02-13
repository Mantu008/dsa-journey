import java.util.PriorityQueue;

public class kth_largest_element {
  public static void main(String[] args) {
    int arr[] = { 7, 10, 4, 3, 20, 15 };
    int k = 3;

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    for (int i = 0; i < arr.length; i++) {
      minHeap.add(arr[i]);
      if (minHeap.size() > k) {
        minHeap.poll();
      }
    }

    System.out.println(minHeap);

    // kth smallest element in the given max heap at the top of max heap...

    System.out.println("kth smallest element in the array is:-" + minHeap.peek());

  }
}
