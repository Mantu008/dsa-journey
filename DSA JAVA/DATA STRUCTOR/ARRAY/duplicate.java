public class duplicate {

    static int present(int []marks){
        int n=marks.length;
        for(int i=0;i<n-1;i+=2){
           if(marks[i]!=marks[i+1]){
               return marks[i];
               
           }
           
        }
        return -1;
   }
    public static void main(String[] args) {
        
            
        int [] marks={3,3,7,7,34,34,8,8,9,9,10,10};

        int x=present(marks);
        System.out.println(x);
    }
}
