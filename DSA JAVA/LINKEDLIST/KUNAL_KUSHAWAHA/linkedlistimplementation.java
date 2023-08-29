

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
           Node temp =new Node(val);
           if(size==0){
              head=tail=temp;
           }else{
              temp.next=head; 
              head=temp;
           }
           size++;

        }

         public void incertLast(int val){
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

        public void incertAtIndex(int val,int inx){
            if(inx<0 || inx>size){
                 System.out.println("invalid argument");
            }else if(inx==0){
               incertFirst(val);
            }else if(inx==size){
                 incertLast(val);
            }else{
                  Node node=new Node(val);
                  Node temp=head;
                  for(int i=0;i<inx-1;i++){
                      temp=temp.next;
                  }
                  node.next=temp.next;
                  temp.next=node;
                  size++;
            }
        }


         public void DelitFirst(){
            if(size==0){
                System.out.println("list is empty.");
            }else if(size==1){
                   head=tail=null;
                   size=0;
            }else{
                head=head.next;
                size--;
            }
        }


         public void DelitLast(){
               if(size==0){
                System.out.println("list is empty.");
            }else if(size==1){
                   head=tail=null;
                   size=0;
            }else{
                   Node temp=head;
                 while(temp.next!=tail){
                        temp=temp.next;
                 }
                  tail=temp;
                  tail.next=null;
                size--;
            }
        }

         public void DelitAtIndex(int inx){
               if(size==0){
                System.out.println("list is empty.");
            }else if(size==1){
                   head=tail=null;
                   size=0;
            }else if(inx==0){
                  DelitFirst(); 
            }else if(inx==size-1){
                    DelitLast();
            }else{
                   Node temp=head;
                  for(int i=0;i<inx-1;i++){
                    temp=temp.next;
                  }
                  temp.next=temp.next.next;
                size--;
            }
        }


        public void getFirst(){
            if(size==0){
                 System.out.println("list is empty");
            }else{
                 System.out.println(head.value);
            }
        }

        public void getLast(){
            if(size==0){
                 System.out.println("list is empty");
            }else{
                 System.out.println(tail.value);
            }
        }

         public void getAtIndex(int inx){
            if(size==0){
                 System.out.println("list is empty");
            }else{
                 Node temp=head;
                 for(int i=0;i<inx;i++){
                      temp=temp.next;
                 }
                 System.out.println(temp.value);
            }
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

  
   list.incertFirst(1);
   list.incertLast(3);
   list.DelitAtIndex(0);


     list.display();

   



}
    
}