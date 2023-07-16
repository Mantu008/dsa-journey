import java.util.*;
public class diffarray {

    static void twodiff(int [] arr,int [] arr1,int []diff){

        int c=0;
        int i=arr.length-1;
        int j=arr1.length-1;
        int k=diff.length-1;

        while(k>=0){
            int d=0;

            int a1v=i>=0?arr[i]:0;

            if(arr1[j]+c>=a1v){
                d=arr1[j]+c-a1v;
                c=0;

            }else
            {
                d=arr1[j]+c+10-a1v;
                c=-1;
            }

            diff[k]=d;

            i--;
            j--;
            k--;
        }
        
        int idx=0;

        while(idx<diff.length){
            if(diff[idx]==0){
                idx++;
            }else{
                break;
            }
        }
        while(idx<diff.length){
            System.out.println(diff[idx]);
            idx++;
        }



     
    }

    public static void main(String[] args) {

        
        Scanner sc=new Scanner(System.in); 
        System.out.print("inter size of first array:");
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

         int []diff=new int[y];


         twodiff(arr, arr1, diff);


    }
}
