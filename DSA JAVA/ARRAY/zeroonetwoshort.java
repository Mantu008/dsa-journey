import java.util.Arrays;

public class zeroonetwoshort {
    static void shortzeroon(int [] arr,int n){
       int i=0;
       int j=n-1;

         while(i<j){

              if(arr[i]==0){
                   i++;
              }

              if(arr[j]==1 || arr[j]==2){
               j--;
          }

           if(arr[i]==1 ||arr[i]==2 && arr[j]==0){
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
       int []arr={0,1,1,2,0,1,0,2,2,1,2,1,0,0,1,0,2,2,0,1,0,2};

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

       System.out.println(" ");

    
        //  int i=0;
        //  int j=n-1;

         
       

        //      while(i<j){

        //         while(arr[i]==0){
        //             i++;
        //             }

        //         while(arr[j]==2){
        //             j--;
        //         }

        //     if(arr[i]==2 && arr[j]==1){
        //       int temp;
        //       temp=arr[i];
        //       arr[i]=arr[j];
        //       arr[j]=temp;
        //       i++;
        //       j--;

        //     }

        // }

         

         for(int e:arr){
            System.out.print(e+" ");
        }
 
        System.out.println(" ");
         



    //    Arrays.sort(arr);

    //    for(int e:arr){                                        //using arrayclass short this
    //     System.out.print(e+" ");
    // }

   }
}
