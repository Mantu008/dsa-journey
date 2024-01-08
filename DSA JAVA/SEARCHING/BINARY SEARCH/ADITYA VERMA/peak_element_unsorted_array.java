public class peak_element_unsorted_array {
public static void main(String[] args) {
  
   int arr[]={3,4,3,2,1};

   int peak=searchPeak(arr);
   System.out.println("the peak element is in this givenarray is:-"+peak);

}

 public static int searchPeak(int arr[]){

   int start=0;
   int end=arr.length-1;

   if(arr.length==1) return 0;

   while (start<=end) {
      int mid=start+(end-start)/2;

      if (mid > 0 && mid<arr.length-1) {
        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
         return mid;
      }else if(arr[mid-1]>arr[mid]){
          end=mid-1;
      }else if(arr[mid+1]>arr[mid]){
          start=mid+1;
      }
      
      }else if(mid==0){
        if(arr[0]>arr[1]){
            return 0;
        }else{
          return 1;
        }
      }else if(mid==arr.length-1){
          if(arr[arr.length-1]>arr[arr.length-2]){
                return arr.length-1;
          }else{
              return  arr.length-2; 
          }
      }
      
   }

   return -1;
 }

}