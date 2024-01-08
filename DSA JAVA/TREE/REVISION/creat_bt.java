import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class creat_bt {

  public static class Node{
        int value;
        Node left;
        Node right;

        Node(int value,Node left,Node right){
            this.value=value;
            this.left=left;
            this.right=right;
        }
  }

  public static class Pair{
       int state;
       Node node;

      Pair(Node node,int state){
             this.node=node;
             this.state=state;
       }
       
  }


  public static void preorder(Node head){
      if(head==null){
         return;
      }
    System.out.print(head.value+"->");
    preorder(head.left);
    preorder(head.right);

  }

  static ArrayList<Integer>ans=new ArrayList<>();

  public static void kLevelFar(Node node,int k){
     if(node==null){
      return;
     }

     if(k==0){
        ans.add(node.value);
     }
     kLevelFar(node.left, k-1);
     kLevelFar(node.right, k-1);
  }




  public static void main(String[] args) {
   //given data for creating binary tree....
   Integer arr[]={1,2,4,null,null,null,3,5,null,null,6,null,null};
   Stack<Pair>st=new Stack<>();
   
   //insert first node in binart tree as a root node
   Node root=new Node(arr[0], null, null);

   //creat pair class and put value in it
   Pair rootPair=new Pair(root, 1);

   //insert Pair into the stack..
   st.push(rootPair);
   int idx=0;

   while (st.size()>0) {
      Pair top=st.peek();

      if(top.state==1){       //if state is 1 then insert node on left side
         idx++;
         if(arr[idx]!=null){
          //creat node
           top.node.left=new Node(arr[idx],null,null);
           //insert this node into the stack
           Pair lp=new Pair(top.node.left,1);
           st.push(lp);
         }else{
             top.node.left=null;
         }
         top.state++;
      }else if(top.state==2){ //if state is 2 then insert node on left side
         idx++;
         if(arr[idx]!=null){
          //creat right node
           top.node.right=new Node(arr[idx],null,null); 
           //insert this node into the stack
           Pair rp=new Pair(top.node.right,1);
           st.push(rp);
         }else{
             top.node.right=null;
         }
         top.state++;
      }else{                  //if state is 3 then pop the node
         st.pop();
      }
      
   }







   //preorder traversal...
   preorder(root);
   System.out.println();

   //print k level far element
   kLevelFar(root,1);
   System.out.println(ans);







  }
}
