import java.util.HashMap;

public class valid_anagram {
public static void main(String[] args) {
    String s1="mantu";
    String s2="namtu";
    boolean ans=solve(s1,s2);
    System.out.println("this is anagram or not:-"+ans);
}

  public static boolean solve(String s1,String s2){
   HashMap<Character,Integer> m=new HashMap<>();

   for(int i=0;i<s1.length();i++){
      char ch=s1.charAt(i);
      m.put(ch,m.getOrDefault(ch,0)+1);
   }

   for(int i=0;i<s2.length();i++){
      char ch=s2.charAt(i);
      
      if(m.containsKey(ch)==false){
           return false;
      }else if(m.get(ch)==1){
          m.remove(ch);
      }else{
        m.put(ch,m.get(ch)-1);
      }
   }
     return m.size()==0;
  }

}
