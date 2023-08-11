
public class duplicatenumber {
public static void main(String[] args) {
    int nums[]={1,3,4,2,2};

            int slow=nums[0];
            int fast=nums[0];

            while(slow!=fast){
                slow=nums[0];
                fast=nums[slow];
            }

            System.out.println("duplicate="+slow);
}
    
}