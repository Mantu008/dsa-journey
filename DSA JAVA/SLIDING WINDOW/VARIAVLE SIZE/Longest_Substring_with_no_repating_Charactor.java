import java.util.HashMap;
import java.util.Map;

public class Longest_Substring_with_no_repating_Charactor {
  public static void main(String[] args) {

    String str = "aabacbebebe";
    int k = 3;

    Map<Character, Integer> map = new HashMap<>();

    int i = 0;
    int j = 0;
    int max = Integer.MIN_VALUE;

    while (j < str.length()) {
      map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0) + 1);
      if (map.size() < k) {
        j++;
      } else if (map.size() == k) {
        max = Math.max(max, (j - i + 1));
        j++;
      } else if (map.size() > k) {
        while (map.size() > k) {
          map.put(str.charAt(i), map.get(str.charAt(i)) - 1);
          if (map.get(str.charAt(i)) == 0) {
            map.remove(str.charAt(i));
          }
          i++;
        }
        j++;
      }
    }

    System.out.println("The largest substring with no repating charector is:-" + max);
  }
}
