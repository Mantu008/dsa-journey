import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetusinglist {

    public static void solve(List<List<Integer>> resultSets, List<Integer> tempSet,int[] nums, int start){
        resultSets.add(new ArrayList<>(tempSet)); 
        for(int i=start;i<nums.length;i++){
            // Case of including the number
            tempSet.add(nums[i]);

          // Backtrack the new subset
           solve(resultSets, tempSet, nums,i+1);

         // Case of not-including the number
          tempSet.remove(tempSet.size() - 1);
        }
    }

public static void main(String[] args) {
    
          
    List<List<Integer>> resultList = new ArrayList<>();
     int nums[]={1,2,3};
     int start=0;
    solve(resultList, new ArrayList<>(), nums, 0);
    System.out.println(resultList);
    

    
}    
}