package day02.test;

public class Ex01 {

  public static void main(String[] args) {
    // Pay.java -> Switch문으로 변환 
    int y = 5;         //근무(경력) 년수 
    int p = 1500000;    //초봉 기본급 
    
    
    switch(y) {
    case 0:
        System.out.println("신입사원입니다.");
        break;
    case 1:
        p += 200000; 
        System.out.println("경력 1년 입니다.");
        break;
    case 2:
      p += 400000; 
      System.out.println("경력 2년 입니다.");
      break;
    case 3:
      p += 600000; 
      System.out.println("경력 3년 입니다.");
      break;
    case 4:
      p += 800000; 
      System.out.println("경력 4년 입니다.");
      break;
    default:
      p += 1500000; 
      System.out.println("경력 5년 이상입니다.");
      break;
    }
 
     
    System.out.println("기본급: " + p); 
    System.out.println("연  봉: " + (p * 13)); 
    System.out.println("월급여: " + ((p * 13)/12)); 
} 
} 
