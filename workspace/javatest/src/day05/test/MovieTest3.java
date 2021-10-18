package day05.test;

class Movie3{
  String part = " ";
  //public Movie3() {}
  public Movie3(String part) {
    this.part = part;
    System.out.println("Movie3");
  }
}

class Comedy3 extends Movie3{
  String time = " ";
  String name = " ";
  public Comedy3() {
    super("movie"); // 원래 부모의 기본생성자 호출하나, 명시적으로 매개변수 있는 생성자 호출
  }
  public Comedy3(String time, String name) {
    super("movie");
    this.time = time;
    this.name = name;
    System.out.println("Comedy3");
  }
}

public class MovieTest3 {

  public static void main(String[] args) {
    Comedy3 com = new Comedy3("21:00", "마파도");
    Comedy3 com2 = new Comedy3();
    System.out.println(com.time);
    System.out.println(com.name);
    System.out.println(com);
    System.out.println(com2);

  }

}
