import java.util.ArrayList;
import java.util.Stack;

public class BT_Tilt {

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

    static int tilt=0;

    public static int Bt_tilt(Node node){
        if(node==null){
             return 0;
        }

        int lst=Bt_tilt(node.left);    //it will return left sum and return chenged tilte value on left side
        int rst=Bt_tilt(node.right);   //it will return right sum and return chenged tilte value on right side

        int ltilt=Math.abs(lst-rst);

        tilt+=ltilt;

        int ts=lst+rst+node.value;

        return ts;
    }


     public static void right_side_view(Node node){
         if(node==null){
              return;
         }

          System.out.print(node.value+"->");

         right_side_view(node.right);
    }

 static int total=0;

public static void sum_root_to_leaf(Node node,int sum){

        if(node==null){
             return;
        }

        sum=(sum*10)+node.value;

        if(node.left==null && node.right==null){
             total+=sum;
              return;
        }

        sum_root_to_leaf(node.left,sum);
        sum_root_to_leaf(node.right,sum);

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


      System.out.println("display the given tree:-");
      display(root);
      
      System.out.println();
      System.out.println("print the tilt of given tree:-");
      int t=Bt_tilt(root);
      System.out.println("the total sum of given tree is:-"+t);
      System.out.println("the total tilted is:-"+tilt);

      System.out.println("right side view:-");
      right_side_view(root);

      


    System.out.println();
     int sum=0;
     sum_root_to_leaf(root,sum);
     System.out.println("sum of all root to leaf is:-"+total);

        

    }
}