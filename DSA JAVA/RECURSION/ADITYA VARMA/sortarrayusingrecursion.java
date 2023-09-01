public class sortarrayusingrecursion {

    public static void sort(int arr[],int size){
               if(size==0){
                   return;
               }
                int temp=arr[size];
                size=size-1;
                sort(arr,size);
                int i;
                for(i=size;i>=0;i--){
                    if(arr[i]>temp){
                        arr[i+1]=arr[i];
                    }else{
                        break;
                    }
                }
                 arr[i+1]=temp;
    }


    //it is not working

    // public static void incert(int arr[],int temp,int size){
    //          if(size==0 || arr[size-1]<=temp){
    //               arr[size+1]=temp;
    //               return;
    //          }

    //          int val=arr[size-1];
    //          incert(arr, temp, size-1);

    //          arr[size-1]=val;
    //          return;
    // }
    public static void main(String[] args) {
        int arr[]={0,1,5,2};
        int size=arr.length-1;           //find size of array

        if(arr.length==0){
               System.out.println("array is empty");
          }else{
            sort(arr,size);

        for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
        }

    }
        
    }
}
