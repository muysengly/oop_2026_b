package gtr;

public class Algorithm_V1 {

  // atributes mr_aaa
  private int[] sample = { 2, 4, 1, 6, 8 };

  // constructor mr_bbb
  public Algorithm_V1() {
    //
  }

  // method sum mr_aaa
  public int sum(int[] input) {
    int sum = 0;
    for (int i = 0; i < input.length; i++) {
      sum += input[i];
    }
    System.out.println("Sum: " + sum);
    return sum;
  }

  // method max mr_aaa
  public int max(int[] input) {
    int max = input[0];
    for (int i = 1; i < input.length; i++) {
      if (input[i] > max) {
        max = input[i];
      }
    }
    System.out.println("Max: " + max);
    return max;
  }


  public static void main(String[] args) {
    Algorithm_V1 al = new Algorithm_V1();

    al.sum(al.sample);
    al.max(al.sample);

  }

}
