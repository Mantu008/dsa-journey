public class Flood_Fill {

   static int oldcolor;
    public static void main(String[] args) {

        int image[][] = {{0, 0, 0}, {0, 0, 0}};

        int n = image.length;
        int m = image[0].length;

        int sr = 0;
        int sc = 0;
        int color = 1;

        oldcolor=image[sr][sc];
        if(oldcolor==color){
          for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(image[i][j] + " ");
            }
        }
         
          return;
        }

        solve(image, sr, sc, color, n, m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(image[i][j] + " ");
            }
        }
    }

    public static void solve(int image[][], int sr, int sc, int color, int n, int m) {
        if (sr >= 0 && sr < n && sc >= 0 && sc < m && image[sr][sc]==oldcolor) {
            image[sr][sc] = color;

            solve(image, sr + 1, sc, color, n, m);
            solve(image, sr - 1, sc, color, n, m);
            solve(image, sr, sc + 1, color, n, m);
            solve(image, sr, sc - 1, color, n, m);
        }
    }
}
