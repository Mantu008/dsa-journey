public class palindrome_array {
  public static void main(String[] args) {
    
     int arr[]={1,2,3,4,3,2,1};

     int i=0;
     int j=arr.length-1;

     while(i<=j){
         if(arr[i]==arr[j]){
            i++;
            j--;
         }else{
             System.out.println("given arrayt is not palindrome...");
             break;
         }
     }

     System.out.println("given array is palindrome......");

  }
}
