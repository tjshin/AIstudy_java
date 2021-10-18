package day07;

class Point {
  int x, y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public boolean equals(Point p) {
    if (x == p.x && y == p.y)
      return true;
    else
      return false;
  }
}

public class ObjectProperty {
  public static void main(String[] args) {
    Point a = new Point(2, 3);
    Point b = new Point(2, 3);
    Point c = new Point(3, 4);
    System.out.println(a.hashCode());
    System.out.println(b.hashCode());
    if (a == b) // false
      System.out.println("a==b");
    if (a.equals(b)) // true
      System.out.println("a is equal to b");
    if (a.equals(c)) // false
      System.out.println("a is equal to c");
  }
}
