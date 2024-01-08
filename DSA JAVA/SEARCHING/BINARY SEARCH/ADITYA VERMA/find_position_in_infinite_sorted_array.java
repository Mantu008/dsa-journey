public class find_position_in_infinite_sorted_array {
  public static void main(String[] args) {
    
    int arr[]={4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};   //suppose it is an infinite array
    int target=13;

    int position=search(arr,target);

    System.out.println("the position of the given element in infinite sorted array is:-"+position);

  }

  public static int search(int arr[],int target){

    int start=0;
    int end=1;

    while(target>arr[end]){
        start=end;
        end=end*2;
    }

    while(start<=end){
       int mid=start+(end-start)/2;

       if(target<arr[mid]){
           end=mid-1;
       }else if(target>arr[mid]){
          start=mid+1;
       }else{
        return mid;
       }
    }

    return -1;
  }

}
