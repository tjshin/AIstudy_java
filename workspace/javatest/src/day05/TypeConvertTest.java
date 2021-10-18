package day05;

class TypeConvert{   //extend Object 생략돼있음
  String url = "http://www.kma.go.kr";
  public void setUrl(String url) {
    this.url = url;
  }
  public String getUrl() {
    return url;
  }
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "자식 클래스에서 메소드 오버라이딩";
  }
  
  
  
}

public class TypeConvertTest {

  public static void main(String[] args) {
    TypeConvert tc = new TypeConvert();
    Object obj = tc;//업캐스팅: object만 접근할 수 있다.
  //System.out.println(obj.getUrl()); 
    System.out.println(tc.getUrl()); 
     
    System.out.println(obj.hashCode()); 
    System.out.println(tc.hashCode()); 
    
    TypeConvert tc2 = (TypeConvert)obj;//다운캐스팅 부모자식 다 접근
    System.out.println(tc2.getUrl());
    System.out.println(tc2.hashCode());
    
    System.out.println(tc.toString());
    System.out.println(obj); //동적바인딩
    System.out.println(tc2);

  }

}
