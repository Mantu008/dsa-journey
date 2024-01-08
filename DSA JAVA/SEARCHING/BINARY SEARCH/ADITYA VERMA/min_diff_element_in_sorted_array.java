public class min_diff_element_in_sorted_array {
  public static void main(String[] args) {
    
    int arr[]={2, 5, 10, 12, 15};
    int key=11;
    int element=search(arr,key);

    System.out.println("min difference element of this given key is:-"+element);

  }

  public static int search(int arr[],int key){
    int start=0;
    int end=arr.length-1;
    int floar=0;
    int seal=0;

    while (start<=end) {
      int mid=start+(end-start)/2;

      if(key==arr[mid]){
        return arr[mid];
      }else if(key>arr[mid]){
          floar=arr[mid];
          start=mid+1;
      }else{
        seal=arr[mid];
         end=mid-1;
      }
    }

    int result1=Math.abs(floar-key);
    int result2=Math.abs(seal-key);

    if(result1<result2){        
        return floar;
    }else if(result1==result2){
         return floar;
    }else{
      return seal;
    }

  }

}
