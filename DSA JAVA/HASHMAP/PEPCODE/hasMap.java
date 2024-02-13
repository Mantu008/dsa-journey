import java.util.HashMap;
import java.util.Set;

public class hasMap {
  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();

    map.put("India", 1);
    map.put("China", 5);
    map.put("Usa", 2);
    map.put("Canada", 11);
    map.put("France", 7);

    System.out.println(map);

    map.put("UK", 16);
    map.put("Usa", 55);

    System.out.println(map);

    System.out.println(map.get("India"));
    System.out.println(map.get("China"));
    System.out.println(map.get("Usa"));
    System.out.println(map.containsKey("China"));

    Set<String> keys = map.keySet();
    System.out.println(keys);

    for (String key : map.keySet()) {
      System.out.print(key + "->" + map.get(key) + " ");
    }

  }
}