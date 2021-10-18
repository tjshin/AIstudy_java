package day09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPrepDB {

  public static void main(String[] args) {
    String url = "jdbc:mysql://127.0.0.1:3306/javadb?useUnicode=true&characterEncoding=utf8";
    String driver = "org.gjt.mm.mysql.Driver";
    
    Connection con = null;
    PreparedStatement pstmt = null;
    
    try {
      Class.forName(driver);
      
      con = DriverManager.getConnection(url, "javauser", "1234");
      
      String sql = " insert into address(name, handphone, address) ";
      sql += " values(?, ?, ?) ";

      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, "김길동");
      pstmt.setString(2, "010-7777-7777");
      pstmt.setString(3, "석촌동");
            
      int cnt = pstmt.executeUpdate(); // 서버로 SQL 전송, 갱신된 레코드 갯수 return
      
      System.out.println("레코드 " + cnt + "개가 추가됨.");
      
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      try {
        if(pstmt != null) pstmt.close();
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
