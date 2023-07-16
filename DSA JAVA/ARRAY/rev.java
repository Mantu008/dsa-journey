public class rev {

    static void reverce(int []arr,int n){
           int start=0;
           int end=n-1;
        while(start<=end){
            int temp;
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

        static void revercealt(int []arr,int n){

            int start=0;
          
         while(start<n-1){
             int temp;
             temp=arr[start];
             arr[start]=arr[start+1];
             arr[start+1]=temp;
             start+=2;
        
         }
            
    }

    


    public static void main(String[] args) {
        int []arr={3,5,2,8,6,9,1};
        int n=arr.length;
        reverce(arr, n);

        System.out.println("reverce the given array:");
        for(int e:arr){
            System.out.print(e+" ");
        }

              System.out.println(" ");


              System.out.println("reverce alternate place to given array:");

        revercealt(arr, n);
        for(int e:arr){
            System.out.print(e+" ");
        }



    }
}
