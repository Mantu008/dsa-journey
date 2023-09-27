public class longest_valid_string {
public static void main(String[] args) {
     String strs[]={"flower","flow","flight"};
     String res=strs[0];
     for(int i=1;i<strs.length;i++){
         res=common(res,strs[i]);
     }
     System.out.println("the longest common prifix is:-"+res);

}  
public static String common(String s1,String s2){
    StringBuffer res=new StringBuffer();
    int n=s1.length()<s2.length()?s1.length():s2.length();
    for(int i=0;i<n;i++){
         if(s1.charAt(i)==s2.charAt(i)){
                 res.append(s1.charAt(i));
         }else{
            break;
         }
    }
      return res.toString();
}

}