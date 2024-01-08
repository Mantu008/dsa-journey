import java.util.Arrays;

public class calculate_mony {
  public static void main(String[] args) {
    
        int n=10;

        

        int deposit=1;
        int outpot=0;
        int newmonday=1;

        for(int i=1;i<=n;i++){
            outpot+=deposit;
            deposit++;
            if(i%7==0){
               newmonday++;
               deposit=newmonday;
            }
        }

        System.out.println("the calculated mony is:-"+outpot);

  }
}
