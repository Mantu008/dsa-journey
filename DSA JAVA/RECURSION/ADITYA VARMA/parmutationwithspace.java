import java.util.*;
public class parmutationwithspace {

    public static void solve(String ip,String op){
        if(ip.length()==0){
             System.out.print("("+op+")");
             return;
        }

        if(op.length()==0){
         op=op+ip.charAt(0);
         String input=ip;
         ip="";                   //here input is going to null
         StringBuilder sb = new StringBuilder(input);
         ip=ip+sb.deleteCharAt(0);
        }


        String op1=op;
        String op2=op;
        op1=op+" "+ip.charAt(0);
        op2=op+ip.charAt(0);
        String input=ip;
        ip="";                   //here input is going to null
        StringBuilder sb = new StringBuilder(input);
        ip=ip+sb.deleteCharAt(0);
        solve(ip, op1);
        solve(ip, op2);  
        return;
    }
public static void main(String[] args) {
    
     Scanner sc=new Scanner(System.in);
     System.out.print("enter imput for subset operation:");
     String ip=sc.next();
     if(ip.length()==1){
       System.out.print("("+ip+")");
       return;
     }
     String op="";
     
     
    solve(ip,op);
    

    
}    
}