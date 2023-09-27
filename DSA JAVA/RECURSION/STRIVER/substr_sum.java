import java.util.ArrayList;
import java.util.List;

public class substr_sum {
       public static void Printsubn(int idx,int arr[],int n,ArrayList<Integer>list, List<List<Integer>> resultList,int sum,int s){
         if(idx==n){
               if(sum==s){
                     resultList.add(new ArrayList<>(list));
               }
               return;
         }
         list.add(arr[idx]);
         sum+=arr[idx];
         Printsubn(idx+1,arr,n,list,resultList,sum,s);
         int size=list.size()-1;
         list.remove(size);
         sum-=arr[idx];
         Printsubn(idx+1,arr,n,list,resultList,sum,s);
         return;
    }
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int n=arr.length;
        ArrayList<Integer>list=new ArrayList<>();
        List<List<Integer>> resultList = new ArrayList<>(); 
        int idx=0;
        int sum=0;
        int s=2;
        Printsubn(idx,arr,n,list,resultList,sum,s);
           System.out.println(resultList);           // it return all element which sum is given value
           System.out.println(resultList.size());    // it return the accrunces of the substring which sum is given value
    }  
}

