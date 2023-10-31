import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

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

        String str="";
        str+=node.left==null?".":node.left.value;
        str+="<- "+node.value+ " ->";
        str+=node.right==null?".":node.right.value;

        System.out.println(str);

        display(node.left);
        display(node.right);
    }

        public static void simpledisplay(Node node,ArrayList<Integer>result){

        if(node==null){
            return;
        }

        System.out.print(node.value+"-->");
        result.add(node.value);
        
        simpledisplay(node.left,result);
        simpledisplay(node.right,result);
    }

 public static int size(Node node){

         if(node==null){
             return 0;
        }
        
       int ls=size(node.left);
       int rs=size(node.right);
       int ts=ls+rs+1;

       return ts;

    }

   public static int sum(Node node){

        if(node==null){
             return 0;
        }

       int lsm=sum(node.left);
       int rsm=sum(node.right);
       int tsm=lsm+rsm+node.value;
       return tsm;


    }

  public static int max(Node node){
 
    if(node==null){   
       return Integer.MIN_VALUE;
    }

    int lm=max(node.left);                               //it give the left most node max element
    int rm=max(node.right);                              //it give the right most node max element
    int tm=(Math.max(node.value,Math.max(lm, rm)));      //it give the max amoung left max,right max and thr root node itself

    return tm;
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

  public static void traversal(Node node){

    
        if(node==null){
            return;
        }

        // System.out.print(node.value+"-->");          //this is preorder traversal
        traversal(node.left); 
        // System.out.print(node.value+"-->");         //this is inorder traversal
        traversal(node.right);
        System.out.print(node.value+"-->");         //this is postorder traversal

  }

  


public static void levalOrderTraversel(Node node){
        Queue<Node> q=new ArrayDeque<>();
        q.add(node);
         
        while(q.size()>0){
           int count=q.size();
           for(int i=0;i<count;i++){
             node=q.remove();
             System.out.print(node.value+"->");
             
             if(node.left!=null){
                q.add(node.left);
             }
            
             if(node.right!=null){
                q.add(node.right);
             }
           }
           System.out.println("");
        }
    } 

    public static void ittrativetraversal(Node node){
       Stack<pair> st=new Stack<>();
       pair proot=new pair(node, 1);
       st.push(proot);
       String pre="";
       String in="";
       String post="";

       while(st.size()>0){

         pair top=st.peek();

         if(top.state==1){                     //preorder,state++
            pre+=top.node.value+" ";

            if(top.node.left!=null){
                pair lp=new pair(top.node.left, 1);
                st.push(lp);
            }

            top.state++;

         }else if(top.state==2){               //inorder,state++
            in+=top.node.value + " ";
           
            if(top.node.right!=null){
             pair rp=new pair(top.node.right, 1);
             st.push(rp);
            }

              top.state++; 
         }else{                                //postorder,pop
            post+=top.node.value + " ";
            st.pop();
         }

       }

       System.out.println("pre order traversal:-"+pre);
       System.out.println("inorder traversal:-"+in);
       System.out.println("postorder traversal:-"+post);

    }

    static ArrayList<Integer>path;
    public static boolean findpath(Node node,int data){
        if(node==null){
             return false;
        }

        if(node.value==data){
              path.add(node.value);
              return true;
        }

        boolean lc=findpath(node.left,data);
        if(lc){
          path.add(node.value);
          return true;
        }

        boolean rc=findpath(node.right,data);
        if(rc){
           path.add(node.value);
           return true;
        }

        return false;
    }

    public static void print_K_Level_down(Node node,int k){

      if(node==null || k<0){
             return;
      }

      if(k==0){
           System.out.print(node.value+" ");
      }

      print_K_Level_down(node.left,k-1);
      print_K_Level_down(node.right,k-1);

    }

    public static void pathtoleaf(Node node,String path,int sum,int low,int high){

      if(node==null){
         return;
      }

      if(node.left==null && node.right==null){
         sum+=node.value;
         if(sum>=low && sum<=high){
              System.out.println(path+node.value);
         }
         return;
      }

      pathtoleaf(node.left, path+node.value+" ", sum+=node.value, low, high);
      pathtoleaf(node.right,path+node.value+" ", sum+=node.value, low, high);

    }



 public static void printsinglechildNode(Node node,Node parent){
        if(node==null){
            return;
        }  

        if(parent!=null && parent.left==node && parent.right==null){
               System.out.println(node.value);
        }else if(parent!=null && parent.right==node && parent.left==null){
               System.out.println(node.value);
        }
  
        printsinglechildNode(node.left,node);
        printsinglechildNode(node.right,node);
  }

  public static void printsinglechileNode2(Node node){
    if(node==null){
      return;
    }

    if(node.left!=null && node.right==null && node.left.left==null && node.left.right==null){
         System.out.println(node.left.value);  
    }else if(node.right!=null && node.left==null && node.right.left==null && node.right.right==null){
             System.out.println(node.right.value);
    }

     printsinglechileNode2(node.left);
     printsinglechileNode2(node.right);

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



    System.out.println(" ");
    System.out.println("displaying the binary tree using simple display function:-");
    simpledisplay(root,result);

    System.out.println(" ");
    System.out.println("displaying the binary tree using left right data:-");
    display(root);

    System.out.println(result);                                //this is print arraylist which contain all root values

     System.out.println("the summ of all element present in this given binary tree is:-"+sum(root));    //the sum of all element present in this given binary tree is
     System.out.println("the size of this given binary tree is:-"+size(root));                         //total element present in this given  binary tree is..
     System.out.println("the max element among binary tree is:-"+max(root));                           //it give max element amoung all element of binary tree
     System.out.println("the heigh of binary tree interms of eges is:-"+height(root));                 //it give the height of bt interms of eges
 


     System.out.println("all type traversal:-");              //all type traversal
     traversal(root);

     System.out.println();
     System.out.println("level order traversal:-");
     levalOrderTraversel(root);

     System.out.println("all type traversal using ittrative");
     ittrativetraversal(root);

     System.out.println("find path..");
     path=new ArrayList<>();
     boolean p=findpath(root,5);
     System.out.println(p);
     System.out.println(path);                 //print the arraylist where we store the path of given element

     System.out.println("print k leven down element:-");      //print all node which k level down
     print_K_Level_down(root,1);
     System.out.println();

     System.out.println("print path which sum lies between low and high:-");
     pathtoleaf(root, "",0,0,87);

     System.out.println("print single child node:-");
     printsinglechildNode(root,null);

     System.out.println("print single child node with method 2:-");
     printsinglechileNode2(root);

    



     
}

}


 