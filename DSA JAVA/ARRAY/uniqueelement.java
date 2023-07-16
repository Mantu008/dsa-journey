public class uniqueelement {

    static int unique(int []arr,int n){
           int ans=0;
        for(int i=0;i<n;i++){
            ans=ans^arr[i];
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int []arr={1,1,2,2,3,3,4,4,55,6,6,7,7};
        int n=arr.length;
        int x=unique(arr, n);
        System.out.println("unique element in this given array is:"+x);
    }
}
