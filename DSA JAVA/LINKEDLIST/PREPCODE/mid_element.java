public class mid_element {


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
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
   System.out.println(" ");
     
}

    static void get_midelement(){
         Node f=head;
         Node s=head;

         while(f.next!=null && f.next.next!=null){
             s=s.next;
             f=f.next.next;
         }

         System.out.println("the mid element of list is:"+s.data);
    }

    public static void main(String[] args) {
        

        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);

        display();
        
        get_midelement();

    }
}
