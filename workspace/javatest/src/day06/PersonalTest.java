package day06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Personal implements Serializable{
  String name;
  transient String secretInfo;
  int age;
  transient int secretNum;
  
  Personal(String name, String sinfo, int age, int snum){
    this.name = name;
    secretInfo = sinfo;
    this.age = age;
    secretNum = snum;
  }
  
  public void showPersonal() {
    System.out.println("name: " + name);
    System.out.println("secretInfo: " + secretInfo);
    System.out.println("age: " + age);
    System.out.println("secretNum: " + secretNum);
  }
}

public class PersonalTest {

  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    Personal p = new Personal("존", "baby", 3, 42);
    p.showPersonal();
    
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object2.ser"));
    out.writeObject(p);
    out.close();
    
    ObjectInputStream in = new ObjectInputStream(new FileInputStream("object2.ser"));
    Personal p2 = (Personal)in.readObject();
    p2.showPersonal();
    in.close();
    System.out.println(p2.hashCode());

  }

}
