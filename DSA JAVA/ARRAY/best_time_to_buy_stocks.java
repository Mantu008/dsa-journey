public class best_time_to_buy_stocks {
public static void main(String[] args) {
 
  int arr[]={7,1,5,3,6,4};

  int min=Integer.MAX_VALUE;
  int curr=0;
  int maxprofit=0;

  for(int i=0;i<arr.length;i++){
      curr=arr[i];
      min=Math.min(min,curr);
      
      if(curr-min>maxprofit){
          maxprofit=curr-min;
      }
  }

   System.out.println("best time to buy stocks is:-"+maxprofit);


    

}
}