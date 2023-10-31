import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Queue;
import java.util.Stack;


public class GenericTree {
    public static class Node{
        int data;
        ArrayList<Node> children=new ArrayList<>();

        Node(){

        }

        Node(int data){
            this.data=data;
        }
    }

    public static void display(Node node){
          String str = node.data + "->";

          for(Node child:node.children){
                  str+=child.data + ",";
          }

          str+=".";
          System.out.println(str);

          for(Node child:node.children){
               display(child);
          }
 
    }

    public static int size(Node node){
        int s=0;

        for(Node child:node.children){
            s+=size(child);
        }

        s+=1;

        return s;
    }

 public static int maxElement(Node node){
       int max=Integer.MIN_VALUE;

       for(Node child:node.children){
           int cm=maxElement(child);
           max=Math.max(cm, max);
       }

       max=Math.max(node.data, max);

        return max;
    }

    public static int minElement(Node node){
        int min=Integer.MAX_VALUE;

       for(Node child:node.children){
           int cm=minElement(child);
           min=Math.min(cm, min);
       }

       min=Math.min(node.data, min);

        return min;
    }

    public static int height(Node node){
        int ht=-1;

        for(Node child:node.children){
           int ch=height(child);
           ht=Math.max(ch, ht);
        }
        ht+=1;

        return ht;
    }

    public static void traverce(Node node){
        //Node pre
        System.out.println("Node Pre " + node.data);
        for(Node child:node.children){
            //Edge pre
            System.out.println("Edge Pre " + node.data + "-->" +child.data);
              traverce(child);
              //edge post
            System.out.println("Edge Post " + node.data + "-->"+child.data);
        }
        //Node post
        System.out.println("Node Post " + node.data);
    }

    public static void levalOrderTraversel(Node node){
        Queue<Node> q=new ArrayDeque<>();
        q.add(node);
        while(q.size()>0){
            node=q.remove();
            System.out.print(node.data+" ");
            for(Node child:node.children){
                q.add(child);
            }
        }
    }

      public static void levalOrderLineTraversel(Node node){
        Queue<Node> mq=new ArrayDeque<>();
        mq.add(node);
        Queue<Node> cq=new ArrayDeque<>();
        while(mq.size()>0){
            node=mq.poll();
            System.out.print(node.data+" ");
            for(Node child:node.children){
                cq.add(child);
            }

            if(mq.size()==0){
                mq=cq;
                cq=new ArrayDeque<>();
                System.out.println(" "); 
            }
        }
    }

     public static void levalOrderLineTraversel2(Node node){
        Queue<Node> mq=new ArrayDeque<>();
        mq.add(node);
        mq.add(new Node(-1));

        while(mq.size()>0){
            node=mq.poll();
            if(node.data!=-1){
                System.out.print(node.data+" ");
                for(Node child:node.children){
                mq.add(child);
                  }
                }else{
                  if(mq.size()>0){
                     mq.add(new Node(-1));
                     System.out.println(" ");
                }
             }


        }
    }

       public static void levalOrderLineTraversel3(Node node){
        Queue<Node> mq=new ArrayDeque<>();
        mq.add(node);                               //add node
        while(mq.size()>0){
            int cicl=mq.size();                    //children in current level
            
            for(int i=0;i<cicl;i++){               //ittrate up to length of children present at particular level
               node=mq.remove();                   //remove
               System.out.print(node.data+" ");    //print

               for(Node child:node.children){      //add all children of removed element
                    mq.add(child);
               }

            }
            System.out.println(" ");
           

        }
    }

    private static class pair{
        Node node;
        int level;

        pair(Node node,int level){
            this.node=node;
            this.level=level;
        }
    }


     public static void levalOrderLineTraversel4(Node node){
        Queue<pair> mq=new ArrayDeque<>();
        mq.add(new pair(node, 1));
        int level=1;
        while(mq.size()>0){
            pair p=mq.remove();
            if(p.level>level){
                level=p.level;
                System.out.println();
            }

            System.out.print(p.node.data+" ");

            for(Node child:p.node.children){
                 pair cp=new pair(child,p.level+1);
                 mq.add(cp);
            }
        }
    }


