

public class mxelementindexinmountainusarray {

    static public int peak(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;    
     
        while (start < end) {
            int mid = start + (end - start) / 2;   
            if (arr[mid]<arr[mid+1]) {
                start = mid+1;
            } else {
                  end=mid;
            }  
        }

        return  end;
    }


    static int firstindex(int [] arr,int target,int maxelement){

        int start=0;
        int end=maxelement;

        
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

        return -1;

    }

    static int lastindex(int [] arr,int target,int maxelement){

        int start=maxelement;
        int end=arr.length-1;

        
            // this is for decreasing sort array
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

        return -1;
        
    }
    




    
    public static void main(String[] args) {
       
        int [] arr={0,1,2,4,2,1};
        int target =3;
        int maxelement=peak(arr, target);
     //   System.out.println(maxelement);

        int x=firstindex(arr, target, maxelement);
        int y=lastindex(arr, target, maxelement);

         if(x<y){
            System.out.println(x);
         }else{
            System.out.println(y);
         }

        


    }
}

