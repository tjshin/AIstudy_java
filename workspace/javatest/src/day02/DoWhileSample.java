package day02;

public class DoWhileSample {
  public static void main(String[] args) {
    char a = 'A';

    do {
      System.out.print(a);
      a = (char) (a + 1);
    } while (a <= 'z');
  }
}