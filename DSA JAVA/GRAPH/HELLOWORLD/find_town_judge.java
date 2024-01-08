public class find_town_judge {
  public static void main(String[] args) {
    int n = 3;
    int judge=-1;
    int [][]trust = {{1,2}};


    int ans[]=new int[n+1];

    for(int i=0;i<trust.length;i++){
        find(trust[i],ans);
    }

     for(int i=1;i<ans.length;i++){
        if(ans[i]==n-1){
           judge=i;
        }
     }

     System.out.println("the judgeindex is: "+judge);



  }

  public static void find(int arr[],int ans[]){
       int out=arr[0];          //get first index value
       int in=arr[1];           //get second index value

       ans[out]-=1;              //for out minous in ans array to -1
       ans[in]+=1;               //for out minous in ans array to +1
  }
}
