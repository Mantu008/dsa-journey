public class ls {

    static int search(int arr[],int n,int t){

        for(int i=0;i<n;i++){
            if(arr[i]==t){
                return i;
            }
        }
        
        return -1;
    }

    static boolean search1(String str,int n1,int t1){

        for(int i=0;i<n1;i++){
            if(t1==str.charAt(i)){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {

        int arr[]={1,2,3,5,9,8,6,18};
        int n=arr.length;
        int t=18;

        int c=search(arr,n,t);

        System.out.println("element present at index:"+c);


        String str="mantu";
        int n1=str.length();
        char t1='c';


        boolean c1=search1(str,n1,t1);

        System.out.println("element present at index:"+c1);

        
    }
}
