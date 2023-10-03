import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class GenericTree {
    public static class Node{
        int data;
        ArrayList<Node> children=new ArrayList<>();
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
            node=mq.remove();
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

    }
}
