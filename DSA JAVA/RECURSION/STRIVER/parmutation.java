import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class parmutation {
       public static void Printprmution(int idx,int arr[],ArrayList<Integer>list, List<List<Integer>> resultList,boolean []freq){
         if(list.size()==arr.length){
                resultList.add(new ArrayList<>(list));
               return;
         }
        
           for(int i=0;i<arr.length;i++){
                if(!freq[i]){
                     freq[i]=true;
                     list.add(arr[i]);
                     Printprmution(idx,arr,list,resultList,freq);
                     list.remove(list.size()-1);
                     freq[i]=false;
                }
           }

    }
    public static void main(String[] args){
        int arr[]={1,1,2};
        ArrayList<Integer>list=new ArrayList<>();
        List<List<Integer>> resultList = new ArrayList<>(); 
        boolean freq[]=new boolean[arr.length];
        int idx=0;
        Printprmution(idx,arr,list,resultList,freq);

        System.out.println(resultList);
    }  
}

