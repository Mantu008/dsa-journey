public class find_first_occrance {
    public static void main(String[] args) {
        
        String s1="mississippi";
        String s2="issip";


       int i=0;

       while(i<s1.length()){
             if(s1.charAt(i)==s2.charAt(0)){
                    break;
             }
             i++;
       }

       int index=i;
       int j=0;
      while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                  i++;
                  j++;
            }else{
                break;
            }
      }

    
      if(j==s2.length()){
             System.out.println(index);
      }else{
        System.out.println(-1);
      }
        


    }
}
