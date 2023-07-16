
public class span {

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

    static int min(int [] arr){
        int n=arr.length;
        int min=arr[0];
        for(int i=0;i<n;i++){
           if(arr[i]<min){
            min=arr[i];
           }            
        }
        return min;
    }

    static int span(int max,int min){

        return max-min;
    }
    public static void main(String[] args) {
        
        int [] arr={1,4,7,8,5,9};

       int x= max(arr);
       int y= min(arr);

       System.out.println("max element in given array"+x);
       System.out.println("min element in given array:"+y);

       int z=span(x, y);
       System.out.println("span of an array is:"+z);
    }
}
