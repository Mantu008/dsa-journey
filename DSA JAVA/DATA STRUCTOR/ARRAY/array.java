import java.util.ArrayList;

public class array {

    public void getaray(int [] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");

    }

    public void givedata(){
        int [] arr=new int[5];
        arr[0]=8;
        arr[1]=4;
        arr[2]=7;
        arr[3]=3;
        arr[4]=9;
        arr[3]=8888;

        getaray(arr);
        System.out.println("the length of the array is:"+arr.length);
        System.out.println("the last indexed element is:"+arr[arr.length-1]);

       

    }

    public void printarray(int [] a ){

        int x=a.length;
        for(int i=0;i<x;i++){
             System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        
     array m=new array();
     m.givedata();

     m.printarray(new int [] {3,5,98,56});
    

    }
}
