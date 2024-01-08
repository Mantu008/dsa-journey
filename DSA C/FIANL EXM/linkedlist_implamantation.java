public class linkedlist_implamantation {

  
     public static Node head;

    public static class Node{
        Node next;
        int data;
     }

     public static void addLast(int val){
      
        Node temp=new Node();
        temp.data=val;
        
        if(head==null){
          head=temp;
        }else{
           Node tempnode=head;
           while(tempnode.next!=null){
               tempnode=tempnode.next;
           }
           
           tempnode.next=temp;
        }

     }

     public static void addFirst(int val){
         Node temp=new Node();
         temp.data=val;
         
         if(head==null){
           head=temp;
           head.next=null;
         }else{
            temp.next=head;
            head=temp;
         }
     }

    public static void removeLast(){
        Node tempnode=head;
        while(tempnode.next.next!=null){
           tempnode=tempnode.next;
        }
        tempnode.next=null; 
    }

    public static void removeFirst(){
        Node tempnode=head;
        head=head.next;
    }



    public static void display(){
       Node tempnode=head;
       
       while (tempnode!=null) {
          System.out.print(tempnode.data+"->");
          tempnode=tempnode.next;
       }
       System.out.println();

    }
     


  public static void main(String[] args) {
    
     addLast(5);
     addLast(3);
     addFirst(4);
     display();

     removeLast();
     display();

     removeFirst();
     display();


     addFirst(99);
     addLast(77);
     display();

  }
}
