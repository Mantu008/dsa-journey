public class twosum_sortedarray {
    public static void main(String[] args) {
        
        int arr[]={-1,0};
        int target=-1;

        int left=0;
        int right=0;

         for(int i=0;i<arr.length;i++){
               if(arr[i]<=target){
                  right++;    
               }else{
                break;
               }     
         }

         right=right-1;


      System.out.println(right);


    //   while(left<right){
    //     if(arr[left]+arr[right]==target){
    //           System.out.println(left +" "+right);
    //           break;
    //     }else{
    //               left++;
    //     }
       
    // }


    }
}
