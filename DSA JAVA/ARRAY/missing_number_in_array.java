public class missing_number_in_array {
  public static void main(String[] args) {
      int n=5;
      int arr[]={1,2,3,5};

      int tsum=n*(n+1)/2;
      int cal_sum=0;

      for(int i=0;i<arr.length;i++){
         cal_sum+=arr[i];
      }

      System.out.println("missing number is:-"+(tsum-cal_sum));

  }
}


 