
import java.util.Stack;

public class maxarearectanglein_binary_matrix {

     public static int max(int arr[]){

        Stack<Integer> st=new Stack<>();
        Stack<Integer> st1=new Stack<>();
         int n=arr.length;
        int nser[]=new int[n];
        int nsel[]=new int[n];
        int width[]=new int[n];
        int area[]=new int[n];
           //calculate next smalar to right
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

        //calculate next smalar to left
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


         //calculate width of histogram


          for(int i=0;i<n;i++){
            width[i]=nser[i]-nsel[i]-1;
        }

          //calculate area of histogram
        for(int i=0;i<n;i++){
          area[i]=arr[i]*width[i];
        }

          //calculate max element of histogram
         int max=0;
        for(int i=0;i<n;i++){
            if(area[i]>max){
                max=area[i];
            }   
        }

        return max;
     }

      public static int allmax(int M[][],int r,int c){
  
        int arr[]=new int[c]; 
        int arrhisto[]=new int[r];     
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
              if(i==0){
                arr[j]=M[i][j];
              }else{
                    if(M[i][j]==0){
                       arr[j]=0;
                    }else{
                      arr[j]=arr[j]+M[i][j];
                    }
              }
        }
        arrhisto[i]=max(arr);
   }

        int maxbinary=0;

        for(int i=0;i<r;i++){
            if(arrhisto[i]>maxbinary){
              maxbinary=arrhisto[i];
            }
        }


      return  maxbinary;

      }
              
    



    public static void main(String[] args) {
        

       
   int M[][]={{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}};


   int c=M[0].length;
   int r=M.length;

   
  int z=allmax(M, r,c);

  System.out.println("max area reactangle in binary matrix is:"+z);


    }
}

