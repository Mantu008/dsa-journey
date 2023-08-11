
import java.util.Stack;

public class nser {

    public static void nextsmaller_right(Stack<Integer> st,int n,int arr[],int ngl[]){
         for(int i=n-1;i>=0;i--){
              
            while(!st.empty() && st.peek()>=arr[i]){
                st.pop();
            }

            if(st.isEmpty()==false){
              ngl[i]=st.peek();     
            }else{
                ngl[i]=-1;
            }

            st.push(arr[i]);
         }
    }
    public static void main(String[] args) {
        
        Stack<Integer> st=new Stack<>();
        int arr[]={1,9,4,6};
        int n=arr.length;
        int ngl[]=new int[n];

        nextsmaller_right(st,n,arr,ngl);

        for(int i=0;i<n;i++){
            System.out.print(ngl[i]+" ");
        }



    }
}
