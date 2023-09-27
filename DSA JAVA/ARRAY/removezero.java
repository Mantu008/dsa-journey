
public class removezero {

    public static void remove(int arr[]){
          int j=0;
          for(int i=0;i<arr.length;i++){
               if(arr[i]==0){
                   continue;
               }else{
                  arr[j]=arr[i];
                  j++;
               }
          }   
          
          System.out.println(k);

          for(int i=j;i<arr.length;i++){
                      arr[i]=0;
          }
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        remove(arr);

        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }


    }
}
