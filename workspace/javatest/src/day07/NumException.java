package day07;

public class NumException {

  public static void main(String[] args) {
    String[] stringN = {"23", "12", "2400", "123.123"};
    try {
      for (int i = 0; i<stringN.length; i++) {
        int j = Integer.parseInt(stringN[i]);
        System.out.println("숫자로 변환된 값은 " + j);
      }
    }
    catch (NumberFormatException e) {
      System.out.println("정수로 변환할 수 없습니다.");
    }

  }

}
