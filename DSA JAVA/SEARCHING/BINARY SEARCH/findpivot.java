public class findpivot {

    static int pivot(int []arr){
        int s=0;
        int e=arr.length-1;

        while(s<e){
            int mid=s+(e-s)/2;

            if(arr[mid]>=arr[0]){
                s=mid+1;
            }else{
                e=mid;
            }
        }

        return e;
    }
    public static void main(String[] args) {
        int [] arr={7,9,1,2,3};

        int x=pivot(arr);

        System.out.println("pivot of this given array is:"+x);
         
    }
}
