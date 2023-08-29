import java.util.Scanner;

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


   static void  pop(){                            //pop is removefirst function...
    if( size==0){
        System.out.println("stack underflow.."); 
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


        Scanner sc=new Scanner(System.in); 
         int l=Integer.MAX_VALUE;
        
        while(l!=0){
                 System.out.print("Enter prefrence:");
                 String prefrence=sc.next();
                 
                 switch (prefrence) {

                    case "push":
                    System.out.print("Enter the value which you want to incert in the stack:"); 
                    push(sc.nextInt());    
                    break;

                    case "pop":
                    pop();    
                    break;

                    case "peek":
                    peek();    
                    break;

                    case "display":
                    display();    
                    break;


                    case "exit":
                    System.out.println("Enter value of l:");
                    l=0;    
                    break;

                    default:
                    System.out.println("invalid prefrenc...");
                    break;

                   
                   
            }
   
            


        }

    
        
          




    }
}
