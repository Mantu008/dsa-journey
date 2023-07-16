

public class findtargetininfinitelengtharr {


    static int ans(int []arr,int target){
         int start=0;
         int end=1;
         
        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
           } 

           return indexis(arr, target, start, end);
    }
 

    static int indexis(int []arr,int target,int start,int end){

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

        return  -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,12,33,45,67,68,99};
        int target=99;

        

        

        int x=ans(arr, target);

        System.out.println("the index of given target in infinite length arr is:"+x);



    }
}
