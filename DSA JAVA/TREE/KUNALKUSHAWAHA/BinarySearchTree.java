public class BinarySearchTree {

    public class Node{                            //creat nodes for tree
     private int value;
     private int height;
     private Node left;
     private Node right;

     public Node(int value){                      //constructor for initlize value of particular node
           this.value=value;
     }    
     public int getValue(){
        return value;
     }
    }

    private  Node root;

    public int height(Node node){                 //this methos is for returning height of tree
        if(node==null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        if(root==null){
           return true;
        }else{
            return false;
        }
    }

    public void incert(int value){
        root=incert(value,root);

    }

    private Node incert(int value,Node node){
        if(node==null){
            node=new Node(value);
            return node; 
        }

        if(value<node.value){
            node.left=incert(value, node.left);
         }

         if(value>node.value){
            node.right=incert(value, node.right);
         }

         node.height=Math.max(height(node.left),height(node.right))+1;

         return node;
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node==null){
            return true;
        }

        return Math.asin(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }

    public void populate(int []nums){
        for(int i=0;i<nums.length;i++){
           incert(nums[i]);
        }
    }

    public void display(){
        display(root,"Root Node: ");
    }

    private void  display(Node node,String details){
 
        if(node==null){
             return;
        }
        System.out.println(details + node.value);
        display(node.left," Left child of " +node.getValue() + " : ");
        display(node.right," Right child of " +node.getValue() + " : ");
    }



    public static void main(String[] args) {
        BinarySearchTree  tree=new BinarySearchTree();
        int []nums={5,2,7,1,4,6,9,8,3,10};
        tree.populate(nums);
        tree.display();
    }
}
