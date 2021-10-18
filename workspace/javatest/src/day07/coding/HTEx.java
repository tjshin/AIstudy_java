package day07.coding;

import java.util.Hashtable;
import java.util.Scanner;

public class HTEx {

  public static void main(String[] args) {
    Hashtable members = new Hashtable();
    Scanner sin = new Scanner(System.in);
    System.out.println("공백으로 분리된 이름과 전화번호 5개를 입력");
    for(int i=0 ; i<5 ; i++) {
      System.out.print("이름, 전화번호: ");
      String name = sin.next();
      String tel = sin.next();
      members.put(name, tel);
    }
    System.out.println("전화번호를 검색할 이름을 입력");
    String key = sin.next();
    String val = (String)members.get(key);
    if(val !=null)
      System.out.println(key + "의 전화본호는 " + val);
    else
      System.out.println("없는 이름");

  }

}
