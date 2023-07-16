
public class test {

    public static void main(String[] args) {
        int [] arr={12,345,2,6,7896};
        int l=arr.length;
       int p= findevennumelement(arr, l);

       System.out.println(p);

     
    
        
    
    }

    static int findevennumelement(int []arr,int l){
        
        int x=0;

        for(int i=0;i<l;i++){
            int count=0;
            int j=arr[i];     
            count=(int)Math.log10(j)+1;
           

             if(count%2==0){
                  x++;
             }
        }

        
        return x;
    }

    
}