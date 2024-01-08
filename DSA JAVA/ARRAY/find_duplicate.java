import java.util.ArrayList;

public class find_duplicate {
  public static void main(String[] args) {
     int n=5;
     int arr[]={0,2,2,3,3};
     ArrayList<Integer> list=new ArrayList<>();

      for(int i=0;i<n;i++){
          int index=arr[i]%n;
          arr[index]+=n;
      }

      for(int i=0;i<n;i++){
         if((arr[i]/n)>=2){
           list.add(i);
         }
      }

      if(list.size()==0){
          System.out.println(-1);
      }else{
          System.out.println(list);
      }


 

  }
}
