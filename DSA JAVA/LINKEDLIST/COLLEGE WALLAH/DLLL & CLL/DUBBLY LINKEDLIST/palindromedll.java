
public class palindromedll {

    static Node head;

     public static class Node{
     int value;
     Node next;
     Node prev;

      Node(int val){
           this.value=val;
      }
 }
    
         public static void addLast_withoutTail(int val){
               Node temp=new Node(val);
                Node n=head;
                if(head==null){
                      head=temp;
                      temp.prev=null;
                }else{

                     while(n.next!=null){
                        n=n.next;
                  }

                   temp.next=null;
                   n.next=temp;
                   temp.prev=n;
                }
          }

          public static void display_next(Node head){
            Node temp=head;
            while(temp!=null){
                  System.out.print(temp.value +" ");
                  temp=temp.next;
            }
            System.out.println();
         }

         public static int palindrome(){
                  Node temp1=head;
                  Node temp2=head;
                //   Node s=head;
                //   Node f=head;
                  while(temp2.next!=null){
                      temp2=temp2.next;
                  }
                //   while(f!=null && f.next!=null){
                //           s=s.next;
                //           f=f.next.next;
                //   }

                 while(temp1.next!=null){
                       if(temp1.next.value!=temp2.prev.value){
                               return -1;
                       }else{
                            temp1=temp1.next;
                            temp2=temp2.prev;
                       }
                 }

              return 1;
                 

               
         }



    public static void main(String[] args) {
        addLast_withoutTail(1);
        addLast_withoutTail(2);
        addLast_withoutTail(3);
        addLast_withoutTail(3);
        addLast_withoutTail(2);
        addLast_withoutTail(1); 
        display_next(head); 
        int x=palindrome();
        if(x!=-1){
             System.out.println("given list is palindrome");
        }else{
            System.out.println("given list is not palindrome");
        }


    }
}
