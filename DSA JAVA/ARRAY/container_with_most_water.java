public class container_with_most_water {
  public static void main(String[] args) {
    int arr[]={1,8,6,2,5,4,8,3,7};

    int ans=max_water(arr);
    System.out.println("container with most water is:-"+ans);
  }

  public static int max_water(int arr[]){
    int ans=0;
    int l=0;
    int r=arr.length-1;

    while (l<=r) {
       ans=Math.max(ans,(r-l)*Math.min(arr[l], arr[r]));
       if(arr[l]<arr[r]){
           l++;
       }else{
          r--;
       }
    }
     
     return ans;
  }

}
