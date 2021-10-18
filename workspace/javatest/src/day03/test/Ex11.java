package day03.test;

import java.util.Calendar;
import java.util.Scanner;

public class Ex11 {

  public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    System.out.println("이름, 주소, 생년월일 입력:");
    
    String name = a.nextLine();
    String add = a.nextLine();
    String bir = a.nextLine();
        
    System.out.println("이름: " + name);
    System.out.println("주소: " + add);
    
    String jumin= bir; 
    int iage = Integer.parseInt(jumin.substring(0,2)); 
    iage += 1900;
    
    Calendar calendar = Calendar.getInstance(); 
    int currYear= calendar.get(Calendar.YEAR); 
    
    
    System.out.println("나이: " + (currYear-iage+1));

  }

}
