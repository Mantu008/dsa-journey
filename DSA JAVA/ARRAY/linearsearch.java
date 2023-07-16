public class linearsearch {

    static boolean present(int[] arr,int n,int key){
             for(int i=0;i<n;i++){
                if(arr[i]==key){
                    return true;
                }
             }
             return false;
    }

    public static void main(String[] args) {
        int []arr={4,6,3,9,1,8,2,1,78,87};
        int n=arr.length;
        int key=99;
       boolean p= present(arr, n, key);

       if(p==true){
                   System.out.println("element is present in given array");
       }else{
        System.out.println("element is not present in given array");
       }
    }
}
