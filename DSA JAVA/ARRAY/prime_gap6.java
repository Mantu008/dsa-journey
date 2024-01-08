public class prime_gap6 {

    public static boolean prime(int n){
          for(int i=2;i<n-1;i++){
                 if(n%i==0){
                      return false;
                 }
          }
      return true;
    }
  public static void main(String[] args) {
       for(int i=2;i<=100;i++){
        if ( ((i+6)<100)&&prime(i) && prime(i+6)) {
          System.out.println(i+" " +(i+6));
          
        }
  }
}
}

