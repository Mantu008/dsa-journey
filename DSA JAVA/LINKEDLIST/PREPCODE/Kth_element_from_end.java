public class Kth_element_from_end {

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

      static void get_Kth_element(int k){
            Node f=head;
            Node s=head;
            
            for(int i=1;i<k;i++){
                f=f.next;
            }

            while(f!=tail){
                f=f.next;
                s=s.next;
            }

            System.out.println("it is my kth element which we want to delit:"+s.data);
            s.data=s.next.data;
            s.next=s.next.next;

              s=head;
             while(s!=null){
                 System.out.print(s.data+" ");
                 s=s.next;
             }
      }



    public static void main(String[] args) {
        
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);

        int k=2;

        display();

        get_Kth_element(k);



         


    }
}
