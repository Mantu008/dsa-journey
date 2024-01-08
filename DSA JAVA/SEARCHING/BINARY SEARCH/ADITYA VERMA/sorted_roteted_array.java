public class sorted_roteted_array {
public static void main(String[] args) {
  int arr[]={2,3,5,6,8,7,1,7};

   int ans=search(arr);

   System.out.println("the number of rotation in this gioven sorted array is:-"+ans);
}
public static int search(int arr[]){

  int start=0;
  int end=arr.length-1;

  while(start<=end){
      int mid=start+(end-start)/2;

      if(arr[mid]<arr[mid+1] && arr[mid]<arr[mid-1]){
            return mid;
      }else if(arr[start]<=arr[mid]){
            start=mid;
      }else{
          end=mid;
      }
  }

  return -1;
}
}