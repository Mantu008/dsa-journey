import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class parmutationll {
       public static void Printprmution(int arr[],ArrayList<Integer>list, List<List<Integer>> resultList,boolean []freq){
         if(list.size()==arr.length){
                resultList.add(new ArrayList<>(list));
               return;
         }
        
           for(int i=0;i<arr.length;i++){
                if(!freq[i]){
                     freq[i]=true;
                     list.add(arr[i]);
                     Printprmution(arr,list,resultList,freq);
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
        Printprmution(arr,list,resultList,freq);

        System.out.println(resultList);
    }  
}

