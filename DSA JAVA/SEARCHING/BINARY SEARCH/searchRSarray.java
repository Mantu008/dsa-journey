

public class searchRSarray {

    static int pivot(int []arr){
        int s=0;
        int e=arr.length-1;

        while(s<e){
            int mid=s+(e-s)/2;

            if(arr[mid]>=arr[0]){
                s=mid+1;
            }else{
                e=mid;
            }
        }

        return s;
    }

      static int search(int []arr,int target,int x){
             
        if(target>=arr[x]  && target<=arr[arr.length-1]){
            // this b.s is for second line 
            int start=x;
            int end=arr.length-1;
        while(start<=end){

            int mid=start+(end-start)/2;

            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;  
            }else{
                System.out.println("second line");
                return mid;
            } 

          
        }
      }else{

         // this is for first line

         int start=0;
         int end=x;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(target>arr[mid]){
                start=mid+1; 
            }else if(target<arr[mid]){
                end=mid-1; 
            }else{
                System.out.println("first line");
                return mid;
            } 
        }
        
    }
        return -1;

    }
      
    public static void main(String[] args) {

        int [] arr={4,5,6,7,0,1,2};

        int target=0;

        int x=pivot(arr);

        System.out.println("pivot of this given array is:"+x);

        int y=search(arr, target, x);
         System.out.println(y);

        //  if(y>0){
        //     System.out.println("target is present in roteted sorted array at index:"+y);
        //  }else{
        //     System.out.println("target is not present in given roteted sorted array");
        //  }
        
    }
}
