package day03.test;

import java.util.Scanner;

public class Ex03 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int s[] =new int[5];
    double num = 0.0;
    
    System.out.println("실수를 5개 입력 후 Enter:");
    
    for(int i=0; i<s.length; i++) {
      s[i]=in.nextInt();
      if(s[i]>=0)
      System.out.println(s[i]);
      if(s[i]<0)
        System.out.println(s[i]*-1);
          }
      

  

}
}
