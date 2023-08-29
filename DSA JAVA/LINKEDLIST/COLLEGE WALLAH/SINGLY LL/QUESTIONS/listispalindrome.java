public class listispalindrome {


    private  Node head;

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

    public void incertLast(int val){
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
    

     public void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.value+ "->");
            temp=temp.next;
        }
        System.out.println("END");
         
    }

    

    public Node mid(){
        Node s=head;
        Node f=head;
        while(f!=null && f.next.next!=null){
              s=s.next;
              f=f.next.next;
        }
        return s;
    }

     public void revuptomid(Node mid){
          Node curr=head;
          Node pre=null;
          Node n;
          while(curr!=mid){
            n=curr.next;
            curr.next=pre;
            pre=curr;
            curr=n;
          }
     }
    public static void main(String[] args) {
        listispalindrome l1=new listispalindrome();

        l1.incertLast(3);
        l1.incertLast(2);
        l1.incertLast(1);
        l1.incertLast(3);
        l1.incertLast(2);
        l1.incertLast(1);

        l1.display();

        Node mid=l1.mid();

         System.out.println(mid.value);
        
        l1.revuptomid(mid);
        l1.display();
    }
}
