import java.util.Stack;

public class finddiff {
    public static void main(String[] args) {
        String s="a";
        String t="aa";

        int arr[]=new int[26];   
        
        for(char ch:t.toCharArray()){
              arr[ch-'a']++;
        }

        for(char ch:s.toCharArray()){
              arr[ch-'a']--;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                  System.out.println((char)(i+'a'));
            }
        }
    }
}
