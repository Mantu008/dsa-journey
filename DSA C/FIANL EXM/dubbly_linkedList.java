public class dubbly_linkedList {

    public static Node head;

   public static class Node{
        Node next;
        Node prev;
        int data;
    }

    public static void addLast(int val){
         Node node=new Node();
         node.data=val;

         if(head==null){
             head=node;
         }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
            node.prev=temp;
         }
    }


    public static void addFirst(int val){
      Node node=new Node();
      node.data=val;

      if(head==null){
         head=node;
      }else{
        node.next=head;
        head.prev=node;
        head=node;
      }
    }

    public static void addParticularIndex(int val,int x){
         Node node=new Node();
         node.data=val;

         Node temp=head;
          while(temp.next.data!=x){
              temp=temp.next;
          }

          node.next=temp.next;
          temp.next.prev=node;
          temp.next=node;
          node.prev=temp;
         
    }


    public static void deletFirst(){
         if(head==null){
            System.out.println("underflow");
         }else{
            Node newHead=head.next;
            head=newHead;
         }
    }

    public static void deletLast(){
         if(head==null){
            System.out.println("underflow");
         }else{
            Node temp=head;
            while(temp.next.next!=null){
               temp=temp.next;
            }
            temp.next=null;
         }
    }


    public static void display(){
         Node temp=head;
         while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
         }
         System.out.println("");
    }




  public static void main(String[] args) {
    
      addLast(1);
      addLast(2);
      addLast(3);
      addLast(4);
      addLast(5);
      addLast(6);
      display();
      addFirst(99);
      display();
      addParticularIndex(55, 4);
      display();
      deletFirst();
      display();

      deletLast();
      display();

  }
}
