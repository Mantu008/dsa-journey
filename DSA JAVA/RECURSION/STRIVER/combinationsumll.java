import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationsumll {
       public static void Printsubn(int idx,int target,int arr[],int n,ArrayList<Integer>list, List<List<Integer>>resultList){
                if(target==0){
                     resultList.add(new ArrayList<>(list));
                return;
         }

          for(int i=idx;i<arr.length;i++){
              if(i>idx && arr[i]==arr[i-1]) continue;
              if(arr[i]>target) break;
              list.add(arr[i]);
              Printsubn(i+1,target-arr[i],arr,n,list,resultList);
              int size=list.size()-1;
              list.remove(size);
          }
    }
    public static void main(String[] args) {
        int arr[]={10,1,2,7,6,1,5};
        int n=arr.length;
        Arrays.sort(arr);
        ArrayList<Integer>list=new ArrayList<>();
        List<List<Integer>> resultList = new ArrayList<>(); 
        int idx=0;
        int target=8; 
        Printsubn(idx,target,arr,n,list,resultList);
           System.out.println(resultList);           // it return all element which sum is given value
           System.out.println(resultList.size());    // it return the accrunces of the substring which sum is given value
    }  
}

