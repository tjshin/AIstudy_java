package day02.test;

public class Ex04 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int P =61;
    int p = P/10;

    switch(p) {
      case 10:
        System.out.println("만점");
        break;
      case 9:
        System.out.println("등급은 A입니다.");
        break;
      case 8:
        System.out.println("등급은 B입니다.");
        break;
      case 7:
        System.out.println("등급은 C입니다.");
        break;
      case 6:
        System.out.println("등급은 D입니다.");
        break;
      default:
        System.out.println("노력하세요.");
        break;
    }
  }

}
