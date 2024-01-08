public class reverce_bs {
  public static void main(String[] args) {
    int arr[]={9,7,6,5,4,2,0};
    int target=5;
    
    int s=search(arr,target);

    if(s==-1){
      System.out.println("terget is not present in this given array");
    }else{
      System.out.println("target is present at index:-"+s);
    }
  }

  public static int search(int arr[],int target){

    int start=0;
    int end=arr.length-1;

    while (start<=end) {
       int mid=start+(end-start)/2;

       if(target<arr[mid]){
          start=mid+1;
       }else if(target>arr[mid]){
              end=mid-1;
       }else{
          return mid;
       }
    }

    return -1;
  }
}
