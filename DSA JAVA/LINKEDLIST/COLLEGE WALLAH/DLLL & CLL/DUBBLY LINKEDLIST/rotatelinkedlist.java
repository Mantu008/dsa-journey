public class rotatelinkedlist {

    private static  Node head;
    private  static Node  tail;
    private  static int size=0;


         private static class Node{

           private int value;
           private Node next;
           
           public Node(int value){
                 this.value=value;
           }

           public Node(int value,Node next){
                this.value=value;
                this.next=next;
           }
           
    }

    public  static void incertLast(int val){
        Node temp =new Node(val);
        temp.next=null; 
        if(size==0){
              head=tail=temp;
        }else{
           tail.next=temp;
           tail=temp;
        }
        size++;
     }

    public  static void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.value+ "->");
            temp=temp.next;
        }
        System.out.println("END");
        System.out.println("size of LL is:"+size);
         
    }

    public static void rorate(int k){

        //find length of ll
          Node temp=head; 
          int size=1;
          while(temp.next!=null){
             size++;
             temp=temp.next;
          }

       //point tail to head
        temp.next=head;
        k=size-k;
        while(k-->0){
            temp=temp.next;
        }

        //make new head and tail
        head=temp.next;
        temp.next=null;

    }
    public static void main(String[] args) {
          incertLast(1);
          incertLast(2);
          incertLast(3);
          incertLast(4);
          incertLast(5);
          display();
          rorate(2);
          display();
    }
}
