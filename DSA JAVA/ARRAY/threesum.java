

public class threesum {

    static int sum(int [] arr,int n,int s){
        int count=0;
           for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==s){
                           count++;
                    }
                }
            }
           }
           return count;
    }
    public static void main(String[] args) {
        int [] arr={1,3,7,4,8,5,9,5,2};
        int n=arr.length;
        int s=10;
        int y=sum(arr, n, s);
        System.out.println("sum possiblity is:"+y);


    }
}
