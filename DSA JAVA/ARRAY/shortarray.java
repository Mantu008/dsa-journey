import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class shortarray {
    static void sort(int []arr,int n){

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]) {
                    int temp;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
               }
            }
        }
        
    }
    public static void main(String[] args) {
        List<Integer>a=new ArrayList<>();
        int [] arr={-10,-40,-25,-12,-25,-10};

      sort(arr, arr.length);

        // Arrays.sort(arr);
       
        

        for(int e:arr){
            System.out.print(e+" ");
        }

        System.out.println("");
        System.out.println(arr[arr.length-2]);

    }
}
