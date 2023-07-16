public class shortzeroone {
     static void shortzeroon(int [] arr,int n){
        int i=0;
        int j=n-1;

          while(i<j){

               if(arr[i]==0){
                    i++;
               }

               if(arr[j]==1){
                j--;
           }

            if(arr[i]==1 && arr[j]==0){
                int temp;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                i++;
                j--;

             }

          }

        
     }
    public static void main(String[] args) {
        int []arr={0,1,1,0,0,1,1,1,1,0,0,1,0,1,0,0,1,0,0,0,0,0,0,1,0,0,0,1,0,0,1,1,0,1,0,0,1,0,0,1,0,1,1,1,1,1,1,1,0,0,1,0,1};

        int n=arr.length;
        System.out.println("before swaop:");
        for(int e:arr){
            System.out.print(e+" ");
        }
        System.out.println(" ");
        

        System.out.println("after awaping:");

        shortzeroon(arr, n);

        for(int e:arr){
            System.out.print(e+" ");
        }

    }
}
