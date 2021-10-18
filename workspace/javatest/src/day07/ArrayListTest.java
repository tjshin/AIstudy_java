package day07;

import java.util.ArrayList;

class Jumsu{
  //멤버 변수
  String name = "";
  int k = 0;
  int e = 0;
  double tot = 0;
  double avg = 0;
  
  //생성자
  public Jumsu() {}
  public Jumsu(String name, int k, int e) {
    //super(); 자동으로 생성되나 결과가 같기 때문에 생략해도 됨
    this.name = name;
    this.k = k;
    this.e = e;
    this.tot = k+e;
    this.avg = (k+e)/2;
  }
}

public class ArrayListTest {

  public static void main(String[] args) {
    
    Jumsu s = null;
    Jumsu s1 = new Jumsu("홍길동", 90, 27);
    Jumsu s2 = new Jumsu("고길동", 95, 33);
    Jumsu s3 = new Jumsu("둘리", 5, 99);
    
    ArrayList v = new ArrayList();
    v.add(s1);
    v.add(s2);
    v.add(s3);
    
    for(int i = 0; i < v.size();i++) {
      s = (Jumsu)v.get(i);
      System.out.print(s.name + "\t");
      System.out.print(s.k + "\t");
      System.out.print(s.e + "\t");
      System.out.print((int)s.tot + "\t");
      System.out.print(s.avg + "\n");
    }
    

  }

}
