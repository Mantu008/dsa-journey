import java.util.Arrays;

public class maxminofarray {
  
    static int min(int []arr,int n){

        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    static int max(int []arr,int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr={5,3,78,8,9,4,2,1};
        int n=arr.length;
        int x=min(arr,n);
        int y= max(arr, n);

        System.out.println("the minimum element of given array is:"+x);
        System.out.println("the maximum element of given array is:"+y);


        //second way to detrmine min and max element using collections class...

        Arrays.sort(arr);
        System.out.print("sorted array is:");
        for(int e:arr){
              System.out.print(+e+" ");
        }

        System.out.println(" ");

       
        System.out.println("the minimum element of given array is:"+arr[0]);
        System.out.println("the maximum element of given array is:"+arr[n-1]);

    }
}
