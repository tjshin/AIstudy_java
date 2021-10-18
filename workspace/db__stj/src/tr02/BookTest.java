package tr02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import utility.DBClose;
import utility.Open;

public class BookTest {

  public static void insertStudent(BookDTO book) {
    Connection con = Open.getConnection();
    PreparedStatement pstmt = null;
    StringBuffer sql = new StringBuffer();

    sql.append(" insert into books(isbn, title, author, publisher, price, descrpt) ");
    sql.append(" values(?, ?, ?, ?, ?, ?) ");

    try {
      pstmt = con.prepareStatement(sql.toString());
      pstmt.setInt(1, book.getIsbn());
      pstmt.setString(2, book.getTitle());
      pstmt.setString(3, book.getAuthor());
      pstmt.setString(4, book.getPublisher());
      pstmt.setInt(5, book.getPrice());
      pstmt.setString(6, book.getDescrpt());

      pstmt.executeUpdate();

    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      DBClose.close(pstmt, con);
    }

  }

  public static void printAllBooks() {
    System.out.println("*********************** 도서 목록 **************************");

    List<BookDTO> list = new ArrayList<BookDTO>();
    Connection con = Open.getConnection();
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    StringBuffer sql = new StringBuffer();

    sql.append(" select * from books ");
    sql.append(" order by rownum asc ");

    try {
      pstmt = con.prepareStatement(sql.toString());

      rs = pstmt.executeQuery();

      while (rs.next()) {
        BookDTO book = new BookDTO();
        book.setIsbn(rs.getInt(1));
        book.setTitle(rs.getString(2));
        book.setAuthor(rs.getString(3));
        book.setPublisher(rs.getString(4));
        book.setPrice(rs.getInt(5));
        book.setDescrpt(rs.getString(6));

        list.add(book);

        System.out.println(book.toString());

      }

    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      DBClose.close(rs, pstmt, con);
    }

  }

  public static void main(String[] args) {

    BookDTO book1 = new BookDTO(21424, "Java Basic  ", "김하나", "Jaen.kr", 15000, "Java 기본 문법");
    BookDTO book2 = new BookDTO(33455, "JDBC Pro    ", "김철수", "Jaen.kr", 23000, " ");
    BookDTO book3 = new BookDTO(55355, "Servlet/JSP ", "박자바", "Jaen.kr", 41000, "Model2 기반");
    BookDTO book4 = new BookDTO(35332, "Android App ", "홍길동", "Jaen.kr", 25000, "Lightweight Framework");
    BookDTO book5 = new BookDTO(35355, "OOAD 분석,설계 ", "소나무", "Jaen.kr", 30000, " ");

    insertStudent(book1);
    insertStudent(book2);
    insertStudent(book3);
    insertStudent(book4);
    insertStudent(book5);

    printAllBooks();

  }

}
