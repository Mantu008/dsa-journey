import java.util.Scanner;

public class arraybasic {
    public static void main(String[] args) {
     
        int [] a={1,2,3,4,5,5};
        System.out.println(a[4]);

        int [] b=new int[6];
        System.out.println(b[4]);       //it gives 0 value because we not assinged element

        String [] c=new String[4];
        System.out.println(c[3]);      //it gives null value because we not assinged element


        int [] arr=new int[5];
        arr[0]=99;
        arr[1]=34;
        arr[2]=45;
        arr[3]=67;
        arr[4]=55;

       // arr[5]=43;     it throw an error because it is index out of bound

       // trevercing element from loop............

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

          System.out.println("");

        //trevercing array from for-each loop

        for(int e:arr){
            System.out.print(e+" ");
        }
        

        String [] arr1=new String[5];
        arr1[0]="mantu";
        arr1[1]="ashish";
        arr1[2]="hari";
        arr1[3]="nidhi";
        arr1[4]="yuvaraj";

        arr1[0]="nisha";

        System.out.println("");

        for(String x:arr1){
            System.out.print(x+" ");
        }

        System.out.println(" ");

        // 2d array..................

        Scanner sc=new Scanner(System.in);
        System.out.println("enter elemet of 2d array:");
        int[][] arr2=new int[2][3];

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
            arr2[i][j]=sc.nextInt();
            }
            System.out.println("");
        }

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println("");
        }




          // 3d array..................

        
          System.out.println("enter elemet of 3d array:");

          int[][][] arr3={ { { 1, 2, 3 }, { 4, 5, 6 } }, { { 1, 4, 9 }, { 16, 25, 36 } },
          { { 1, 8, 27 }, { 64, 125, 216 } } };
     
        //     int arr3 [][][]= new int[3][2][3];     //input from scanner class.....
      
        //   for(int i=0;i<3;i++){
        //     for(int j=0;j<2;j++){
        //       for(int k=0;k<3;k++){
        //           arr3[i][j][k]=sc.nextInt();
        //       }
        //       System.out.println("");
        //     }
        //     System.out.println("");
        // }
  
          for(int i=0;i<3;i++){
              for(int j=0;j<2;j++){
                for(int k=0;k<3;k++){
                    System.out.print(arr3[i][j][k]+" ");
                }
                System.out.println("");
              }
              System.out.println("");
          }

     
        
            
        

           



    }
}
