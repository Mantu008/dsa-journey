import java.util.Stack;

public class maxareaofhistrogram {

    public static void nextsmaller_right(Stack<Integer> st,int n,int arr[],int nser[]){
        for(int i=n-1;i>=0;i--){
             
            while(!st.empty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }

            if(st.isEmpty()==false){
              nser[i]=st.peek();   
            }else{
                nser[i]=n;
            }

            st.push(i);
        }
   }


    public static void nextsmaller_left(Stack<Integer> st1,int n,int arr[],int nsel[]){
         for(int i=0;i<n;i++){
              
             while(!st1.empty() && arr[st1.peek()]>=arr[i]){
                st1.pop();
            }

            if(st1.isEmpty()==false){
              nsel[i]=st1.peek();   
            }else{
                nsel[i]=-1;
            }

            st1.push(i);
         }
    }

    public static void calculate_width(int nser[],int nsel[],int width[],int n){

        for(int i=0;i<n;i++){
            width[i]=nser[i]-nsel[i]-1;
        }

    }

     public static void calculate_area(int arr[],int width[],int area[],int n){

        for(int i=0;i<n;i++){
          area[i]=arr[i]*width[i];
        }

    }


     public static int max_area_histogram(int area[],int n){

        int max=0;
        for(int i=0;i<n;i++){
            if(area[i]>max){
                max=area[i];
            }   
        }

        return max;

    }




    public static void main(String[] args) {
        

        Stack<Integer> st=new Stack<>();
        Stack<Integer> st1=new Stack<>();
        int arr[]={2,1,5,6,2,3};
        int n=arr.length;
        int nser[]=new int[n];
        int nsel[]=new int[n];
        int width[]=new int[n];
        int area[]=new int[n];

        nextsmaller_right(st,n,arr,nser);
        nextsmaller_left(st1,n,arr,nsel);
    
        System.out.println("next smaller element to right");

        for(int i=0;i<n;i++){
            System.out.print(nser[i]+" ");
        }
        System.out.println(" ");
        System.out.println("next smaller element to left");

        for(int i=0;i<n;i++){
            System.out.print(nsel[i]+" ");
        }
         System.out.println(" ");
         System.out.println("whdth of histogram");

        calculate_width(nser, nsel, width, n);

        for(int i=0;i<n;i++){
            System.out.print(width[i]+" ");
        }
        System.out.println(" ");
        System.out.println("area of histogram");

        calculate_area(arr, width,area,n);

        for(int i=0;i<n;i++){
            System.out.print(area[i]+" ");
        }


           System.out.println(" ");

           int h=max_area_histogram(area, n);

           System.out.println("max area of histogram is:"+h);

        

      



        


        

    }
}
