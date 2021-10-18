package day09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDB {

  public static void main(String[] args) {
    String url = "jdbc:mysql://127.0.0.1:3306/javadb?useUnicode=true&characterEncoding=utf8";
    String driver = "org.gjt.mm.mysql.Driver";
    Connection con = null; // DB 연결 객체
    Statement stmt = null; // SQL문 전송 객체
    
    try {
      Class.forName(driver);
      
      con = DriverManager.getConnection(url, "javauser", "1234");
      
      String sql = " insert into address(name, handphone, address) ";
      sql += " values('설계자','010-3333-9999','한국') ";
      
      stmt = con.createStatement();
      
      int cnt = stmt.executeUpdate(sql); // 서버로 SQL 전송, 갱신된 레코드 갯수 return
      
      System.out.println("레코드 " + cnt + "개가 추가됨.");
      
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      try {
        if(stmt != null) stmt.close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      try {
        if(con != null) con.close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      
  }
  }
}
