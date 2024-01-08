public class singli_circular_Linkedlist {

  public static Node head;

  public static class Node{
         int data;
         Node next;
  }


  public static void addLast(int val){
    Node node=new Node();
    node.data=val;
  
     if(head==null){
          head=node;
          node.next=head;
     }else{
          Node temp=head;
          while(temp.next!=head){
              temp=temp.next;
          }

          node.next=head;
          temp.next=node;
     }
  }

  public static void addFirst(int val){
      Node node=new Node();
      node.data=val;

      if(head==null){
          head=node;
          head.next=head;
      }else{

        Node temp=head;
        while(temp.next!=head){
          temp=temp.next;
        }
        temp.next=node;
        node.next=head;
        head=node;
      }

  }


  public static void display(){
       Node temp=head;
       
       if(temp==null){
          System.out.println("list is impty");
       }else{
           do{
               System.out.print(temp.data+"->");
               temp=temp.next;
           }while(temp!=head);
       }

  }

  public static void add_at_particular_place(int val,int x){
       Node node=new Node();
       node.data=val;
       Node temp=head;
       while(temp.next.data!=x){
           temp=temp.next;
       }

       node.next=temp.next;
       temp.next=node;
  }



  public static void main(String[] args) {

    addLast(1);
    addLast(2);
    addLast(3);
    addFirst(14);
    add_at_particular_place(44, 2);
    display();

  }
}
