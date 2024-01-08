public class find_pwer_of_three {
  public static void main(String[] args) {
    int num = 681472;

    for (int i = 2; i <= num; i++) {
      if (i * i * i == num) {
        System.out.println("yes this given number is a qube of:-" + i);
      }

      int temp = i * 2;

      if (temp * temp * temp < num) {
        i = temp;
      }
    }

  }
}
