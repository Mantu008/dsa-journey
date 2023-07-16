import java.util.*;
public class sumoftwoarray {

    static void twosum(int [] arr,int [] arr1,int [] sum){

        int c=0;
        int i=arr.length-1;
        int j=arr1.length-1;
        int k=sum.length-1;

        while(k>=0){
            int d=c;

            if(i>=0){
                d+=arr[i];
            }
            if(j>=0){
                d+=arr1[j];
            }

            c=d/10;
            d=d%10;

            sum[k]=d;

            i--;
            j--;
            k--;
        }

        if(c!=0){
            System.out.println(c);
        }

        for(int e:sum){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
  
        System.out.println("enter first array:");
        System.out.print("inter size of an array:");
        int x=sc.nextInt();
        int [] arr=new int[x];
  
        for(int i=0;i<x;i++){
          System.out.print("enter arr["+i+"]:");
           arr[i]=sc.nextInt();
        }


        System.out.print("enter second array:");
        int y=sc.nextInt();
        int [] arr1=new int[y];

  
        for(int i=0;i<y;i++){
          System.out.print("enter arr1["+i+"]:");
           arr1[i]=sc.nextInt();
        }

         int []sum=new int[x>y?x:y];


         twosum(arr, arr1, sum);


    }
}
