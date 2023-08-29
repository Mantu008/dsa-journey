public class recursiondemo {
          static int count=1;
    public static void print(){
             if(count==6){
                 return;
             }
            System.out.println(count);
            count++;
            print();
    }
public static void main(String[] args) {
    
       print();
    
  }
}
