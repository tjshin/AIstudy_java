package day02.code;

import java.util.Scanner;

public class WhileSample {
  public static void main(String[] args) {
    Scanner rd = new Scanner(System.in); // 키보드 입력
    int n = 0;
    double sum = 0;
    int i = 0;

    while ((i = rd.nextInt()) != 0) { // 0이 입력되면 while문 벗어남
      sum = sum + i;
      n++;
    }
    System.out.println("입력된 수의 개수는 " + n + "개이며 평균은 " + sum / n + "입니다."); // n은 입력된 수의 개수, sum은 입력된 수의 합
  }
}
