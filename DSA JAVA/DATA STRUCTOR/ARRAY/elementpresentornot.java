public class elementpresentornot {

    static int present(int []marks){
         int n=marks.length;
         int b=40;
         for(int i=0;i<n;i++){
            if(marks[i]==b){
                return i;
            }
         }
         return -1;
    }
    public static void main(String[] args) {
        
        int [] marks={10,67,40,30,60};

        int x=present(marks);
        System.out.println("present at index:"+x);


    }
}
