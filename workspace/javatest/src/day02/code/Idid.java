package day02.code;

import java.util.Scanner;

public class Idid {

  public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    System.out.println("나이, 체중, 신장을 빈 칸으로 분리하여 순서대로 입력하세요.");
    
    System.out.println("당신의 나이는 " + a.nextInt() + "살 입니다.");
    
    System.out.println("니 몸무게는 " + a.nextDouble() + "kg 입니다.");
    
    System.out.println("당신의 신장은 " + a.nextDouble() + "cm 입니다.");
  }

}
