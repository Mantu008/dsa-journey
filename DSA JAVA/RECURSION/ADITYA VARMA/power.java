public class power {
    public static double pow(double x,int n){
       if(n==0){
          return 1.0;
       }
       double ans=pow(x, n-1);
       double ans1=x*ans;
       return ans1;
    }
    public static void main(String[] args) {
        double x=2.00000;
        int n=2;
        double p= pow(x,n);
        System.out.println(p);
    }
}
