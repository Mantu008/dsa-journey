
public class linkedlisttostackadepter {

       static Node head;
       static int size=0;

      public  static  class Node{
                int data;
                Node next;
      }


   static void  push(int val){                           //push is  addfirst function...
    Node temp=new Node();
    temp.data=val;
       if(size==0){
            temp.next=null;
       }else{
          temp.next=head;
       }
   head=temp;
    size++;
   }


   static void  pop(){                            //pop is remove function...
    if( size==0){
        System.out.println("stack uynderflow.."); 
    }else{
        head=head.next;
        size--;
    }
   }

   static void  peek(){                      // it is getfirst function...
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

          push(4);
          push(6);
          push(45);

          display();
          
          pop();
          display();
          peek();
          pop();
          display();
          peek();
          pop();
          display();
          peek();

          




    }
}
