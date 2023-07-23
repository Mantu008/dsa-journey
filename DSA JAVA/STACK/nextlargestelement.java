import java.util.Stack;

public class nextlargestelement {
  public static void main(String[] args) {
    // int arr[]={1,3,2,4};
    // int n=arr.length;
    // int largest=0;                   // it is brot force solution which time complixity is O(n^2)

    // for(int i=0;i<n;i++){
    //     for(int j=i+1;j<n;j++){
    //         if(arr[i]<arr[j]){
    //              largest=arr[j];
    //              System.out.println(largest);
                
    //          i++;
               
    //         }
    //     }
    // }


    int []arr={1,3,0,0,1,2,4};
    
    Stack<Integer> s=new Stack<>();
    int size=arr.length-1;

     s.push(-1);

      for(int i=size-1;i>=0;i--){

        while(s.size()>0 && arr[i]>=s.peek()){
            s.pop(); 
        }

        if(s.size()==0){
            s.push(-1);   
        }else{
             s.push(s.peek());
        }
        
      }

      System.out.println(s);
      




    
  }  
}