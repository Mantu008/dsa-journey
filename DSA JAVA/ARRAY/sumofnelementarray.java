public class sumofnelementarray {
    static void SumOfAllElement(int []arr,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("sum of all element to given array is:"+sum);
    }
    public static void main(String[] args) {
        int []arr={1,4,5,7,3,9,6,7};
        int n=arr.length;
        SumOfAllElement(arr, n);

    }
}
