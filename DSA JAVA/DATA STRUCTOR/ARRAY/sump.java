
public class sump {
   
     static int sumx(int []arr,int target){
      int count=0;
      int sum;
            for(int i=0;i<arr.length-1;i++){
                  for(int j=i+1;j<arr.length;j++){
                    sum=arr[i]+arr[j];
                    if(sum==target){
                      count++;
                      System.out.print(i+" ");                   
                      System.out.println(j);
                      

                    }
                  }
            }
            return count;
     }
    public static void main(String[] args) {
        
      int [] arr={3,2,6,4,8,5,1,0};

      int x=sumx(arr, 2);
      System.out.println("sum possibliti is:"+x);
      
    }
}
