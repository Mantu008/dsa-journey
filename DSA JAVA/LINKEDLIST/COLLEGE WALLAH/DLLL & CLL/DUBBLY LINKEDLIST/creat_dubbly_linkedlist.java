public class creat_dubbly_linkedlist {

          static Node head;
          static Node tail;
          static int size=0;

           public static class Node{
           int value;
           Node next;
           Node prev;

            Node(int val){
                 this.value=val;
            }
       }
          
          public static void addLast_withTail(int val){
                Node temp=new Node(val);
                if(size==0){
                      head=tail=temp;
                      temp.prev=null;
                }else{
                  temp.next=null;
                  tail.next=temp;
                  temp.prev=tail;
                  tail=temp;
                }

                size++;
          }
           public static void addLast_withoutTail(int val){
                Node temp=new Node(val);
                Node n=head;
                if(size==0){
                      head=tail=temp;
                      temp.prev=null;
                }else{

                     while(n.next!=null){
                        n=n.next;
                  }

                   temp.next=null;
                   n.next=temp;
                   temp.prev=n;
                   tail=temp;        //it is use only this condition because here tail is present so for mantanig both method ordering here we increse tail
                }

                size++;
          }

           public static void addFirst(int val){
                Node temp=new Node(val);
                if(size==0){
                      head=tail=temp;
                      temp.prev=null;
                }else{
                   temp.prev=null;
                   temp.next=head;
                   head.prev=temp;
                   head=temp;    
                }

                size++;
          }

          public static void addAtIndex(int inx,int val){
                Node temp=new Node(val);

                 if(inx==0){
                      addFirst(val);
                }else if(inx==size){
                      addLast_withTail(val);
                }else{
                       Node n=head;
                   for(int i=0;i<inx-1;i++){
                        n=n.next; 
                   }  
                   
                    temp.next=n.next;
                    n.next.prev=temp;
                    n.next=temp;
                    temp.prev=n;
                }

                size++;
          }


          static void Delit_First(){
             if(size==0){
                 System.out.println("empty dll");
             }else if(size==1){
                  head=tail=null;
                  size=0;
             }else{
                  head=head.next;
                  head.prev=null;
                  size--;
             }
          }

          static void Delit_Last_with_using_tail(){
               if(size==0){
                 System.out.println("empty dll");
             }else if(size==1){
                  head=tail=null;
                  size=0;
             }else{
                 Node temp;
                 temp=tail.prev;
                 temp.next=null;
                 tail=temp;
                  size--;
             }
          }

           static void Delit_Last_without_using_tail(){
               if(size==0){
                 System.out.println("empty dll");
             }else if(size==1){
                  head=tail=null;
                  size=0;
             }else{
                 Node temp=head;

                 while(temp.next.next!=null){
                       temp=temp.next;
                 }
                 temp.next=null;
                 tail=temp;          //(only increment it has not contribution here)it is use only this condition because here tail is present so for mantanig both method ordering here we increse tail
                  size--;
             }
          }

   
          static void Delit_At_Index(int inx){
                 if(size<0){
                 System.out.println("empty dll");
             }else if(inx>size-1){
                     System.out.println("invalid argument");
             }else if(inx==0){
                  Delit_First();
             }else if(inx==size-1){
                 Delit_Last_without_using_tail();
             }else{
                  Node temp=head;
                  for(int i=0;i<inx-1;i++){
                        temp=temp.next;
                  }
                  temp.next=temp.next.next;
                  temp.next.prev=temp;
                  size--;
             }
          }
     

       public static void display_next(Node head){
          Node temp=head;
          while(temp!=null){
                System.out.print(temp.value +" ");
                temp=temp.next;
          }
          System.out.println();
          System.out.println("size="+size);
       }

       public static void display_rev(Node tail){
          Node temp=tail;
          while(temp!=null){
                System.out.print(temp.value +" ");
                temp=temp.prev;
          }
          System.out.println(" ");
       }


       public static void displayAllFromAnyIndex(Node x){
          Node temp=x;
          while(temp.prev!=null){
                temp=temp.prev;
          }

            //temp is now head of given linkedlist
         
            while(temp!=null){
                  System.out.print(temp.value+" ");
                  temp=temp.next;
            }
            System.out.println(" ");
          
       }

    public static void main(String[] args) {

    
     addLast_withTail(1);
     addLast_withTail(2);
     addLast_withTail(3);
     addLast_withTail(4);
     addLast_withTail(5);
     addFirst(10);
     addLast_withoutTail(89);
     addLast_withTail(45);
     addAtIndex(1, 67);
     addAtIndex(2, 77);

     Delit_First();
     Delit_Last_with_using_tail();     //  or   (Delit_Last_without_using_tail();) both are same method difference is one has tail refrence another has only head refrence.
     Delit_At_Index(1);
                      

     display_next(head);
 






    }
}
