import java.util.*;
public class subset {

    public static void solve(String ip,String op){
        if(ip.length()==0){
             System.out.print(op+" ");
             return;
        }
        String op1=op;
        String op2=op;
        op2=op2+ip.charAt(0);
        String input=ip;
        ip="";                   //here input is going to null
        StringBuilder sb = new StringBuilder(input);
        ip=ip+sb.deleteCharAt(0);
        solve(ip, op1);
        solve(ip, op2);  
    }
public static void main(String[] args) {
    
     Scanner sc=new Scanner(System.in);
     System.out.print("enter imput for subset operation:");
     String ip=sc.next();
     String op="";
     
     
    solve(ip,op);
    

    
}    
}