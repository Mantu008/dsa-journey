import java.util.HashMap;
import java.util.Map;

public class firstnon_repating {
  public static void main(String[] args) {
       String str="mantu";
       Map<Character,Integer>map=new HashMap<>();

       for(Character c:str.toCharArray()){
             map.put(c,map.getOrDefault(c,0)+1);
       }

       for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(map.get(ch)==1){
                System.out.println(i);
                break;
            }
       }

  }
}
