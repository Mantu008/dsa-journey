public class Cll {

    private  Node head;
   //  private  Node tail;


      private class Node{

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



   //  public void incertLast(int val){
   //      Node temp =new Node(val);
   //      if(head==null){                                          //it is use when we use tail node.
   //            head=tail=temp;                
   //      }else{
   //         tail.next=temp;
   //         temp.next=head;
   //         tail=temp;
   //      }
   //   }

      public void incertLast(int val){
        Node temp =new Node(val);
        if(head==null){
              head=temp;
              head.next=head;
        }else{
               Node n=head;
            while(n.next!=head){
                   n=n.next;
            }
             n.next=temp;
             temp.next=head;
        }
     }


     public void display(){
         // Node temp=head;
         //  if(temp==null){
         //     System.out.println("list is empty");  
         //  }else{
         //           do{
         //      System.out.print(temp.value+ "->");
         //      temp=temp.next;
         //     }while(temp!=head);
         //       System.out.println("END");
         //  }

            Node temp=head.next;

            while(temp!=head){
               System.out.print(temp.value+" ");
               temp=temp.next;
            }

          }
         

     public void delet_head(){
          Node temp=head;
        
          if(temp==null){
                  System.out.println("list is empty");
          }else if(head.next==temp){
                  head=null;  
          }else{
              while(temp.next!=head){
                     temp=temp.next;
              }
              head=head.next;
              temp.next=head;
          }
         
    }


    public static void main(String[] args) {
        
            Cll list=new Cll();

            list.incertLast(1);
            list.incertLast(2);
            list.incertLast(3);
            list.incertLast(4);
            list.incertLast(5);
          

            list.display();
         
         

    }
}
