import java.util.Arrays;
public class majurityelement {
    public static void main(String[] args) {
       
        int nums[]={3,2,3};

        Arrays.sort(nums);
        System.out.println(nums[nums.length/2]);
    }
}
