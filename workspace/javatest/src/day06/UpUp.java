package day06;

class Person1{
  String name;
  String id;
  public Person1(String name) {
    this.name = name;
  }
}

class Student1 extends Person1{
  String grade;
  String department;
  public Student1(String name) {
    super (name);
  }
}

public class UpUp {

  public static void main(String[] args) {
    Person1 p = new Student1("움티티");
    Student1 s;
    s = (Student1)p;
    System.out.println(p.name);
    System.out.println(s.name);
    s.grade = "F";
    System.out.println(s.grade);

  }

}
