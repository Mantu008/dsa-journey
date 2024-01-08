import java.util.ArrayList;

public class construct_BST {

  public static class Node{
         int data;
         Node left;
         Node right;
         Node(int data,Node left,Node right){
              this.data=data;
              this.left=left;
              this.right=right;
         }
  }

  public static Node construct(int arr[],int lo,int hi){
       if(lo>hi){
         return null;
       }

       int mid=(lo+hi)/2;
       int data=arr[mid];
       Node lc=construct(arr, lo, mid-1);
       Node rc=construct(arr, mid+1, hi);
       Node node=new Node(data,lc,rc);

       return node;

  }


 

  public static void display(Node node){
      if(node==null){
        return;
      }

      System.out.print(node.data+"->");
      display(node.left);
      display(node.right);
  }



  public static int minElement(Node node){
      if(node.left!=null){
        return minElement(node.left);
      }else{
        return node.data;
      }
       
  }


  public static int maxElement(Node node){
      if(node.right!=null){
        return maxElement(node.right);
      }else{
        return node.data;
      }
       
  }

public static boolean find(Node node,int k){

 if(node==null){
   return false;
 }

  if(k<node.data){
     return find(node.left, k);
  }else if(k>node.data){
     return find(node.right, k);
  }else{
    return true;
  }

}

public static Node insertIntoLeaf(Node node,int k){

  if(node==null){
    Node newnode=new Node(k,null,null);
    return newnode;
  }
   

  if(k<node.data){
     node.left=insertIntoLeaf(node.left,k);
  }else if(k>node.data){
     node.right=insertIntoLeaf(node.right,k);
  }else{
       // nothing to do
  }

  return node;
 }

 public static Node remove_Node(Node node,int val){


   if(node==null){
     return null;
   }

   if(val>node.data){  
      node.right=remove_Node(node.right, val);
   }else if(val<node.data){
    node.left=remove_Node(node.left, val);
   }else{
      if(node.left!=null && node.right!=null){
          int lMax=Max(node.left);
          node.data=lMax;
          node.left=remove_Node(node.left,lMax);
          return node;
      }else if(node.left!=null){
           return node.left;
      }else if(node.right!=null){
          return node.right;
      }else{
         return null;
      }
   }
   return node;
 }

 public static int Max(Node node){
     if(node.right!=null){
         return Max(node.right);
     }else{
        return node.data;
     }
 }


static int sum=0;
public static void replace(Node node){
   if(node==null){
     return;
   }
   replace(node.right);
   int ov=node.data;
   node.data=sum;
   sum=sum+ov;
   replace(node.left);
 }

 public static int find_lowest_commen_ancestor(Node node,int p,int q){
  if(p<node.data && q<node.data){
       return find_lowest_commen_ancestor(node.left,p,q);
  }else if(p>node.data && q>node.data){
      return find_lowest_commen_ancestor(node.right,p,q);
  }else{
      return node.data;
  }

}

static ArrayList<Integer> ans=new ArrayList<>();

public static void solve(Node node){
  if(node==null){
     return;
  }
   solve(node.left);
   ans.add(node.data);
   solve(node.right);
   

   

   
}




public static void main(String[] args) {
  
  int arr[]={12,25,37,50,62,75,87};
  

  Node root=construct(arr,0,arr.length-1);
  
  //display the given binary search tree..
  display(root);
  System.out.println();
  int ans=minElement(root);
  System.out.println("minimum element of given binary search tree is:-"+ans);

  int ans1=maxElement(root);
  System.out.println("max element of given binary search tree is:-"+ans1);

   boolean fans=find(root,37);
   System.out.println("the given element is present on th bainary search tree is:-"+fans);

   insertIntoLeaf(root,100);
   display(root);
   System.out.println();

   remove_Node(root,37);
   display(root);

   //this method is fully work but here for inconvanint chenge i am not use this method

  //  replace(root);
  //  display(root);
  
  int ancestor=find_lowest_commen_ancestor(root,12 ,87);
  System.out.println("the comon ancestor of given both values is:-"+ancestor);



}
}