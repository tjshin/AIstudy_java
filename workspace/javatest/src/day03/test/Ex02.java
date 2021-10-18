package day03.test;

import java.util.Scanner;

public class Ex02 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int s[] =new int[5];
    double max = 0.0;
    double min = 0.0;
    
    System.out.println("실수를 5개 입력 후 Enter:");
    
    for(int i=0; i<s.length; i++) {
      s[i]=in.nextInt();
      if(s[i]>max)
        max=s[i];
      if(s[i]<min)
        min=s[i];
      else min = s[0];}
      
    System.out.println("최대값: "+max);
    System.out.println("최소값: "+min);

  

}
}
