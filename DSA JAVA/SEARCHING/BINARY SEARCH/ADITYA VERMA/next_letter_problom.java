public class next_letter_problom {
  public static void main(String[] args) {
    
     char letters[]={'c','f','j'};
     char target = 'j';

      char next=searchnext(letters,target);

      System.out.println("the next charactor is:-"+next);
  }
  public static char searchnext(char []letters,char target){

    if(target>=letters[letters.length-1]){
      return letters[0];
}else{
  int start=0;
  int end=letters.length-1;
  int mid=0;
  char result='#';

  while(start<=end){

       mid=start+(end-start)/2;

      if(target<letters[mid]){
            result=letters[mid];
            end=mid-1;  
      }else{
            start=mid+1;
      }
  }



  return result;


}
  }

}
