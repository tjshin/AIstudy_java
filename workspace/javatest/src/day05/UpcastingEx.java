package day05;

class Person{
  String name;
  String id;
  public Person(String name) {
    this.name = name;
  }
}
class Student extends Person{
  String grade;
  String department;
  public Student(String name) {
    super(name);
  }
}

public class UpcastingEx {

  public static void main(String[] args) {
    Person p;
    Student s = new Student("이재문");
    p = s;
    
    System.out.println(p.name);
    
    Student s2 = (Student)p;
    s2.department = "com";
    s2.grade = "A";
    System.out.println(s2.name);
    System.out.println("자식해쉬: "+s.hashCode());
    System.out.println("부모해쉬: "+p.hashCode());
    System.out.println("자식다운해쉬: "+s2.hashCode());
  }

}
