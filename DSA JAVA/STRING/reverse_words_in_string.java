public class reverse_words_in_string {
  public static void main(String[] args) {
    
      String s="  my name is mantu     ";
      String ans="";
      for(int i=0;i<s.length();i++){
        StringBuffer sb=new StringBuffer();
           while(i<s.length() && s.charAt(i)!=' ') {
                sb.append(s.charAt(i));
                i++;
           }

           if(sb.length()!=0){
               ans=" "+sb+ans;
           }
      }

      System.out.println(ans.substring(1));

  }
}
