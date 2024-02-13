import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;

public class Count_Occurences_of_anagram {
  public static void main(String[] args) {

    String str1 = "aabaabaa";
    String str2 = "aaba";

    HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < str2.length(); i++) {
      map.put(str2.charAt(i), map.getOrDefault(str2.charAt(i), 0) + 1);
    }

    int ans = 0;
    int count = map.size();
    int i = 0;
    int j = 0;
    int k = str2.length();

    while (j < str1.length()) {

      if (map.containsKey(str1.charAt(j))) {
        map.put(str1.charAt(j), map.get(str1.charAt(j)) - 1);
        if (map.get(str1.charAt(j)) == 0) {
          count--;
        }
      }

      if ((j - i + 1) < k) {
        j++;
      } else if ((j - i + 1) == k) {

        if (count == 0) {
          ans++;
        }

        if (map.containsKey(str1.charAt(i))) {
          map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
          if (map.get(str1.charAt(i)) == 1) {
            count++;
          }
        }

        i++;
        j++;
      }
    }

    System.out.println("Count of anagram occarance:-" + ans);

  }

}