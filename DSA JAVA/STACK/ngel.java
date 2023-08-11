import java.util.Stack;

public class ngel {

    public static void nextgrator_left(Stack<Integer> st,int n,int arr[],int ngl[]){
         for(int i=0;i<n;i++){
              
            while(!st.empty() && st.peek()<=arr[i]){
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

        nextgrator_left(st,n,arr,ngl);

        for(int i=0;i<n;i++){
            System.out.print(ngl[i]+" ");
        }



    }
}
