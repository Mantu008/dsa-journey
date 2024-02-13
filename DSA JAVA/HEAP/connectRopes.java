import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class connectRopes {
  public static void main(String[] args) {

    long arr[] = { 1, 2, 3, 4, 5 };

    PriorityQueue<Long> minHeap = new PriorityQueue<>();
    int tCosst = 0;
    for (int i = 0; i < arr.length; i++) {
      minHeap.add(arr[i]);
    }

    while (minHeap.size() > 1) {
      long first = minHeap.poll();
      long second = minHeap.poll();
      long ans = first + second;
      tCosst += ans;
      minHeap.add(ans);
    }

    System.out.println("Totel minimum (Rope)cose is:-" + tCosst);

  }
}