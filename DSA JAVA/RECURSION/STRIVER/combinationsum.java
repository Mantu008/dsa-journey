import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationsum {
       public static void Printsubn(int idx,int target,int arr[],int n,ArrayList<Integer>list, List<List<Integer>>resultList){
         if(idx==n){
                if(target==0){
                     resultList.add(new ArrayList<>(list));
                }
               return;
         }
            if(arr[idx]<=target){
                list.add(arr[idx]);
                Printsubn(idx,target-arr[idx],arr,n,list,resultList);
                int size=list.size()-1;
                list.remove(size);
            }
         Printsubn(idx+1,target,arr,n,list,resultList);
         return;
    }
    public static void main(String[] args) {
        int arr[]={2,3,6,7};
        int n=arr.length;
        ArrayList<Integer>list=new ArrayList<>();
        List<List<Integer>> resultList = new ArrayList<>(); 
        int idx=0;
        int target=7; 
        Printsubn(idx,target,arr,n,list,resultList);
           System.out.println(resultList);           // it return all element which sum is given value
           System.out.println(resultList.size());    // it return the accrunces of the substring which sum is given value
    }  
}

