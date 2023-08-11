
import java.util.Stack;

public class ngecerclur {

    public static void ngeop(int []arr,int []nge,int size,Stack<Integer>st){

             

            for(int i=2*size-1;i>=0;i--){ 
               
                while(!st.empty() && st.peek()<=arr[i%size]){
                       st.pop();
                }

            if(i<size){
                      if(st.empty()==false){
                       nge[i]=st.peek();
                    }else{
                        nge[i]=-1;
                    }
            }

                   st.push(arr[i%size]); 

            }

                      
                    
            }
    
    public static void main(String[] args) {
        int arr[]={4,12,5,3,1,2,5,3,1,2,4,6};
        int size=arr.length;
        int nge[]=new int[size];
        Stack<Integer> st=new Stack<>();

        ngeop(arr, nge, size,st);

        System.out.println("");

        for(int i=0;i<size;i++){
           
            System.out.print(nge[i]+" ");
        }


    }
}
