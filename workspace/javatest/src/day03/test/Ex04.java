package day03.test;

import java.util.Calendar;


public class Ex04 {

  public static void main(String[] args) {

    
    System.out.println("이름: " + args[0]);
    System.out.println("전화번호: " + args[1]);
    System.out.println("주소: " + args[2]);
    
    String jumin= args[3]; 
    int iage = Integer.parseInt(jumin.substring(0,2)); 
    iage += 1900;
    
    Calendar calendar = Calendar.getInstance(); 
    int currYear= calendar.get(Calendar.YEAR); 
    
    
    System.out.println("나이: " + (currYear-iage));
  }

}
