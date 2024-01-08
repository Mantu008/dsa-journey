public class single_apprience_element {
  public static void main(String[] args) {
    int arr[]={4315,4315,4316,4316,4317,4317,4318,4318,4319,4319,4320,4320,4321,4321,4322,4322,4323,4323,4324,4324,4325,4326,4326,4327,4327,4328,4328,4329,4329,4330,4330};

    int element=search(arr);
    System.out.println("the single appiear element is:-"+element);
  }

  public static int search(int arr[]){

    if(arr.length==1) return arr[0];
    if(arr[0]!=arr[1]) return arr[0];
    if(arr[arr.length-1]!=arr[arr.length-2]) return arr[arr.length-1];

    int start=1;
    int end=arr.length-2;

    while (start<=end) {
      int mid=start+(end-start)/2;

      if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]){
             return arr[mid];
      }else if(mid%2==1 && arr[mid]==arr[mid-1] || mid%2==0 && arr[mid]==arr[mid+1]){
            start=mid+1;
      }else{
        end=mid-1;
      }
    }

    return -1;
  }

}
