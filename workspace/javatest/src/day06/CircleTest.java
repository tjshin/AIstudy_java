package day06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Circle implements Serializable {
  int xPos;
  int yPos;
  double rad;

  public Circle(int x, int y, double r) {
    xPos = x;
    yPos = y;
    rad = r;
  }

  public void showCircleInfo() {
    System.out.printf("[%d, %d] \n", xPos, yPos);
    System.out.println("rad: " + rad);
  }
}

public class CircleTest {

  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.ser"));
    
    out.writeObject(new Circle(1,1,2.4));
    out.writeObject(new Circle(2,2,4.8));
    out.writeObject(new String("String implements Serializable"));
    out.close();
    
    ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.ser"));
    Circle c1 = (Circle) in.readObject();
    Circle c2 = (Circle) in.readObject();
    String str = (String) in.readObject();
    in.close();
    
    c1.showCircleInfo();
    c2.showCircleInfo();
    System.out.println(str);
  }
    {

  }

}
