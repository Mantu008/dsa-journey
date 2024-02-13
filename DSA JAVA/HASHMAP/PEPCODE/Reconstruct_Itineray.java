import java.util.ArrayList;
import java.util.HashMap;

public class Reconstruct_Itineray {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    map.put("Chennai", "Banglore");
    map.put("Bombay", "Delhi");
    map.put("Goa", "Chennai");
    map.put("Delhi", "Goa");

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

    while (map.get(sp) != null) {
      ans.add(sp);
      sp = map.get(sp);
    }

    ans.add(sp); // one place is remaning at last so add this elelemt also

    System.out.println(ans);

  }
}
