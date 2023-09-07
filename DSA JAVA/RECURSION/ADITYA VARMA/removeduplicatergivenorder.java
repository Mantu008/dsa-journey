import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

public class removeduplicatergivenorder {

    public static void main(String[] args) {
     ArrayList<Character> l=new ArrayList<>();   
     String ip="cbacdcbc";

     for(int i=0;i<ip.length();i++){
          if(!l.contains(ip.charAt(i))){
            l.add(ip.charAt(i)); 
          }
     }
   Collections.sort(l);
   
     String op="";
     for(int i=0;i<l.size();i++){
        op=op+l.get(i);
     }

     System.out.println(op);
    
      
    }
}
