package day02;

public class IfTest1 {

  public static void main(String[] args) {
    int i = 120;
    
    if (i%2 ==0) {
      int count = 1;
      System.out.println(i+ "은(는) 짝수");
    }
    
 // System.out.println("count: " + count);
    
    if (i%2 ==0) {
      System.out.println("짝수"+i);
     
    }else {
      System.out.println("홀수"+i);
    }

    if(i%11 ==0) {
      System.out.println("11의배수");
    }else if (i%4 ==0) {
      System.out.println("4의배수");
    }else if (i%7 ==0) {
      System.out.println("7의배수");
  }else {
    
    System.out.println("11,4,7의 배수가 아닙니다.");
  }
if ( 3 == 3){
      
      System.out.println("동일");    
    
  }
}
}
