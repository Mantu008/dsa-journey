public class lengthoflastwords {
    public static void main(String[] args) {
        
        String s="   fly me   to   the moon  ";

        System.out.println(s);

        int j=0;
        int k=s.length()-1;
        
        if(s.charAt(k)==' '){
            while(s.charAt(k)==' '){
                  k--;
            }
        }

        for(int i=k;i>=0;i--){
                if(s.charAt(i)==' '){
                       break;
                }
                j++;
        }

        System.out.println("length is:"+j);

    }
}
