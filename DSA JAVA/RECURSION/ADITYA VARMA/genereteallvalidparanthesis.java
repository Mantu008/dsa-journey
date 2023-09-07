import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class genereteallvalidparanthesis {
    public static void main(String[] args) {
        List<String> s=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter imput for subset operation:");
        int ip=sc.nextInt();
        String op="";
        int open=ip;
        int close=ip; 
        solve(open,close,op,s);
        System.out.println(s);
    }

    public static void solve(int open,int close,String op,List<String> s){
             if(open==0 && close==0){
                    s.add(op);
                    return;
             }

             if(open!=0){
                String op1=op;
                op1=op1+"(";
                solve(open-1, close, op1,s);
             }

             if(close>open){
                String op2=op;
                op2=op2+")";
                solve(open,close-1,op2,s);
             }

    }
}
