public class dubbly_circular_LinkedList {
  
  public static Node head;

   public static class Node{
        int data;
        Node prev;
        Node next;
   }

   public static void addLast(int val){
       Node node=new Node();
       node.data=val;
       if(head==null){
          head=node;
          head.next=head;
          head.prev=head;
       }else{
         Node temp=head.prev;
         temp.next=node;
         node.prev=temp;
         node.next=head;
         head.prev=node;
       }

   }

   public static void addFirst(int val){
     Node node=new Node();
     node.data=val;
     if(head==null){
        head=node;
        head.next=head;
        head.prev=head;
     }else{
       Node temp=head.prev;
       temp.next=node;
       node.prev=temp;
       node.next=head;
       head.prev=node;
       head=node;

     }
   }

   public static void display(){
      Node temp=head;
      do{
         System.out.print(temp.data+"->");
         temp=temp.next;
      }while(temp!=head);
   }

  public static void main(String[] args) {

      addLast(1);
      addLast(2);
      addLast(3);
      addFirst(55);
      addFirst(22);
      display();

  }
}
