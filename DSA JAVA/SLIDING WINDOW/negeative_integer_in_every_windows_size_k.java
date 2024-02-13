import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class negeative_integer_in_every_windows_size_k {
  public static void main(String[] args) {

    int arr[] = { 1, 2, 12, -1, -7, 8, -15, 30, 16, 28 };
    int k = 3;
    ArrayList<Integer> ans = new ArrayList<>();

    int i = 0;
    int j = 0;
    Queue<Integer> list = new ArrayDeque<>();

    while (j < arr.length) {
      if (arr[j] < 0) {
        list.add(arr[j]);
      }

      if ((j - i + 1) < k) {
        j++;
      } else if ((j - i + 1) == k) {
        if (list.size() == 0) {
          ans.add(0);
        } else {
          ans.add(list.peek());
          if (list.peek() == arr[i]) {
            list.poll();
          }
        }
        i++;
        j++;
      }
    }

    System.out.println(ans);

  }

}

// this is brotfource approch:-

// ArrayList<Integer> ans = new ArrayList<>();
// int min = 0;
// for (int i = 0; i <= arr.length - k; i++) {
// for (int j = i; j < i + k; j++) {
// if (arr[j] < 0) {
// min = arr[j];
// break;
// }
// }
// ans.add(min);
// min = 0;
// }

// System.out.println(ans);