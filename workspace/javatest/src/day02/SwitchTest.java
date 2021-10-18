package day02;

public class SwitchTest {

  public static void main(String[] args) {
    int k=5;
    
    switch(k) {
    case 1:
      System.out.println("1이다.");
      break;
    case 2:
      System.out.println("2이다.");
      break;
    case 3:
      System.out.println("3이다.");
      break;
    case 4:
      System.out.println("4이다.");
      break;
      default:
        System.out.println("1부터 4까지 입력하라고");
        break;
    }

  }

}
