import java.util.ArrayList;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class diameterofBT {

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


    public static int dia(Node node){

       if(node==null){
          return 0;
       } 

       int ld= dia(node.left);
       int rd= dia(node.right);

       int f=height(node.left)+height(node.right)+2;

       int dia=Math.max(f,Math.max(ld,rd));

       return dia;
    }
 

  public static int height(Node node){

    if(node==null){
         return -1; //  -1 for eges and 0 for nodes
    }

    int lh=height(node.left);
    int rh=height(node.right);
    int th=Math.max(lh, rh)+1;

    return th;

  }

  public static class DiaPair{
           int ht;
           int dia;
    }



  public static DiaPair diameter1(Node node){

      if(node==null){
          DiaPair bp=new DiaPair();
          bp.ht=-1;
          bp.dia=0;
          return bp;  
      }

        DiaPair lp=diameter1(node.left);
        DiaPair rp=diameter1(node.right);

        DiaPair mp=new DiaPair();

        mp.ht=Math.max(lp.ht,rp.ht)+1;

        int fes=lp.ht+rp.ht+2;

        mp.dia=Math.max(fes,Math.max(lp.dia,rp.dia));

        return mp;

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


     
      System.out.println("diameter of given tree using first method is:-"+dia(root));


      DiaPair d=diameter1(root);
      System.out.println("diameter of the given tree is using second method:-"+d.dia);


     
    }
}
