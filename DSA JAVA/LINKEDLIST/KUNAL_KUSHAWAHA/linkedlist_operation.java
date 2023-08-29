import java.util.LinkedList;

public class linkedlist_operation {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        list.addLast(4);
        System.out.println("size is:"+list.size());
        list.addFirst(8);
        System.out.println("size is:"+list.size());
        System.out.println(list);
        list.removeLast();
        System.out.println("size is:"+list.size());
        System.out.println(list);
        list.removeFirst();
        System.out.println("size is:"+list.size());
        System.out.println(list);
       
      


    }
}
