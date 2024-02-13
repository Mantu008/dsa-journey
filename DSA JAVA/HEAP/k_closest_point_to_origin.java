import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class k_closest_point_to_origin {
  public static class Pair {
    int key;
    int value;

    Pair(int key, int value) {
      this.key = key;
      this.value = value;
    }
  }

  public static class heapPair {
    int key;
    Pair pair;

    heapPair(int key, Pair pair) {
      this.key = key;
      this.pair = pair;
    }
  }

  public static void main(String[] args) {
    int arr[][] = { { 1, 3 }, { -2, 2 }, { 5, 8 }, { 0, 1 } };
    int k = 2;

    PriorityQueue<heapPair> maxheap = new PriorityQueue<>((a, b) -> b.key - a.key);

    Map<Integer, Pair> mp = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      for (int j = 1; j < 2; j++) {
        int x = arr[i][0];
        int y = arr[i][1];
        int d = ((x * x) + (y * y));
        mp.put(d, new Pair(x, y));
      }
    }

    for (Map.Entry<Integer, Pair> entry : mp.entrySet()) {
      maxheap.add(new heapPair(entry.getKey(), new Pair(entry.getValue().key,
          entry.getValue().value)));
      if (maxheap.size() > k) {
        maxheap.poll();
      }
    }

    while (!maxheap.isEmpty()) {
      heapPair top = maxheap.poll();
      System.out.print(top.key + "[" + top.pair.key + " " + top.pair.value + "] ");
    }

  }
}
