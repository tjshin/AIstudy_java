package day07;

public class GenericMethodExample {
  public static < T > void printArgInfo (T arg) {
    System.out.println("argument type is " + arg.getClass());
    System.out.println(" / value is " + arg.toString());
  }

  public static void main(String[] args) {
    Integer i = 10;
    char c = 'A';
    float f = 3.14f;
    printArgInfo(i);
    printArgInfo(c);
    printArgInfo(f);
    

  }

}
