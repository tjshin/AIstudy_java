package day01;

public class Hello2 {
  
  public static int sum(int n, int m) {
    return n+m;
  }

  public static void main(String[] args) {
    int i = 20;
    int s;
    char a; //''
    
    s = sum(i, 10);//메소드 sum 호출, 리턴값 s 저장
    a = '?';
    
    System.out.println(a);
    System.out.println("Hello2");
    System.out.println(s);

  }

}
