public class Algorithm_V1 {

  // atributes mr_aaa
  int[] sample = { 2, 4, 1, 6, 8 };
  int[] input;

  // constructor mr_bbb
  Algorithm_V1(int[] input) {
    this.input = input;
  }

  // method sum mr_aaa
  int sum() {
    int sum = 0;
    for (int i = 0; i < input.length; i++) {
      sum += input[i];
    }
    return sum;
  }

  // method max mr_aaa

}
