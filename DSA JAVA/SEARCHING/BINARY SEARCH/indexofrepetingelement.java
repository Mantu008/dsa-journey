

public class indexofrepetingelement {

    static public int binarySearch(int[] arr, int target, boolean findFirst) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;    
        while (start <= end) {
            int mid = start + (end - start) / 2;   
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (findFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }  
        }
        return ans;
    }    
    
    public static void main(String[] args) {
       
        int [] arr={4,4,5,5,6,6,6,6,6,7};

        int target =6;

        int[] ans = {-1,-1};
        int firstIndex = binarySearch(arr,target,true);
        int lastIndex = binarySearch(arr, target, false);
        ans[0] = firstIndex;
        ans[1] = lastIndex;
        

        System.out.println("first index is:"+ans[0]);
        System.out.println("last index is:"+ans[1]);


        System.out.println("totel number of occerence is:"+(ans[1]-ans[0]+1));
       

       

       

    }
}
