public class search_row_and_column_wise {
  public static void main(String[] args) {

    int arr[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
    int key=29;

    int result[]={-1,-1};
    search(arr,key,result);
    System.out.println("the element is present on index:-"+"{"+result[0]+","+result[1]+"}");

  }

  public static int[] search(int arr[][],int key,int[]result){

     int n=arr.length;
     int m=arr[0].length;

     int i=0;
     int j=m-1;
       
     while(i>=0 && i<n && j>=0 && j<m){
       if(arr[i][j]==key){
           result[0]=i;
           result[1]=j;
           return result;
       }else if(arr[i][j]>key){
           j--;
       }else if(arr[i][j]<key){
          i++;
       }
     }

     return result;
  }

}
