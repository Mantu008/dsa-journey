import java.util.Arrays;

public class Check_is_two_arrays_equal {
  public static void main(String[] args) {

    int A[] = { 1, 2, 5, 4, 0 };
    int B[] = { 2, 4, 5, 0, 1 };

    Arrays.sort(A);
    Arrays.sort(B);

    if (A.length == B.length) {
      for (int i = 0; i < A.length; i++) {
        if (A[i] != B[i]) {
          System.out.println(false);
          return;
        }
      }
    } else {
      System.out.println(false);
    }

    System.out.println(true);

  }
}