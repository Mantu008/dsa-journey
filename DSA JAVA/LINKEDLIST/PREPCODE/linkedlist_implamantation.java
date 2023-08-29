
public class linkedlist_implamantation {

       public static Node head;
       public static Node tail;
       public static int  size;

    public static class Node{
        int data;
        Node next;
    }


      public static void addLast(int val) {

        Node temp = new Node();
        temp.data = val;
        temp.next = null;

        if (size == 0) {
          head = tail = temp;
        } else {
          tail.next = temp;
          tail = temp;
        }

        size++;
      }

       public static void addFirst(int val) {

        Node temp = new Node();
        temp.data = val;
        temp.next = head;

        if (size == 0) {
          head = tail = temp;
        } else {
              head=temp;
        }

        size++;
      }


      public static void add_At_Index(int val,int index) {

        Node node = new Node();
        node.data = val;

        if( index<1 || index>size+1){
              System.out.println("invalid input");
        }else if(index==1){
            addFirst(val); 
        }else if(index==size+1){
                addLast(val);
        }else{

               Node temp=head;
               for(int i=1;i<index-1;i++){
                     temp=temp.next;
               }
                node.next=temp.next;
                temp.next=node;
                size++;


        }

      }


      public static void display(){

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.println();
        System.out.println("size of LL is:"+size);
         
    }

     public static void remove_first_ele(){

      if(size==0){
          System.out.println("List is empty");
      }else if(size==1){
            head=tail=null;
            size=0;
      }else{ 
           head=head.next;
           size--;
      }
         
    }

      public static void remove_At_Index(int index){

      if(size==0){
           System.out.println("list is empty");
      }else if(index>size || index<1){
           System.out.println("invalid argument");
      }else if(index==size){
              remove_last_ele();
      }else if(index==1){
             remove_first_ele();
      }else{
             Node temp=head;
             for(int i=1;i<index-1;i++){
                      temp=temp.next;
             }
             temp.next=temp.next.next; 
             size--; 
      }
         
    }

     public static void remove_last_ele(){

      if(size==0){
          System.out.println("List is empty");
      }else if(size==1){
            head=tail=null;
            size=0;
      }else{
             Node temp=head;
             
             for(int i=1;i<size-1;i++){
                temp=temp.next;
             }

             tail=temp;
             tail.next=null;
             size--;  

      }
         
    }


      public static void get_First(){
               if(size==0){
                System.out.println("list is empty");
               }else{
                  System.out.println("the first element of list is:"+head.data);
               }
      }

      public static void get_Last(){
               if(size==0){
                System.out.println("list is empty");
               }else{
                  System.out.println("the first element of list is:"+tail.data);
               }
      }


        public static void get_At_Index(int index){
               if(size==0){
                System.out.println("list is empty");
               }else if(index>size || index<0){
                    System.out.println("invalid argument");
               }else{
                   Node temp=head;
                   int j=1;
                  while(temp!=null){
                       if(j==index){
                            System.out.println("value odf given particular index is:"+temp.data);
                       }
                       j++;
                       temp=temp.next;
                  }
               }
      }


         


   public static Node getnode_At(int index){
            Node temp=head;
            for(int i=0;i<index;i++){
                 temp=temp.next;
            }
          return temp;
  }

    public static void revLL(){
          int li=0;
          int ri=size-1;

          while(li<ri){
              Node left=getnode_At(li);
              Node right=getnode_At(ri);
              int temp=left.data;
              left.data=right.data;
              right.data=temp;
              li++;
              ri--;
          }
  }


  public static void revLLusing_pointer(){
        Node pre=null;
        Node curr=head;

        while(curr!=null){
          Node next=curr.next;
          curr.next=pre;
          pre=curr;
          curr=next;
        }

        Node temp;
        temp=head;
        head=tail;
        tail=temp;
              
  }


  
    
    public static void main(String[] args) {
        

        addLast(5);
        addLast(6);
        addLast(7);
        addFirst(3);
       

        display();


  

        
    


    }
}
