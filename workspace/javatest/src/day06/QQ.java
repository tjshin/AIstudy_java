package day06;

class D{
  public D next;
  
  public D() {next =null;
}
  public void draw() {
    System.out.println("D draw");
  }
}

class Line extends D{
  public void draw() {
    System.out.println("Line");
  }
}

class Rect extends D{
  public void draw() {
    System.out.println("Rect");
  }
}

class Cir extends D{
  public void draw() {
    System.out.println("Circle");
  }
}

public class QQ {

  public static void main(String[] args) {
    D d = new D();
    Line line = new Line();
    D p = new Line();
    D r = line;
    
    d.draw();
    line.draw();
    p.draw();
    r.draw();
    
    D rect = new Rect();
    D cir = new Cir();
    rect.draw();
    cir.draw();
    
    

  }

}
