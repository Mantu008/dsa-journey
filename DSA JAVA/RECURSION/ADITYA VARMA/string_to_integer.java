public class string_to_integer {
    public static void main(String[] args) {
        String ip="00000-42a1234";
        String op="";
        ip=ip.trim();
        int n=ip.length();

        if (ip.isEmpty() || ip.charAt(1)=='1'){
         System.out.println("0");
         return;
        }

        char q=ip.charAt(0);
        if(Character.isLetter(q)){
           System.out.println("0");
           return;
        }
    
       for(int i=0;i<n;i++){
           char p=ip.charAt(i);
           if(p=='+' || p=='-' ){
                op=op+ip.charAt(i);
           } 

           if(p=='0'){
                continue;
           } 
            

           if(Character.isDigit(p)){
               op=op+ip.charAt(i); 
           }

           if(Character.isLetter(p) || p=='.'){
                break;
           }
       }

       System.out.println(op);


       long ans = Long.parseLong(op);

       if(ans > Integer.MAX_VALUE) {
           System.out.println(Integer.MAX_VALUE); // Handle overflow.
       } else if (ans < Integer.MIN_VALUE) {
           System.out.println(Integer.MIN_VALUE); // Handle underflow.
       }else{
               System.out.println((int)ans);
       }

        
    }
}
