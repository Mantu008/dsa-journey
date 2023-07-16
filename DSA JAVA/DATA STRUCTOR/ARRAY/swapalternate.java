

public class swapalternate {

        public static void swap(int [] arr){
             int temp;
            for(int i=0;i<arr.length-1;i+=2){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }

        }
    public static void main(String[] args) {

        int [] arr={1,4,9,5,4,6,2,7};

        System.out.println("before swaping...");

        for(int x:arr){
            System.out.print(x+" ");
        }


        swap(arr);


        System.out.println(" ");


        System.out.println("after swaping...");

        for(int x:arr){
            System.out.print(x+" ");
        }
        
    }
}
