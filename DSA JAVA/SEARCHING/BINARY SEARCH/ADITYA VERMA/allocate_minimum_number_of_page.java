public class allocate_minimum_number_of_page {
  public static void main(String[] args) {
    int arr[]={10,20,30,40};
    int k=2;

    int ans=findMinimum_among_Max(arr,k);

    System.out.println("minimum page allocation number is:-"+ans);
  }

  public static int findMinimum_among_Max(int arr[],int k){

     if(k>arr.length) return -1;        //because each student have at list one book 

     int start=Integer.MIN_VALUE;       // take max element from given array
     int end=0;                         // take sum of all element from array

     for(int i=0;i<arr.length;i++){
          if(arr[i]>=start){
             start=arr[i];               //for getting max
          }
          end+=arr[i];                   //for getting sum 
     }

     int result=-1;              // it is for storing minimum amoung all possible answer

     while (start<=end) {
        int mid=start+(end-start)/2;

        if(isValid(arr,arr.length,k,mid)==true){
              result=mid;                  
              end=mid-1;                         //if valid then minimize allocated page
        }else{
              start=mid+1;                   //if not valid then maxmize allocated page
        }
     }

    return result;
  }


  //check allocate page is valid for given k students or not;

  public static boolean isValid(int arr[],int size,int k,int mx){        

    int students=1;
    int sum=0;

    for(int i=0;i<size;i++){

      sum+=arr[i];

      if(sum>mx){
        students++;
        sum=arr[i];
      }

      if(students>k){               //if students is grator then k then return false
        return false;
      }

    }
      
     return true;                 //else return true 
  }

}
