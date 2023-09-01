import java.util.Stack;

public class shortstack {

    public static void Short(Stack<Integer>st){
           if(st.size()==0){
                return;
           }
           int temp=st.peek();
           st.pop();
           Short(st);
           incert(st,temp);
    }

    public static void incert(Stack<Integer>st,int temp){
            if(st.size()==0 || st.peek()<=temp){
                     st.push(temp);
                     return;
            }
            int val=st.peek();
            st.pop();
            incert(st,temp);
            st.push(val);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(11);
        st.push(2);
        st.push(32);
        st.push(3);
        st.push(41);
        Short(st);

        System.out.println(st);

       
    }
}
