import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class abg_of_level {

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

public static void avg_level(Node node,ArrayList<Double> ans){
       Queue<Node>q=new ArrayDeque<>();
       q.add(node);

       while(!q.isEmpty()){
          int size=q.size();
          double sum=0;
          for(int i=0;i<size;i++){
              Node temp=q.remove();
              sum=sum+temp.value;

              if(temp.left!=null){
                  q.add(temp.left);
              }

              if(temp.right!=null){
                  q.add(temp.right);
              }

          }
          ans.add(sum/size);
       }
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
     

    System.out.println("diaplay the given binary tree:-");
    display(root);
    System.out.println();
    System.out.println("avg of levels of the givwn binary tree:-");
    ArrayList<Double> ans=new ArrayList<>();
    avg_level(root,ans);
    System.out.println(ans);
  
}
}