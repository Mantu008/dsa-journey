import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class find_K_level_with_given_Node {

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


 public static void allnode_from_k_away(Node node,int n,int k){        
       path=new ArrayList<>();
       findpath(node, n);

       for(int i=0;i<path.size();i++){
            print_K_Level_down(path.get(i),k-i,i==0?null:path.get(i-1));
       }
  }

    
   
    static ArrayList<Node>path;
    public static boolean findpath(Node node,int data){          //for this first we find the path of giben data
        if(node==null){
             return false;
        }

        if(node.value==data){
              path.add(node);
              return true;
        }

        boolean lc=findpath(node.left,data);
        if(lc){
          path.add(node);
          return true;
        }

        boolean rc=findpath(node.right,data);
        if(rc){
           path.add(node);
           return true;
        }

        return false;
    }

    public static void print_K_Level_down(Node node,int k,Node blocker){            //then after we find k level down whth given root node and k value 

      if(node==null || k<0 || node==blocker){
             return;
      }

      if(k==0){
           System.out.print(node.value+" ");
      }

      print_K_Level_down(node.left,k-1,blocker);
      print_K_Level_down(node.right,k-1,blocker);

    }


  
public static void main(String[] args) {

    Integer arr[]={50,25,12,null,null,87,30,null,null,null,75,62,null,70,null,null,87,null,null};
    // Integer arr[]={1,2,4,null,null,null,3,5,null,null,6,null,null};
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


    System.out.println("find k level element to given node:-");
    allnode_from_k_away(root,70,3);
    

   

     
}

}


 