public class mountainsearch {

    static int searchmountain(int []arr){
        int start = 0;
        int end = arr.length - 1;    
     
        while (start<end) {
            int mid = start + (end - start) / 2;   
            if (arr[mid]<arr[mid+1]) {
                start=mid+1;
            } else{
               end=mid;
            }  
          
        }

        return end;
    }
    public static void main(String[] args) {
        int [] arr={24,69,100,99,79,78,67,36,26,19};

        int x=searchmountain(arr);

        System.out.println("the grator element in this mountain is:"+x);
    }
}
