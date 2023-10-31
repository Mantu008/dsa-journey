import java.util.ArrayList;
import java.util.Stack;

public class transforme_leftclone_tree {

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

    public static void simpledisplay(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.value+"-->");
        simpledisplay(node.left);
        simpledisplay(node.right);
    }

    

    public static Node left_clone(Node node){
        if(node==null){
            return null;
        }

        Node lcr=left_clone(node.left);
        Node rcr=left_clone(node.right);

        Node nn=new Node(node.value,lcr,null);
        node.left=nn;
        node.right=rcr;


        return node;
    }

 public static Node transform_back(Node node){
    
    if(node==null){
        return null;
    }

    Node lnn=transform_back(node.left.left);
    Node rnn=transform_back(node.right);
    node.left=lnn;
    node.right=rnn;

    return node;

 }


    public static void main(String[] args) {
    Integer arr[]={1,2,4,null,null,null,3,5,null,null,6,null,null};
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


    System.out.println("display given tree before cloning..");
    simpledisplay(root);                                         //print the tree before cloning

     System.out.println();
     System.out.println("Transform Left clone Tree..");
     left_clone(root);                                      //this method is transform this tree into left cloned tree

     System.out.println("display given tree after cloning..");
     simpledisplay(root);                                        //print the tree after cloning
     
     System.out.println();
     System.out.println("transform back from left clone tree..");
     transform_back(root);                                      //this method is transforming back this tree into real form
     

     System.out.println("display given tree after transforming..");
     simpledisplay(root);     
     


    }
}
