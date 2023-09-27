public class revercearray {
    public static void revarr(int arr[],int i,int j){
        if(i>=j){
          return;
        }

         int temp;
         temp=arr[j];
         arr[j]=arr[i];
         arr[i]=temp;
         revarr(arr,i+1,j-1);

    }

     public static void revstr(char arr1[],int i,int j){
       if(i>=j){
           return;
        }
         char temp;
         temp=arr1[j];
         arr1[j]=arr1[i];
         arr1[i]=temp;

         revstr(arr1,i+1,j-1);
        
    }
    public static void main(String[] args) {

        int arr[]={1,3,2,6,5,9,4,8};

        revarr(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++){
              System.out.print(arr[i]+" ");
        }


        System.out.println();



        String str="mantu";
        char arr1[]=str.toCharArray();
        revstr(arr1,0,arr1.length-1);

        for(int i=0;i<arr1.length;i++){
              System.out.print(arr1[i]+" ");
        }


    }
}
