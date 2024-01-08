import java.util.ArrayList;
import java.util.List;

public class _3sum {
public static void main(String[] args) {
      int arr[]={-1,0,1,2,-1,-4};
      List<List<Integer>> result=new ArrayList<>();
      List<Integer> list=new ArrayList<>();

      for(int i=0;i<arr.length;i++){
         for(int j=i+1;j<arr.length;j++){
            for(int k=j+1;k<arr.length;k++){
                if(arr[i]+arr[j]+arr[k]==0 && i!=j && i!=k && j!=k){
                   list.add(arr[i]);
                   list.add(arr[j]);
                   list.add(arr[k]);
                   result.add(list);
                   list=new ArrayList<>();
                }
            }
         }
      }

      System.out.println(result);
}
}
