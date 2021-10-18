package day01;

public class Ex03_01 {

  public static void main(String[] args) {
    char a, b, c, d, e;
    
    a = '꺏';
    System.out.printf(" %c \t", a);
    System.out.printf(" %d \n", (int) a);

    b = 'h';
    c = (char) (b + 1);
    System.out.printf(" %c \t", b);
    System.out.printf(" %c \n", c);

    d = 24000;
    System.out.printf(" %c \n", d);

    d = '컽';
    e = (char) (d + 1);
    System.out.printf(" %d \t", (int) d);
    System.out.printf(" %c \n", e);
  }

}
