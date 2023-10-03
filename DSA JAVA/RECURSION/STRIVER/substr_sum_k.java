import java.util.ArrayList;
import java.util.List;

public class substr_sum_k {
       public static int Printsubn(int idx,int arr[],int n,int sum,int s){
        if(sum>s){
             return 0;                     // if sum is grator then return immeditly...
        }
         if(idx==n){
               if(sum==s){
                    return 1;
               }
               return 0;
         }
         sum+=arr[idx];
         int l=Printsubn(idx+1,arr,n,sum,s);
         sum-=arr[idx];
         int r=Printsubn(idx+1,arr,n,sum,s);
         return l+r; 
    }
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int n=arr.length;
        int idx=0;
        int sum=0;
        int s=2;
       System.out.println("the occrance of substring which sum is:-"+Printsubn(+idx,arr,n,sum,s)); 
    }  
}