    public static void levelordertraversalZigzag(Node node){

        Stack<Node> ms=new Stack<>();
        ms.add(node);
        Stack<Node> cs=new Stack<>();
        int level=1;
        while(ms.size()>0){
            node=ms.peek();
            ms.pop();
            System.out.print(node.data+" ");
           
            if(level%2==1){
               for(int i=0;i<node.children.size();i++){
                   Node child=node.children.get(i);
                   cs.add(child);
               }
            }else{
                  for(int i=node.children.size()-1;i>=0;i--){
                   Node child=node.children.get(i);
                   cs.add(child);
               }
            }

            if(ms.size()==0){
                ms=cs;
                cs=new Stack<>();
                level+=1;
                System.out.println(" "); 
            }
        }


    }

    public static void BFS_Traversal(Node node){
             System.out.print(node.data+"-->");
             for(Node child:node.children){
                   BFS_Traversal(child);
             }
    }

    public static void meror(Node node){
            for(Node child:node.children){
                     meror(child);
            }

        Collections.reverse(node.children);
    }

    public static void removeLeves(Node node){

         for(int i=node.children.size()-1;i>=0;i--){
              Node child=node.children.get(i);

              if(child.children.size()==0){
                   node.children.remove(child);
              }
        }

        for(Node child:node.children){
               removeLeves(child);
        }
    }

    public static void  lenerize(Node node){
         for(Node child:node.children){
               lenerize(child);
         }  

         while(node.children.size()>1){
            Node lc=node.children.remove(node.children.size()-1);
            Node sl=node.children.remove(node.children.size()-1);
            Node slt=getTail(sl);
            slt.children.add(lc);
         }
    }

    public static Node getTail(Node node){               //this method is return the tail node for linking...
        while(node.children.size()==1){
           node=node.children.get(0);
        }
        return node;
    }

    public static boolean find(Node node,int key){
      
        if(node.data==key){
            return true;
         }
       
        for(Node child:node.children){
           boolean f=find(child, key);
           if(f){
             return true;
           }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[]={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Node root=null;
        Stack<Node> st=new Stack<>();

        for(int i=0;i<arr.length;i++){

            if(arr[i]==-1){
                 st.pop();
            }else{
               Node t=new Node();
               t.data=arr[i];

                 if(st.size()>0){
                      st.peek().children.add(t); 
                 }else{
                    root=t;
                 }
                 st.push(t);
            }

        }

        display(root);

    int size=size(root);
    System.out.println("size of this given tree is:-"+size);

    int max=maxElement(root);
    System.out.println("the maximum element of given tree is:-"+max);

    int min=minElement(root);
    System.out.println("the minimum element of given tree is:-"+min);

    int height=height(root);
    System.out.println("the height of given tree is:-"+height);

       
    System.out.println("treversing the given tree");
    traverce(root);
    

     System.out.println("level order treversel");
     levalOrderTraversel(root);
     System.out.println();

     System.out.println("level order line treversel");
     levalOrderLineTraversel(root);

     System.out.println("level order line treversel approch2");
     levalOrderLineTraversel2(root);
     System.out.println();

    System.out.println("level order line treversel approch3");
     levalOrderLineTraversel3(root);

    System.out.println("level order line treversel approch4");
    levalOrderLineTraversel4(root);
    System.out.println();

     System.out.println("level order zig-zig line treversel");
     levelordertraversalZigzag(root);

     System.out.println("BFS traversal:-");
      BFS_Traversal(root);

      System.out.println();
      System.out.println("miror of tree:-..");
      meror(root);
      System.out.println("tree after meriring the leves");
      levalOrderLineTraversel(root);

      System.out.println("remove leves from generic tree...");
      removeLeves(root);
      System.out.println("tree after removing leves");
      levalOrderLineTraversel(root);

      System.out.println("find element in given tree");
      boolean f=find(root,10);
      System.out.println("element presentation in this given tree is:-"+f);

    }
}
