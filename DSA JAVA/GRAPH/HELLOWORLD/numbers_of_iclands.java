public class numbers_of_iclands {
  public static void main(String[] args) {
    char[][] grid = {
      {'1','1','1','1','0'},
      {'1','1','0','1','0'},
      {'1','1','0','0','1'},
      {'0','0','0','1','0'}
    };


     int n=grid.length;
     int m=grid[0].length;
     int ans=0;

     for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
         if(grid[i][j]=='1'){
           ans++;
           FindNeabhour(i,j,n,m,grid);
         }
       }
     }

      System.out.println("number of icelend is:-"+ans);

    }

    public static void FindNeabhour(int i,int j,int n,int m,char [][] grid){
      
      grid[i][j]='0';

      if(isValid(i,j+1,n,m,grid)){
            FindNeabhour(i,j+1,n,m,grid);
      }
      if(isValid(i,j-1,n,m,grid)){
            FindNeabhour(i,j-1,n,m,grid);
      }
      if(isValid(i+1,j,n,m,grid)){
            FindNeabhour(i+1,j,n,m,grid);
      }
      if(isValid(i-1,j,n,m,grid)){
            FindNeabhour(i-1,j,n,m,grid);
      }

    }

    public static boolean isValid(int i,int j,int n,int m,char [][]grid){

    if(i>=0 && i<n && j>=0 && j<m && grid[i][j]=='1'){
        return true;
    }

      return false;
    }

}
