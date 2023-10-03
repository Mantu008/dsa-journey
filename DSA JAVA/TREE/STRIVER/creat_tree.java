public class creat_tree {

    public static class Node{
        int data;
        Node left;
        Node right;
        public Node (int data){
             this.data=data;
        }
    } 
public static void main(String[] args) {
    
       Node root=new Node(9);
       root.left=new Node(4);
       root.right=new Node(7);

       System.out.println(root.data);
    
}
}