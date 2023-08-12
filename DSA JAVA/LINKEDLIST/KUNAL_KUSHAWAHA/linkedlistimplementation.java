

class LL{


        private  Node head;
        private Node  tail;
        private int size;


        public LL(){
           this.size=0;
        }

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


        public void incertFirst(int val){

           Node node =new Node(val);
           node.next=head;
           head=node;
            
           if(tail==null){
                  tail=head;
           }

           size+=1;

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



    
   
    
}



public class linkedlistimplementation {
public static void main(String[] args) {
    
   LL list =new LL();

   list.incertFirst(3);
   list.incertFirst(2);
   list.incertFirst(8);
   list.incertFirst(17);

     list.display();



}
    
}