import java.util.ArrayList;
import java.util.Stack;

public class is_tree_bst {

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

    public static class BSTPair{
        boolean isBST;
        int min;
        int max;
    }

    public static  BSTPair isBST(Node node){
        if(node==null){
          BSTPair bp=new BSTPair();
          bp.min=Integer.MAX_VALUE;
          bp.max=Integer.MIN_VALUE;
          bp.isBST=true;
          return bp; 
        }
        

        BSTPair lp=isBST(node.left);
        BSTPair rp=isBST(node.right);
        BSTPair mp=new BSTPair();
        mp.isBST=lp.isBST && rp.isBST && (node.value>=lp.max && node.value<=rp.min);
        mp.min=Math.min(node.value,Math.min(lp.min, rp.min));
        mp.max=Math.max(node.value,Math.max(lp.max, rp.max));

        return mp;
    }

  




    public static void main(String[] args) {
     
    // Integer arr[]={50,25,12,null,null,87,30,null,null,null,75,62,null,70,null,null,87,null,null};
    // Integer arr[]={1,2,4,null,null,null,3,5,null,null,6,null,null};
    Integer arr[]={2,2,null,null,2,null,null};
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


       System.out.println("given tree is bst or not");
       BSTPair bp=isBST(root);
       
       System.out.println(bp.isBST);
        

    }
}