import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class subsetsum_l {
    public static void subsetsum(int idx,ArrayList<Integer> resultlist,int add,int []arr){
          if(idx==arr.length){
                if(!resultlist.contains(add)){
                      resultlist.add(add);
                }
             return;
          }

          // for picking the element
         add+=arr[idx];
         subsetsum(idx+1, resultlist,add, arr);
         //for not picking the element
         add-=arr[idx];
         subsetsum(idx+1, resultlist,add, arr);
    }
    public static void main(String[] args) {
        ArrayList<Integer> resultlist=new ArrayList<>();
        int arr[]={2, 3};
        int idx=0;
        int add=0;
        subsetsum(idx,resultlist,add,arr);
        Collections.sort(resultlist);
        System.out.println(resultlist);


    }


}