package day02.code;

public class Timetime {

  public static void main(String[] args) {
    final int TIME = 23960;
    int sec;
    int min;
    int hr;
    
    sec = TIME %60;
    min = (TIME/60) %60;
    hr = (TIME/60) /60;
    System.out.print(TIME + "초는");
    System.out.print(hr + "시간,");
    System.out.print(min + "분,");
    System.out.println(sec + "초입니다.");

  }

}
