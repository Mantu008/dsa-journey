import java.util.ArrayList;
import java.util.HashMap;

public class Reconstrucr_intenryLeetcode {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();

    // map.put("Chennai", "Banglore");
    // map.put("Bombay", "Delhi");
    // map.put("Goa", "Chennai");
    // map.put("Delhi", "Goa");

    // arr = [["MUC","LHR"],["JFK","MUC"],["SFO","SJC"],["LHR","SFO"]] //this is
    // leetcode input

    ArrayList<ArrayList<String>> arr = new ArrayList<>();

    for (int i = 0; i < 4; i++) {
      arr.add(new ArrayList<>());
    }

    arr.get(0).add("MUC");
    arr.get(0).add("LHR");
    arr.get(1).add("JFK");
    arr.get(1).add("MUC");
    arr.get(2).add("SFO");
    arr.get(2).add("SJC");
    arr.get(3).add("LHR");
    arr.get(3).add("SFO");

    System.out.println(arr);

    // fill this input in map

    for (int i = 0; i < arr.size(); i++) {
      String src = arr.get(i).get(0);
      String dest = arr.get(i).get(1);
      map.put(src, dest);
    }

    System.out.println(map);

    HashMap<String, Boolean> nm = new HashMap<>();

    for (String src : map.keySet()) {
      String dest = map.get(src);
      nm.put(dest, false);
      if (nm.containsKey(src) == false) {
        nm.put(src, true);
      }
    }

    String sp = "";

    for (String key : nm.keySet()) {
      if (nm.get(key) == true) {
        sp = key;
        break;
      }
    }

    ArrayList<String> ans = new ArrayList<>();

    while (true) {
      if (map.containsKey(sp)) {
        ans.add(sp);
        sp = map.get(sp);
      } else {
        ans.add(sp);
        break;
      }
    }

    System.out.println(ans);

  }
}
