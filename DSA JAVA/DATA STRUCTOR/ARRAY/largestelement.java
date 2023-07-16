import java.util.*;
public class largestelement {
    public static void main(String[] args) {
        
        int arr[]={1,34,87,98,98,77};
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("largest  element in this given array is:"+largest);

        System.out.println("_____________________________________");
       
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
        }   
        System.out.println();
        System.out.println("lasgest element on this array is:"+arr[arr.length-1]);

        System.out.println("______________________________");

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=arr[arr.length-1]){
                System.out.println("second largest number is:"+arr[i]);
                break;   
            }
        }
      
        
    }
}
