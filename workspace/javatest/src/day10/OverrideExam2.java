package day10;

class OverB {
  void show() {
    System.out.println("부모클래스의 메소드 show()");
  }
  void parent() {
    System.out.println("부모클래스에만 있는 메소드 parent()");
  }
}

class SubOverB extends OverB {
  @Override
  void show() {
    System.out.println("자식클래스의 메소드 show()");
  }
}


public class OverrideExam2 {

  public static void main(String[] args) {
    SubOverB sub = new SubOverB();
    sub.show();
    sub.parent();
    
    OverB par = new OverB();
    par.show();
    par.parent();
    
    OverB o = new SubOverB();
    //o로 호출 할 수 있는 메소드, OverB타입의 모든 메소드, 단 오버라이딩된 자식의 메소드가 호출
    o.show();
    o.parent();

  }

}
