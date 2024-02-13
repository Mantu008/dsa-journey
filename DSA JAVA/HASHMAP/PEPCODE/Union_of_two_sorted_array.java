import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Union_of_two_sorted_array {
  public static void main(String[] args) {
    int arr1[] = { 1, 2, 3, 4, 5 };
    int arr2[] = { 1, 2, 3 };
    HashMap<Integer, Integer> hm1 = new HashMap<>();
    ArrayList<Integer> ans = new ArrayList<>();

    for (int i = 0; i < arr1.length; i++) {
      hm1.put(arr1[i], hm1.getOrDefault(arr1[i], 0) + 1);
    }

    for (int i = 0; i < arr2.length; i++) {
      hm1.put(arr2[i], hm1.getOrDefault(arr2[i], 0) + 1);
    }

    for (int key : hm1.keySet()) {
      ans.add(key);
    }
    Collections.sort(ans);

    System.out.println(ans);

  }
}
