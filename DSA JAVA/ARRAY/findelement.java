import java.util.*;
public class findelement {

    static int find(int []arr,int n){
        int l=arr.length;
          for(int i=0;i<l;i++){
            if(arr[i]==n){
                  return i;
            }
          }

          return -1;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in); 
      System.out.print("inter size of an array:");
      int x=sc.nextInt();

      int [] arr=new int[x];

      for(int i=0;i<x;i++){
        System.out.print("enter arr["+i+"]:");
         arr[i]=sc.nextInt();
      }

      System.out.print("enter num for opretion:");
      int n=sc.nextInt();

      int result=find(arr, n);

      System.out.println("the index of finding element is:"+result);




    }
}
