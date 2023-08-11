public class maxelemenetoright_and_left {
    public static void main(String[] args) {
        
        int arr[]={3,0,0,2,0,4};
        int n=arr.length;



   System.out.println("mxr right");

        int mxr[]=new int[n];       
          mxr[n-1]=arr[n-1];

          for(int i=n-2;i>=0;i--){
              if(mxr[i+1]>arr[i]){
                  mxr[i]=mxr[i+1];
              }else{
                 mxr[i]=arr[i];
              }
          }


        for(int i=0;i<n;i++){
            System.out.print(mxr[i]+" ");
        }

        System.out.println(" ");
        System.out.println("mxr left");

        int mxl[]=new int[n];       
          mxl[0]=arr[0];

          for(int i=1;i<n;i++){
              if(mxl[i-1]>arr[i]){
                  mxl[i]=mxl[i-1];
              }else{
                 mxl[i]=arr[i];
              }
          }


        for(int i=0;i<n;i++){
            System.out.print(mxl[i]+" ");
        } 




    }
}
