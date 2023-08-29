public class swap_node_inpair {


    public static Node head;
    public static Node tail;
    public static int  size;

 public static class Node{
     int data;
     Node next;
 }

    public static void addLast(int val) {

        Node temp = new Node();
        temp.data = val;
        temp.next = null;

        if (size == 0) {
          head = tail = temp;
        } else {
          tail.next = temp;
          tail = temp;
        }

        size++;
      }

      public static void display(){

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.println();
        System.out.println("size of LL is:"+size);
         
    }

     static void rev_pair(){
        
        Node h=head;
        Node curr=head;
        Node pre=null;
        Node n=head;
        Node temp;


         while(h!=null){
             n=h.next;
             pre=n;
             curr=h;
             System.out.println(pre.data+" "+curr.data);
             h=h.next.next;

         }
        
         
     }
    public static void main(String[] args) {
        

        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);

        display();

        rev_pair();

        display();


    }
}
