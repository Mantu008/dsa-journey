import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class joshaphos_problom {

       public static void solve(int index,int k,int size,List<Integer>l){
              if(size==1){
                     return;
              }

              index=(index+k)%size;
              l.remove(index);
              solve(index,k, size-1, l);

       }
    public static void main(String[] args) {
    List<Integer>l=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter n:");
    int n=sc.nextInt();
    System.out.print("Enter k:");
    int k=sc.nextInt();
    k=k-1;
    int index=0;

    for(int i=0;i<n;i++){
       l.add(i,i+1);
    }
    int size=l.size();

    solve(index,k,size,l);

    System.out.println(l.get(0));

    
       

    }
}
