import java.util.HashMap;

public class find_duplicate_in_array {
  public static void main(String[] args) {

    int arr[] = { 1, 2, 3, 4, 7, 5 };
    HashMap<Integer, Integer> hm = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
    }

    for (int key : hm.keySet()) {
      if (hm.get(key) > 1) {
        System.out.println("duplicate element is present in the given array");
        return;
      }
    }

    System.out.println("duplicate element is not present in the given array");

  }
}