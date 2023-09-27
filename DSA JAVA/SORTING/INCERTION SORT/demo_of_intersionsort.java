public class demo_of_intersionsort {
    public static void main(String[] args) {
        int arr[]={64,25,12,22,11};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
          int minindex=i;
            for(int j=i+1;j<n;j++){  
                if(arr[j]<=arr[minindex]){
                    int temp=arr[j];
                    arr[j]=arr[minindex];
                    arr[minindex]=temp;
                }
            }
        }

        for(int i=0;i<n;i++){
             System.out.print(arr[i]+" ");
        }

    }

}
