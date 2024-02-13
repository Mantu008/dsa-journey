import java.util.ArrayList;
import java.util.HashMap;

public class getCommonElement {
  public static void main(String[] args) {
    HashMap<Integer, Integer> hm1 = new HashMap<>();
    ArrayList<Integer> ans = new ArrayList<>();

    int arr1[] = { 1, 1, 2, 2, 2, 3, 5 };
    int arr2[] = { 1, 1, 1, 2, 2, 4, 5 };

    for (int i = 0; i < arr1.length; i++) {
      hm1.put(arr1[i], hm1.getOrDefault(arr1[i], 0) + 1);
    }

    for (int i = 0; i < arr2.length; i++) {
      if (hm1.containsKey(arr2[i])) {
        ans.add(arr2[i]);
        hm1.remove(arr2[i]);
      }
    }

    System.out.println("the array 2 element which is present in arr1:-" + ans);

  }
}