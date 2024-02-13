import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class top_k_frequent_number {
  public static class Pair {
    int key;
    int value;

    Pair(int key, int value) {
      this.key = key;
      this.value = value;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 1, 1, 2, 3, 2, 4 };
    int k = 2;

    PriorityQueue<Pair> minHeap = new PriorityQueue<>((a, b) -> a.value - b.value);

    Map<Integer, Integer> mp = new HashMap<>();

    for (int num : arr) {
      mp.put(num, mp.getOrDefault(num, 0) + 1);
    }

    for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
      minHeap.add(new Pair(entry.getKey(), entry.getValue()));
      if (minHeap.size() > k) {
        minHeap.poll();
      }
    }

    System.out.print("k frequent element is:-");

    while (!minHeap.isEmpty()) {
      System.out.print(minHeap.poll().key + " ");
    }
  }
}
