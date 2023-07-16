import java.util.ArrayList;

class subarray
{

    static ArrayList<Integer> sub(int []s,int t,int n){

        ArrayList<Integer> b=new ArrayList<>(); 
         
        int k=0;
        
        for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){

               k=s[i]+s[j];
               
               if(k==t){
                  
                  b.add(i);
                  b.add(j);
                  
      
               }
           }
            
        }

        return b;
    }

        public static void main(String[] args) {

                       
            int []s={1,2,3,7,5};
            int n=s.length;
            
            ArrayList<Integer>p= sub(s, 12,n);
            System.out.println(p);

             System.out.println("mantu");

        }
        
    }
