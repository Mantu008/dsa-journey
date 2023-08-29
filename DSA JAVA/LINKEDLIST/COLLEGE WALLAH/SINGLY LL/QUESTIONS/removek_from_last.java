public class removek_from_last {

    static  Node head;
    static Node  tail;
    static int size=0;




        static class Node{

               int value;
               Node next;
        
        public Node(int value){
              this.value=value;
        }

        public Node(int value,Node next){
             this.value=value;
             this.next=next;
        }
        
 }

 public static void incertLast(int val){
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

  
     public static void deletk_fromlast(int k){
         Node fast=head;
         Node slow=head;

         while(k-->0){
              fast=fast.next;
         }

          if(fast!=null){
             while(fast.next!=null){
               fast=fast.next;
               slow=slow.next;
         }

           slow.next=slow.next.next;
           size--;
          }else{
               head=slow.next;
               size--;
          }
        


         
         
         
     }


 public static void display(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.value+ "->");
        temp=temp.next;
    }
    System.out.println("END");
    System.out.println("size of LL is:"+size);
     
}

    public static void main(String[] args) {
        
        incertLast(1);
        incertLast(2);
        incertLast(3);
        incertLast(4);
        incertLast(5);

        display();
        deletk_fromlast(2);
        display();
        
          

    }
}
