public class index_of_first_1_in_binary_sorted_array {
  public static void main(String[] args) {
    
    // int arr[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

    int arr[]={0 ,0 ,0 ,0 ,0 ,0 ,0, 0 ,0 ,1 ,1};

    int position=search(arr);

    System.out.println("the position of first 1 in binary sorted array is:"+position);

  }

  public static int search(int arr[]){
   
    int start=0;
    int end=1;
    int index=-1;

    if(arr[arr.length-1]==0) return -1;

    while(arr[end]<1){
         start=end;
         end=end*2;
         if(end>=arr.length-1){
              end=arr.length-1;
         }    
    }

    while (start<=end) {
       int mid=start+(end-start)/2;

       if(arr[mid]==1){
         index=mid;
         end=mid-1;
       }else if(arr[mid]<1){
            start=mid+1;
       }
    }

    return index;
    
  }

}
