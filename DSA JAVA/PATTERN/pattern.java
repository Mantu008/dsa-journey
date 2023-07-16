public class pattern {
public static void main(String[] args) {

    //1st pattern..........  

    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            System.out.print(" *");
        }
        System.out.println("");
    }

    System.out.println("");

    //2nd pattern

    for(int i=0;i<4;i++){
        for(int j=0;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println("");
    }

    System.out.println("");

    //3rd pattern

    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println("");
    }

    System.out.println("");

    //4th pattern

    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println("");
    }

    System.out.println("");

    //5th pattern

    for(int i=5;i>0;i--){
        for(int j=i;j>0;j--){
            System.out.print("* ");
        }
        System.out.println("");
    }

    System.out.println("");

    //6th pattern

    for(int i=5;i>0;i--){
        for(int j=i;j>0;j--){
            System.out.print((i-(j-1))+" ");
        }
        System.out.println("");
    }

    System.out.println("");

      //6th pattern second method
      
      for(int i=1;i<=5;i++){
        for(int j=1;j<=((5-i)+1);j++){
            System.out.print(j+" ");
        }
        System.out.println("");
    }


    System.out.println();

    // 7thg pattern...............

      int n=5;

     for(int i=1;i<=n;i++){
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        for(int k=1;k<=(i);k++){
            System.out.print("*");
        }
        for(int l=1;l<i;l++){
            System.out.print("*");
        }
        for(int k=1;k<=(n-i);k++){
            System.out.print(" ");
        }
        System.out.println(" ");
    }

 System.out.println("");


    // 7 new mathod ....


    for(int i=0;i<n;i++){
        for(int j=0;j<(n-(i+1));j++){
            System.out.print(" ");
        }
        for(int j=0;j<(2*i+1);j++){
            System.out.print("*");
        }
        for(int j=0;j<(n-(i+1));j++){
            System.out.print(" ");
        }
        System.out.println("");
    }

    System.out.println(" ");

    
    // 8th pattern ....


    for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<(2*n)-(2*i+1);j++){
            System.out.print("*");
        }
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
        System.out.println("");
    }


    System.out.println(" ");

    
    // 9th pattern ....


    for(int i=0;i<n;i++){
        for(int j=0;j<(n-(i+1));j++){
            System.out.print(" ");
        }
        for(int j=0;j<(2*i+1);j++){
            System.out.print("*");
        }
        for(int j=0;j<(n-(i+1));j++){
            System.out.print(" ");
        }
        System.out.println("");
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<(2*n)-(2*i+1);j++){
            System.out.print("*");
        }
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
        System.out.println("");
    }


    //10 pattern..............

    System.out.println("");

    //10th pattern

    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }    
    for(int i=1;i<=n;i++){
        for(int j=1;j<((n-i)+1);j++){
            System.out.print("*");
        }
        System.out.println("");
    }


    System.out.println("");


    //10th another mathod.......

    for(int i=1;i<=2*n-1;i++){
        int s=i;
        if(i>n){
            s=2*n-i;
        }
        for(int j=1;j<=s;j++){
            System.out.print("*");
        }
        System.out.println("");
    }








    System.out.println("");

     //11th pattern

    for(int i=0;i<n;i++){

        int s=1;
        if(i%2==0){
           s=1;  
        }else{
            s=0;
        }
        for(int j=1;j<=i+1;j++){   
          System.out.print(s+" ");    
          s=1-s; 
        }
        System.out.println("");
    }  
    

    System.out.println("");

    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+"");
        }
        for(int j=1;j<=((2*n)-(i*2));j++){
            System.out.print(" ");
        }
        for (int j = i; j >= 1; j--) {
            System.out.print(j + "");
        }
        System.out.println("");
    } 



    System.out.println(" ");

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        for (int k = 2 * (n - i); k > 0; k--) {
            System.out.print("  ");
        }
        for (int l = i; l >= 1; l--) {
            System.out.print(l + " ");
        }
        System.out.println();
    }
 

        
     


     
}
    
}