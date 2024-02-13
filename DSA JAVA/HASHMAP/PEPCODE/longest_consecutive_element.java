import java.util.Arrays;
import java.util.HashMap;

public class longest_consecutive_element {
  public static void main(String[] args) {
    int arr[] = { 100, 4, 200, 1, 3, 2 };
    HashMap<Integer, Boolean> hm = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      hm.put(arr[i], true);
    }

    for (int i = 0; i < arr.length; i++) {
      if (!hm.containsKey(arr[i] - 1)) {
        hm.put(arr[i], true);
      } else {
        hm.put(arr[i], false);
      }
    }

    System.out.println(hm);

    int idx = 0;
    int arr1[] = new int[hm.size()];
    for (int key : hm.keySet()) {
      arr1[idx++] = key;
    }

    Arrays.sort(arr1);

    int ans = 0;
    int pans = 0;

    for (int i = 0; i < arr1.length; i++) {
      if (hm.get(arr1[i]) == true) {
        if (ans < pans) {
          ans = pans;
        }
        pans = 0;
        System.out.println();
      }
      pans++;
      System.out.print(arr1[i] + " ");
    }

    System.out.println();

    ans = ans > pans ? ans : pans;

    System.out.println("Loangest consucetive sequence is:-" + ans);

  }
}