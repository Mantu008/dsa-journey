import java.util.ArrayList;

public class liders_in_array {
public static void main(String[] args) {
 
  int arr[]={16,17,4,3,5,2};
  ArrayList<Integer>ans=new ArrayList<>();
  ArrayList<Integer>ans1=new ArrayList<>();

  int n=arr.length;

  int max=arr[n-1];
  ans.add(max);

  for(int i=n-2;i>=0;i--){
      if(arr[i]>max){
         max=arr[i];
         ans.add(max);
      }
  }

   
   int j=0;

   for(int i=ans.size()-1;i>=0;i--){
       ans1.add(j,ans.get(i));
       j++;
   }
  

  System.out.println(ans1);
   

}
}