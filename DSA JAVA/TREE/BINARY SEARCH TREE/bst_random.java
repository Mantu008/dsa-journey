import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class bst_random {

  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static Node Insert(Node root, int data) {
    if (root == null) {
      root = new Node(data);
      return root;
    }

    if (data > root.data) { // insert into right part
      root.right = Insert(root.right, data);
    } else { // insert into left part
      root.left = Insert(root.left, data);
    }

    return root;
  }

  public static void takeinput(Node root) {
    System.out.println("ENTER REMANING DATA FOR CREATING BST..");
    Scanner sc = new Scanner(System.in);
    int data = sc.nextInt();

    while (data != -1) {
      Insert(root, data);
      data = sc.nextInt();
    }

  }

  public static void preorder(Node node) {
    if (node == null) {
      return;
    }
    System.out.print(node.data + "->");
    preorder(node.left);
    preorder(node.right);
  }

  public static void inorder(Node node) {
    if (node == null) {
      return;
    }
    inorder(node.left);
    System.out.print(node.data + "->");
    inorder(node.right);
  }

  public static void postorder(Node node) {
    if (node == null) {
      return;
    }
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.data + "->");
  }

  public static void levelorderTraversal(Node node) {
    Queue<Node> q = new ArrayDeque<>();
    q.offer(node);

    while (!q.isEmpty()) {
      int n = q.size();

      while (n-- > 0) {
        Node temp = q.peek();
        q.poll();
        System.out.print(temp.data + "->");

        if (temp.left != null) {
          q.offer(temp.left);
        }

        if (temp.right != null) {
          q.offer(temp.right);
        }
      }

      System.out.println();
    }

  }

  public static void main(String[] args) {

    int arr[] = { 12, 25, 37, 50, 62, 75, 87 };
    Scanner sc = new Scanner(System.in);
    System.out.println("enter value for construct bst:-");
    System.out.println("ENTER ROOT VALUE:-");
    Node root = new Node(sc.nextInt());
    takeinput(root);

    // display the given binary search tree..
    System.out.println("preorder traversaal.....");
    preorder(root);
    System.out.println();
    System.out.println("inorder traversal....");
    inorder(root);
    System.out.println();
    System.out.println("postorder traversal...");
    postorder(root);
    System.out.println();
    System.out.println("level order traversal....");
    levelorderTraversal(root);
    System.out.println();

  }
}
