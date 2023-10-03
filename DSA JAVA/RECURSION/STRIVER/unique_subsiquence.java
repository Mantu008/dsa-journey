import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class unique_subsiquence {
       public static void Printsubn(int idx,int arr[],int n,ArrayList<Integer>list, List<List<Integer>> resultList){
         if(idx>=n){
                if(!resultList.contains(list)){
                    resultList.add(new ArrayList<>(list));
                }
               return;
         }
         list.add(arr[idx]);
         Printsubn(idx+1,arr,n,list,resultList);
         int size=list.size()-1;
         list.remove(size);
         Printsubn(idx+1,arr,n,list,resultList);
         return;
    }
    public static void main(String[] args){
        int arr[]={1,2,2,2,3,3};
        Arrays.sort(arr);
        int n=arr.length;
        ArrayList<Integer>list=new ArrayList<>();
        List<List<Integer>> resultList = new ArrayList<>(); 
        int idx=0;
        Printsubn(idx,arr,n,list,resultList);

        System.out.println(resultList);
    }  
}

