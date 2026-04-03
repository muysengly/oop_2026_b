package gtr;

public class Algorithm_V2 extends Algorithm_V1 {

  // mr_aaa create average method
  double average(int[] input) {
    int sum = sum(input);
    System.out.println("Average: " + (double) sum / input.length);
    return (double) sum / input.length;
  }

  public static void main(String[] args) {
    Algorithm_V2 al = new Algorithm_V2();

    al.average(al.sample);
  }

}
