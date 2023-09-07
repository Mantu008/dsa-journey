import java.util.*;
public class parmutationwithcasechenge {

    public static void solve(String ip,String op,List<String> s){
        if(ip.length()==0){
           s.add(op);
           return;
        }

        String c="";
        c=c+ip.charAt(0);
       char z=c.charAt(0);
        if(!Character.isDigit(z)){
            String op1=op;
            String op2=op;
            op1=op1+c.toLowerCase();
            op2=op2+c.toUpperCase();
            String input=ip;
            ip="";                   //here input is going to null for removing first index element
            StringBuilder sb = new StringBuilder(input);
            ip=ip+sb.deleteCharAt(0);

            solve(ip, op1,s);
            solve(ip, op2,s); 
        }else{
             String op1=op;
             op1=op1+c;
             String input=ip;
             ip="";                   //here input is going to null for removing first index element
             StringBuilder sb = new StringBuilder(input);
             ip=ip+sb.deleteCharAt(0);
             solve(ip, op1, s);
        }
    
    }
public static void main(String[] args) {
    // HashSet<String> s = new LinkedHashSet<>();
    List<String> s=new ArrayList<>();
     Scanner sc=new Scanner(System.in);
     System.out.print("enter imput for subset operation:");
     String ip=sc.next();
     String op="";
    solve(ip,op,s);
    // p.addAll(s); 

    System.out.println(s);
    

    
}    
}