public class removeduplicateelement_two {
     public static int remove_duplicate(int nums[]){
            int i=0;
            for(int e:nums){
                if(i==0 || i==1 || nums[i-2]!=e){
                       nums[i]=e;
                       i++;
                }
            }
          return i;
      }
    public static void main(String[] args) {
        int nums[]={1,1,1,2,2,3};
        int k=remove_duplicate(nums);

        System.out.println(k);

        for(int i=0;i<nums.length;i++){
             System.out.print(nums[i]+" ");
        }
    }
}
