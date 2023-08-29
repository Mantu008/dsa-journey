import javax.swing.plaf.nimbus.State;

public class queue_using_linkedlist_using_addLast_removeFirst_getFirst {

    static Node head;
    static Node tail;
    static int size=0;

     static class Node{
           int data;
           Node next;
     }


     static void  push(int val){                           //push is  addfirst function...
        Node temp=new Node();
        temp.data=val;
        temp.next=null;
           if(size==0){
                 head=tail=temp;
           }else{
               tail.next=temp;
               tail=temp;
           }
      
        size++;
       }
    


     static void  pop(){                              //pop is removefirst function...
        if( size==0){
            System.out.println("stack underflow.."); 
        }else{
            head=head.next;
            size--;
        }
       }
     
       static void  peek(){                         // it is getfirst function...
            if(size==0){
                System.out.println("stack uynderflow..");
            }else{
                  System.out.println("top element of stack is:"+head.data);
            }
       }
    
       static void display(){                          // it is simple display function that display present element of stack..
             Node temp=head;
             if(size==0){
                  System.out.println("stack is empty..");
             }else{
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

       
    }
}
