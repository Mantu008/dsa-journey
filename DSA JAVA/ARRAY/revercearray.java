public class revercearray {
    public static void rev(int [] arr,int n){
       int x=n/2;
        for(int i=0;i<x;i++){       
            int temp;         
            temp=arr[i];
            arr[i]=arr[n-1];
            arr[n-1]=temp;
            n--;      
        } 
}
    public static void main(String[] args) {
        int [] arr={4,6,2,8,1,0,3,5,9,67,34,76,78,45,34};
        int n=arr.length;  
        System.out.println("before swaping.....");  
        for(int e:arr){
            System.out.print(e+" ");
        }
        rev(arr, n);
        System.out.println();
        System.out.println("after revercing array.......");

        for(int e:arr){
            System.out.print(e+" ");
        }

        
    }
}
