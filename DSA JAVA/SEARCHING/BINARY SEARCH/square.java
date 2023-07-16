public class square {
    
    static  int squareroot(int x){
         int s=0;
         int e=x;
         int ans=0;

         while(s<=e){

            int mid=s+(e-s)/2;
            
            if(mid*mid>x){
                e=mid-1;
            }else if(mid*mid<x){
                ans=mid;
                s=mid+1;
            }else{
                return mid;
            }
         }

         return ans;
    }

    static double decimalroot(int x,int y,int prision){

        double factor=1;
        double ans=y;

        for(int i=0;i<prision;i++){

            factor=factor/10;
            

            for(double j=ans;j*j<x;j=j+factor){
                ans=j;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x=18;

        int y=squareroot(x);

        System.out.println("suuare root of the given number is:"+y);


        double z=decimalroot(x, y, 3);

        System.out.println("the square root of a given number upto 3 decimal number is:"+z);
    }
}
