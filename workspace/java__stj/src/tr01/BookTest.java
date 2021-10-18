package tr01;

public class BookTest {

  public static void main(String[] args) {
    BookDTO book1 = new BookDTO (21424, "Java Basic  ", "김하나", "Jaen.kr", 15000, "Java 기본 문법");
    BookDTO book2 = new BookDTO (33455, "JDBC Pro    ", "김철수", "Jaen.kr", 23000, " ");
    BookDTO book3 = new BookDTO (55355, "Servlet/JSP ", "박자바", "Jaen.kr", 41000, "Model2 기반");
    BookDTO book4 = new BookDTO (35332, "Android App ", "홍길동", "Jaen.kr", 25000, "Lightweight Framework");
    BookDTO book5 = new BookDTO (35355, "OOAD 분석,설계 ", "소나무", "Jaen.kr", 30000, " ");
    
    System.out.println("*********************** 도서 목록 **************************");
    System.out.println(book1.toString());
    System.out.println(book2.toString());
    System.out.println(book3.toString());
    System.out.println(book4.toString());
    System.out.println(book5.toString());

  }

}
