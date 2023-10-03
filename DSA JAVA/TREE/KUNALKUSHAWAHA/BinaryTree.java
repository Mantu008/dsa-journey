import java.util.Scanner;

public class BinaryTree {

    private Node root;

   private class Node{
        int data;
        Node left;
        Node right;
        private Node (int data){
             this.data=data;
        }
    } 

    //incert element

 public void poputate(Scanner scanner){
     System.out.println("Enter the root node value ");
     int value=scanner.nextInt();
     root=new Node(value);
     poputate(scanner,root);
 }

 private void poputate(Scanner scanner,Node node){

    //incerting left value

    System.out.println("Do you want to enter left of "+node.data);
    boolean left=scanner.nextBoolean();
    if(left==true){
          System.out.println("Enter the value of the left of "+node.data); 
          int value=scanner.nextInt();
          node.left=new Node(value);
          poputate(scanner, node.left); 
    }

    //incerting right value

    System.out.println("Do you want to enter right of "+node.data);
    boolean right=scanner.nextBoolean();
    if(right==true){
          System.out.println("Enter the value of the right of "+node.data); 
          int value=scanner.nextInt();
          node.right=new Node(value);
          poputate(scanner, node.right); 
    }

 }

 public void diaplay(){
    display(this.root," ");
 }

 private void display(Node node,String indent){
    if(node==null){
        return;
    }
    System.out.print(indent + node.data);
    display(node.left,indent);
    display(node.right,indent);
 }

 public void preetyDiaplay(){
    preetyDiaplay(root,0);
 }

 private void preetyDiaplay(Node node,int level){
    if(node==null){
        return;
    }

    preetyDiaplay(node.right, level+1);

    if(level!=0){
        for(int i=0;i<level-1;i++){
             System.out.print("|\t\t");
        }
        System.out.println("|-------------->"+node.data);
    }else{
        System.out.println(node.data);
    }

    preetyDiaplay(node.left, level+1);

 }


public static void main(String[] args) {
 
    Scanner scanner=new Scanner(System.in);
    BinaryTree tree=new BinaryTree();
    tree.poputate(scanner);
    tree.diaplay();
    System.out.println(" ");
    tree.preetyDiaplay();
    
}
}
