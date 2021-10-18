package day07;

import java.util.Vector;

public class SearchDelete {

  public static void main(String[] args) {
    String name[] = {"기획자", "설계자", "개발자"};
    Vector v = new Vector();
    
    for(int i = 0; i < name.length; i++) {
      v.add(name[i]);
    }
    
    System.out.println(v);
    
    
    if (v.contains("개발자")) {
      int i = v.indexOf("개발자");
      System.out.println("해당 객체의 인덱스 " + (i+1) + "번째에 있습니다.");
    }
    else {
      System.out.println("해당 객체가 없습니다.");
    }
    
    System.out.println(v.size());
    System.out.println(v.capacity());
    
    
    v.remove(0);
    System.out.println("====지우고 난 후에는====");
    String s = "";
    for (int j=0; j<v.size(); j++) {
      s = (String)v.get(j);
      System.out.println("Vector " + j + "번째 요소는 " + s);
    }
    
    System.out.println("엘리먼트 수: " + v.size());
    System.out.println("벡터의 크기: " + v.capacity());
    
    v.trimToSize();
    System.out.println("trimToSize() 후 결과");
    System.out.println("엘리먼트 수: " + v.size());
    System.out.println("벡터의 크기: " + v.capacity());
    
    v.add("디자이너");
    System.out.println("add() 후 결과");
    System.out.println("엘리먼트 수: " + v.size());
    System.out.println("벡터의 크기: " + v.capacity());
    
    v.add("coder");
    System.out.println("add() 후 결과");
    System.out.println("엘리먼트 수: " + v.size());
    System.out.println("벡터의 크기: " + v.capacity());
    
    v.add("PM");
    System.out.println("add() 후 결과");
    System.out.println("엘리먼트 수: " + v.size());
    System.out.println("벡터의 크기: " + v.capacity());

  }

}
