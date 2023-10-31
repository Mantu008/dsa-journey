import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

import javax.swing.tree.TreeNode;

import org.w3c.dom.Node;

public class max_width {

  public static class Node{
    int value;
    Node left;
    Node right;

    Node(int value,Node left ,Node right){
       this.value=value;
       this.left=left;
       this.right=right;
    }
}

public static class pair{
       Node node;
       int state;

       pair(Node node,int state){
          this.node=node;
          this.state=state;
       }
}

public static void display(Node node){

    if(node==null){
        return;
    }

    System.out.print(node.value+"-->");

    display(node.left);
    display(node.right);
}


   public static class pair1{
       Node node=null;
       int idx=0;
       pair1(Node node,int idx){
             this.node=node;
             this.idx=idx;
       } 
    }


  public static int width(Node root){
      LinkedList<pair1> que=new LinkedList<>();
      int max=0;
      que.addLast(new pair1(root,0));
      while(que.size()!=0){
        int size=que.size();
        int lm=que.getFirst().idx;
        int rm=que.getFirst().idx;

        while(size-->0){
          pair1 rp=que.removeFirst();
          rm=rp.idx;

          if(rp.node.left!=null){
              que.addLast(new pair1(rp.node.left,rp.idx*2+1));
          }

          if(rp.node.right!=null){
              que.addLast(new pair1(rp.node.right,rp.idx*2+2));
          }
        }

         max= Math.max(max,rm-lm+1);
        
      }

      return max;
  }


  public static void main(String[] args) {
        
    // Integer arr[]={50,25,12,null,null,87,30,null,null,null,75,62,null,70,null,null,87,null,null};
    Integer arr[]={1,2,4,null,null,null,3,5,null,null,6,null,null};
    // Integer arr[]={1,2,null,null,3,null,null};
    ArrayList<Integer>result=new ArrayList<>();

    //construct a tree for given data
    Stack<pair> st=new Stack<>();
    Node root =new Node(arr[0], null, null);
    pair rtp=new pair(root, 1);
    st.push(rtp);
    int idx=0;

    while(st.size()>0){
        pair top=st.peek();
        if(top.state==1){
              idx++;
            if(idx < arr.length && arr[idx]!=null){ 
              top.node.left=new Node(arr[idx],null,null);
              pair lp=new pair(top.node.left,1);
              st.push(lp);
            }else{
                 top.node.left=null;
            }
            top.state++;
        }else if(top.state==2){
            idx++;
            if(idx < arr.length && arr[idx]!=null){
              top.node.right=new Node(arr[idx],null,null);
              pair rp=new pair(top.node.right,1);
              st.push(rp);
            }else{
                 top.node.right=null;
            }
            top.state++;
        }else{
            st.pop();
        }
    }

     System.out.println("preorder traversal is:-");
     display(root);

     System.out.println();
     System.out.print("max width of binary tree:-");
     int max_width=width(root);
     System.out.println(max_width);
  }
}
