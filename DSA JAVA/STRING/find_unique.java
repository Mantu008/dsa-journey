import java.util.LinkedList;
import java.util.Queue;

public class find_unique {
    public static void main(String[] args) {
        Queue<Character> q = new LinkedList<>();
        String str="aadadaad";
        String str1="";
        int p=-1;

        for(int i=0;i<str.length();i++){
               q.offer(str.charAt(i));
        }

      while(!q.isEmpty()){
          Character c=q.poll();  
            if(q.contains(c)){
                q.remove(c);
            }else{
                str1=str1+c;
                break;
            }
      }

 

         for(int i=0;i<str.length();i++){
            if(str1.length()==1){
                if(str.charAt(i)==str1.charAt(0)){
                       System.out.println("cherector:"+str.charAt(i));
                       System.out.println("index:-"+i);
                       p=i;
                       break;
                }
            }
         }

         if(p==-1){
              System.out.println("-1");
         }else{
            System.out.println(p);
         }

    
    }
}
