package day05;

class SuperObject{
  protected String name;
  public void paint() {
    draw();//순서1-2
  }
  public void draw() {
    System.out.println(name);//동적바인딩 순서 1-3, 2-1, 3-2
  }
}

public class SubObject extends SuperObject{
  protected String name;
  public void draw() { //동적바인딩 순서2-2
    name = "Sub";
    super.name = "Super";
    super.draw(); //순서3-1
    System.out.println(name);//순서4    
  }

  public static void main(String[] args) {
    SuperObject b = new SubObject();
    b.paint();// 순서 1-1

  }

}
