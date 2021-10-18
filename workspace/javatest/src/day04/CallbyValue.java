package day04;

class Person{
  String name; //필드
  int age;     //필드
  
  Person(String s){ //생성자
    name = s;
    System.out.println("Person()의 s값:" + s);
  }
  
  public void setAge(int n) {
    age = n;
    n++;
    System.out.println("setAge()의 n값:"+n);
  }
  
}

public class CallbyValue {

  public static void main(String[] args) {
    Person p = new Person("홍길동");
    int a =33;
    
    p.setAge(a);
    
    System.out.println(a);
    System.out.println(p.hashCode());
    System.out.println(p.name);
    //System.out.println(s);
    System.out.println("홍길동".hashCode());

  }

}
