public class queue_using_linkedlist_using_addfirst_removeLast_getLast {

     static Node head;
     static int size=0;

     static class Node{
           int data;
           Node next;
     }


     static void push(int var){                //this is addfirst method
         Node temp=new Node();
         temp.data=var;
         if(size==0){
            temp.next=null;
         }else{
            temp.next=head;
         }
         head=temp;
         size++;
     }

     static void pop(){                                //this is remove last method
        Node temp=head; 
        if(size==0){
            System.out.println("queue is empty...");
        }else if(size==1){
             head=null;
             size=0;   
        }else{
             for(int i=1;i<size-1;i++){
              temp=temp.next;
             }
             temp.next=null;
             size--;
        }
        
     }

      static void peek(){                                 //this is get last method
        Node temp=head;
        if(size==0){
            System.out.println("queue is empty...");
        }else if(size==1){
              System.out.println(head.data);
        }else{
             for(int i=1;i<size;i++){
              temp=temp.next;
             }
             System.out.println(temp.data);
        }
        
     }


     static void display(){                                  //this is simple display method
         if(size==0){
            System.out.println("queue is empty..");
         }else{
             Node temp=head;  
          while(temp!=null){
             System.out.print(temp.data+" ");
             temp=temp.next;
          }
          System.out.println(" ");
         }
     }

    public static void main(String[] args) {
        
        push(3);
        push(7);
        push(9);

        display();
        peek();
        pop();
        display();

        peek();
        pop();
        display();
        
        peek();
        pop();
        display();

        peek();
        pop();
        display();

    }
}
