import java.util.*;;
public class barchat {

    static int max(int [] arr){
        int n=arr.length;
        int max=arr[0];
        for(int i=0;i<n;i++){
           if(arr[i]>max){
            max=arr[i];
           }            
        }
        return max;
    }

    static void bar(int [] arr,int max){

        for(int floor=max;floor>=1;floor--){
            for(int j=0;j<arr.length;j++){
              if(arr[j]>=floor){
                        System.out.print("*\t");
              }else{
                System.out.print("\t");
              }
            }
            System.out.println("");
        }
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

        int y=max(arr);

        bar(arr,y);

     
    }
}
