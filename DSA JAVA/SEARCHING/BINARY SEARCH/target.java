
public class target {

    static int binarysearch(int [] arr,int target){

        int start=0;
        int end=arr.length-1;

        if(arr[start]<arr[end]){
            // this is for increasing sort array
        while(start<=end){
            int mid=start+(end-start)/2;

            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;  
            }else{
                return mid;
            } 
        }
    }else{

         // this is for decreasing sort array
        while(start<=end){
            int mid=start+(end-start)/2;

            if(target>arr[mid]){
                end=mid-1;
            }else if(target<arr[mid]){
                start=mid+1; 
            }else{
                return mid;
            } 
        }
    }
        return -1;
    }
    public static void main(String[] args) {
          
        // int [] arr={2,4,6,9,11,12,14,20,36,48};

        int [] arr={-1,0,3,5,9,12};

        int x=binarysearch(arr, 2);
        if(x<0){
            System.out.println("my target is not present in this given array");
        }else{
        System.out.println("the index where my target is present:"+x);
        }

    }
}
