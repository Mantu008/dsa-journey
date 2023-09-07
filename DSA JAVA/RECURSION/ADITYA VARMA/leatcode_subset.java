import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leatcode_subset {

    public static void solve(List<List<Integer>> resultSets, List<Integer> tempSet,int[] nums, int start){
        resultSets.add(new ArrayList<>(tempSet)); 
        for(int i=start;i<nums.length;i++){
            tempSet.add(nums[i]);
            solve(resultSets, tempSet, nums,i+1);
            tempSet.remove(tempSet.size() - 1);
        }
    }
    

public static void main(String[] args) {
    
     int nums[]={1,2,3};
     List<List<Integer>> resultList = new ArrayList<>(); 
     solve(resultList, new ArrayList<>(), nums, 0);
     
     System.out.println(resultList);

    
}    
}