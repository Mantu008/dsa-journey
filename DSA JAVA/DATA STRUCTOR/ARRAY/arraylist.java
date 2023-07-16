import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
       ArrayList<Integer> list=new ArrayList<>(10);   //here size is not conciderd
       list.add(4);
       list.add(34);
       list.add(676);
       list.add(78);
       list.add(10);
       list.add(12);
       list.add(16);
       list.add(18);
       list.add(19);
       list.add(26);
       list.add(22);
       System.out.println("size of list is:"+list.size());
       
        
       System.out.println(list);

       System.out.println("removing element........");
       list.remove(1);
       System.out.println(list);
       System.out.println("add element.....");
       list.add(1, 454);
       System.out.println(list);



       System.out.println("swap");

       
    
       
    }
}
