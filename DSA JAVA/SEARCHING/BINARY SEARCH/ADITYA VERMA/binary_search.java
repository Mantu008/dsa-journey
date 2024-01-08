public class binary_search {
   public static int binarysearch(int arr[],int target){

    int start=0;
    int end=arr.length-1;
    
    while(start<=end){
      int mid=start+(end-start)/2;

      if(target>arr[mid]){
         start=mid+1;
      }else if(target<arr[mid]){
          end=mid-1;
      }else{
        return mid;
      }
    }

    return -1;
  }
  public static void main(String[] args) {
        
    int arr[]={0,1,3,9,12,14};
    int target=9;
    int res=binarysearch(arr,target);

    if(res==-1){
        System.out.println("terget is not present in this given array");
    }else{
        System.out.println("target is present at index:-"+res);
    }
  }
}
