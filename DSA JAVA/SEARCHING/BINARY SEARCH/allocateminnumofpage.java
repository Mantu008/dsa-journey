
public class allocateminnumofpage {
    public static void main(String[] args) {

        int [] nums={10,20,30,40};
        int m=2;

        int y=splitArray(nums, m);

       System.out.println("split array is:"+y);


        
    }

    static int splitArray(int[] nums, int m) {
       
        int start=0;
        int end=0;
        int ans=0;

        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }

        while(start<=end){

            int sum=0;
            int count=1;

            int mid=start+(end-start)/2;



            for(int e:nums){
                if(sum+e<=mid){
                    sum+=e;
                }else{
                    sum=e;
                    count++;   
                }
            }

            if(count==m){
                 ans=mid;
                 end=mid-1;
            }else{
                start=mid+1;
            }

        }


      
        return ans;
    
    }


}

