import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class frequancy_sort {
  public static class Pair {
    int key;
    int value;

    Pair(int key, int value) {
      this.key = key;
      this.value = value;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };

    PriorityQueue<Pair> maxHeap = new PriorityQueue<>(
        (a, b) -> a.value != b.value ? b.value - a.value : a.key - b.key);

    Map<Integer, Integer> mp = new HashMap<>();

    for (int num : arr) {
      mp.put(num, mp.getOrDefault(num, 0) + 1);
    }

    for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
      maxHeap.add(new Pair(entry.getKey(), entry.getValue()));
    }

    System.out.print("k frequent element is:-");

    while (!maxHeap.isEmpty()) {
      for (int i = 0; i < maxHeap.peek().value; i++) {
        System.out.print(maxHeap.peek().key + " ");
      }

      maxHeap.poll();

    }
  }
}
