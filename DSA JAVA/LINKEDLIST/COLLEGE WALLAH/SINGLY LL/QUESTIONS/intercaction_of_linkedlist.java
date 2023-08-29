public class intercaction_of_linkedlist {

    private  Node head;
    private int size=0;

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

  public void incertLast(int val){
    Node temp =new Node(val);
    temp.next=null; 
    if(size==0){
          head=temp;
    }else{
        Node n=head;
        while(n.next!=null){
            n=n.next;
        }
        n.next=temp;
    }
    size++;
 }


 public void display(){
    Node temp=head;

    while(temp!=null){
        System.out.print(temp.value+ "->");
        temp=temp.next;
    }
    System.out.println("END");
    System.out.println("size of LL is:"+size);
     
}

   public int sizeofsll(){
          Node temp=head;
          int s=0;
          while(temp!=null){
              s++;
              temp=temp.next;
          }

          return s;
          
   }

     public static int intersection(intercaction_of_linkedlist sll1,intercaction_of_linkedlist sll2){

                    Node temp1=sll1.head;
                    Node temp2=sll1.head;
                    
                    if(sll1.size>=sll2.size){
                           int m=sll1.size-sll2.size;
                           while(m-->0){
                                 temp1=temp1.next;
                           }

                           while(temp1!=temp2){
                                 temp1=temp1.next;
                                 temp2=temp2.next;
                           }
                           return temp1.value;
                    }else{
                         int m=sll2.size-sll1.size;
                           while(m-->0){
                                 temp2=temp2.next;
                           }

                           while(temp1!=temp2){
                                 temp1=temp1.next;
                                 temp2=temp2.next;
                           }
                           return temp1.value;
                    }
                
     }



public static void main(String[] args) {
    
    intercaction_of_linkedlist sll1=new intercaction_of_linkedlist();
    intercaction_of_linkedlist sll2=new intercaction_of_linkedlist();

    sll1.incertLast(2);
    sll1.incertLast(4);
    sll1.incertLast(7);
    sll1.incertLast(9);
    // sll1.incertLast(11);
    // sll1.incertLast(15);
     sll1.display();

    sll2.incertLast(8);
    sll2.incertLast(1);
    sll2.incertLast(12);
    sll2.incertLast(9);
    sll2.incertLast(11);
    // sll2.incertLast(15);
    sll2.display();

    
   
   int y=intersection(sll1, sll2);
   System.out.println("intersection point is:"+y);
     

    

         
}
    
}