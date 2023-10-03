import java.util.Arrays;

public class missing_element {
    public static void main(String[] args) {
        int arr[]={2};
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
              if(i+1!=arr[i]){
                    System.out.println("missing element is:-"+(i+1));
                    break;
              }
        }
    }
}
