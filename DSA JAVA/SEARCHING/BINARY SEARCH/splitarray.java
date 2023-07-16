public class splitarray {
    public static void main(String[] args) {

        int [] nums={10,5,13,4,8,4,5,11,14,9,16,10,20,8};
        int k=8;

        int y=splitArray(nums, k);

       System.out.println("split array is:"+y);


        
    }

    static int splitArray(int[] nums, int k) {
       
        int start=0;
        int end=0;
        int ans=0;

        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }

        if(k==nums.length){
            return start;
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
            System.out.println(start+" "+end);
            System.out.println(count);


            if(count==k){
                 ans=mid;
                 end=mid-1;
            }else{
                start=mid+1;
            }
        }

    


      
        return ans;
    
    }


}




