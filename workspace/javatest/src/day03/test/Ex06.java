package day03.test;



public class Ex06 {

  public static void main(String[] args) {
    
    int s = Integer.parseInt(args[0]);
    
    if (s>0) {
      System.out.println("입력한 숫자 "+s+"은(는) 양수");
    }else if(s==0) {
      System.out.println("입력한 숫자는 0");
    }else if(s<0) {
      System.out.println("입력한 숫자 "+s+"은(는) 음수");
    }else {
      System.out.println("정수를 입력하세요.");
    }

  }

}
