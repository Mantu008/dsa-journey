import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 public class number_of_one_grator_then_one {
    public static void main(String[] args) {
        List<String> s=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter imput for subset operation:");
        int n=sc.nextInt();
        String op="";
        int ones=0;
        int zeros=0; 
        solve(n,ones,zeros,op,s);
        System.out.println(s);
    }

    public static void solve(int n,int ones,int zeros,String op,List<String> s){
             if(n==0){
                s.add(op);
                return;
             }
              
             if(op.length()==0){
                 op=op+"1";
                 ones++;
                 n--;
             }

                String op1=op;
                op1=op1+"1";
                solve(n-1,ones+1,zeros,op1,s);

             if(ones>zeros && (ones-zeros)>0){
                String op2=op;
                op2=op2+"0";
                solve(n-1,ones,zeros+1,op2,s);
             }

    }
}
