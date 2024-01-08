public class seal_of_sorted_array {
public static void main(String[] args) {
 
  int arr[]={1,2,3,4,8,10,10,12,14};
  int target=11;
  int cel=searchSeil(arr,target);

  System.out.println("the ceiling of given element is:-"+cel);
  
}
public static int searchSeil(int arr[],int target){

    int start=0;
    int end=arr.length-1;
    int result=0;

    while(start<=end){
      int mid=start+(end-start)/2;

      if(target<=arr[mid]){
            result=arr[mid]; 
            end=mid-1;
      }else if(target>arr[mid]){
           start=mid+1;
      }
    }

   return result;
 }

}