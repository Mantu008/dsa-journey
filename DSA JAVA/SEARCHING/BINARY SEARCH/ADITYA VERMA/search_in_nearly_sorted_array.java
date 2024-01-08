public class search_in_nearly_sorted_array {
public static void main(String[] args) {
  int arr[]={10, 3, 40, 20, 50, 80, 70};
  int target=50;
  int ans=search(arr,target);
  System.out.println("the element is present at index:- "+ans);
}

public static int search(int []arr,int target){
   int start=0;
   int end=arr.length-1;

   while (start<=end) {
     int mid=start+(end-start)/2;

     if(target==arr[mid]){
          return mid;
     }else if(mid>=start && target==arr[mid-1]){
          return mid-1;
     }else if(mid<=end && target==arr[mid+1]){
          return mid+1;
     }else if(target<arr[mid]){
         end=mid-2;
     }else if(target>arr[mid]){
        start=mid+2;
     }
   }

  return -1;
}

}