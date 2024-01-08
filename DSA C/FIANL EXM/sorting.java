public class sorting {

    public static void bubble_sort(int arr[]){
          for(int i=0;i<arr.length-1;i++){
             for(int j=0;j<arr.length-i-1;j++){
               if(arr[j]>arr[j+1]){
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
               }
             }
          }
    }

    public static void selection_sort(int arr[]){
         
        for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
             if(arr[i]>arr[j]){
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
             }
          }
        }
    }

    public static void intersion_sort(int arr[]){
         
    }

    public static void display(int arr[]){
       for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
       }
    }

  public static void main(String[] args) {
    
      int arr[]={4,2,7,3,1,8};

      selection_sort(arr);
      display(arr);


  }
}
