public class find_pivit_index {
  public static void main(String[] args) {
    int arr[]={-1,-1,0,1,1,0};
    int index=search(arr);

    System.out.println("the pivit index is:- "+index);
  }
  public static int search(int arr[]){

    int sum=0;

    for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
    }

    int lsum=0;
    int rsum=sum;

     for(int i=0;i<arr.length;i++){

         rsum=rsum-arr[i];

          if(lsum==rsum){
             return i;
          }

          lsum=lsum+arr[i];
     }

    return -1;

  }
}
