package day03.test;

import java.util.Scanner;

public class Ex01 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int s[] =new int[5];
    double sum = 0;
    double avg = 0.0;
    
    System.out.println("점수를 5개 입력 후 Enter:");
    
    for(int i=0; i<s.length; i++) {
      s[i]=in.nextInt();
      sum +=s[i];
    }
    avg = sum / s.length;
    
    System.out.println("총점: "+(int)sum);
    System.out.println("평균: "+avg);

  }

}
