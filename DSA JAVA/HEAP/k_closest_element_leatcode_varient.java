import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class k_closest_element_leatcode_varient {
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
    int k = 4;
    int x = 3;

    PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a, b) -> b.key == a.key ? (a.value - b.value) : (b.key - a.key));
    for (int i = 0; i < arr.length; i++) {
      if (maxHeap.size() == 0) {
        maxHeap.add(new Pair(Math.abs(arr[i] - x), arr[i]));
      } else {
        if (maxHeap.size() == k && maxHeap.peek().key == Math.abs(arr[i] - x)) {
          continue;
        } else {
          maxHeap.add(new Pair(Math.abs(arr[i] - x), arr[i]));
        }
      }
      if (maxHeap.size() > k) {
        maxHeap.poll();
      }
    }

    int ans[] = new int[k];
    int idx = 0;
    while (!maxHeap.isEmpty()) {
      ans[idx++] = maxHeap.poll().value;
    }

    Arrays.sort(ans);

    for (int i = 0; i < k; i++) {
      System.out.print(ans[i] + " ");
    }
  }
}
