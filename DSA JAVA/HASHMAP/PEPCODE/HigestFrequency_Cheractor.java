import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HigestFrequency_Cheractor {
  public static void main(String[] args) {
    Map<Character, Integer> hm = new TreeMap<>();
    String str = "testsample";

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (hm.containsKey(c)) {
        int of = hm.get(c);
        int nf = of + 1;
        hm.put(c, nf);
      } else {
        hm.put(c, 1);
      }
    }

    int max = 0;
    char ch = ' ';

    for (Map.Entry<Character, Integer> entry : hm.entrySet()) {

      if (entry.getValue() > max) {

        ch = entry.getKey();
        max = entry.getValue();
      }
    }

    System.out.println("the mex frequent cherector is:-" + ch);

  }
}
