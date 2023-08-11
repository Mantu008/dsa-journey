import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class nger {

    public static void nextgrator_right(int []arr,int []nge,int size,Stack<Integer>st){

              

            for(int i=size-1;i>=0;i--){ 
               
                while(!st.empty() && st.peek()<=arr[i]){
                       st.pop();
                }

                    if(st.empty()==false){
                       nge[i]=st.peek();
                    }else{
                        nge[i]=-1;
                    }

                      st.push(arr[i]); 
                    
            }
    }
    public static void main(String[] args) {
        int arr[]={1,9,4,6};
        int size=arr.length;
        int nge[]=new int[size];
        Stack<Integer> st=new Stack<>();
        Map<Integer,Integer> m=new HashMap<>();
        int nums1[]={9,4};
        int []nge2=new int[nums1.length];

        nextgrator_right(arr, nge, size,st);

        System.out.println( "");

        for(int i=0;i<size;i++){
           
            System.out.print(nge[i]+" ");
        }

          //putting valuein map with key, value pair

        for(int i=0;i<size;i++){
            m.put(arr[i], nge[i]);
        }

        System.out.println("");
        System.out.println("print map.....");

        System.out.println(m);


           //set next grator element for  given values as nums1 array  

          for(int i=0;i<nums1.length;i++){
            nge2[i]=m.get(nums1[i]);
        }

        //printing  next grator element for given number

        for(int i=0;i<nge2.length;i++){
            System.out.print(nge2[i]+" ");

        }





        



    }
}
