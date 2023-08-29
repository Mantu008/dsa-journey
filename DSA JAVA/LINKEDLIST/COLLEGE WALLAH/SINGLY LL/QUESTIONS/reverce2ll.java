public class reverce2ll {
    
    public static  Node head;

         public static class Node{

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

   public static void  incertLast(int val){
        Node temp =new Node(val);
        temp.next=null; 
        if(head==null){
              head=temp;
        }else{
            Node n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=temp;
        }
     }
    

     public static  void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.value+ "->");
            temp=temp.next;
        }
        System.out.println("END");
         
    }

    public static void reverce(int l,int r){
                   Node slow=head;
                   Node fast=head;
                   Node pre=null;
                
                 while(l-->1){
                     pre=slow;
                     slow=slow.next;
                 }

                 while(r-->1){
                     fast=fast.next;
                 }

System.out.println("previous:-"+pre.value+" current:-"+slow.value+" last:-"+fast.value);


  
                


    }

    public static void main(String[] args) {
            incertLast(1);
            incertLast(2);
            incertLast(3);
            incertLast(9);   

            reverce(2, 3);
            display();
    }
}
