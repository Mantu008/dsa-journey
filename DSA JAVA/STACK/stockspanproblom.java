
import java.util.Stack;

public class stockspanproblom {

    public static void nextgrator_left(Stack<Integer> st,int n,int arr[],int ngl[]){


        //    st.push(0);
        //    ngl[0]=1;

         for(int i=0;i<n;i++){
              
            while(!st.empty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }

            if(st.isEmpty()==false){
              ngl[i]=i-st.peek();   
            }else{
                ngl[i]=1;
            }

            st.push(i);
         }
    }
    public static void main(String[] args) {
        
        Stack<Integer> st=new Stack<>();
        int arr[]={100,80,60,70,60,75,85};
        int n=arr.length;
        int ngl[]=new int[n];

        nextgrator_left(st,n,arr,ngl);

        for(int i=0;i<n;i++){
            System.out.print(ngl[i]+" ");
        }

        System.out.println(" ");






    





        



    }
}

