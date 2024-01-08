
public class xyz {

    public static void main(String[] args) {

        int N = 10;
        print(N);
    }

    public static void print(int N) {
        if (N == 0) {
            return;
        }

        print(N - 1);
        System.out.print(N + " ");
    }
}