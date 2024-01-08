public class floar_of_sorted_array {
  public static void main(String[] args) {
    int []arr={66,67,68 ,69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92,93 ,94 ,95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106};
    int target=106;
    int flor=searchFloar(arr,target);

    System.out.println("the flor of the given target is:-"+flor);

  }
  public static int searchFloar(int []arr,int target){
    
     int start=0;
     int end=arr.length-1;
     int result=0;

     while (start<=end) {
       int mid=start+(end-start)/2;

       if(target>=arr[mid]){
          result=arr[mid];
          start=mid+1;
       }else if(target<arr[mid]){
           end=mid-1;
       }
     }

    return result;
  }
}
