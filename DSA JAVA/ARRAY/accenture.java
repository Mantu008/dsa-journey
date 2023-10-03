import java.util.Scanner;

public class accenture {

static int isValid(char []stra,int n,int min){

    if(n<min){
          return -1;
    }
    
    if(stra[0]-'0'>=0 && stra[0]-'0'<=9){
           return -1;
    }

    int i=0;
    int numc=0;
    int capc=0;
    while(i<n){

     if(stra[i]==' ' && stra[i]=='+'){      // check if space ot plus is not present
               return -1;
     }
       
      if(stra[i]-'0'>=0 && stra[i]-'0'<=9){   // check at list 1 number is present
         numc+=1;
      }else if(stra[i]>=65 && stra[i]<=90){   // check is one capitel charecter is present or not
            capc+=1;
      }

      i++;

    }

    if(numc>0 && capc>0){
         return 1;
    }

    return -1;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter password:-");
    String str=sc.nextLine();   
    System.out.print("Enter minelementsize:-");
    int min=sc.nextInt();
    int n=str.length();
    str.toCharArray();
    char[] stra=str.toCharArray();
    
    int p=isValid(stra,n,min);

     if(p==1){
         System.out.println("it is a valid password");
     }else{
        System.out.println("it is a invalid password");
     }
}
}