package day09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverTestMysql {

  public static void main(String[] args) {
    String url = "jdbc:mysql://127.0.0.1:3306/javadb?useUnicode=true&characterEncoding=utf8";
    Connection con = null;
    
    try {
      Class.forName("org.gjt.mm.mysql.Driver");
      
      con = DriverManager.getConnection(url, "javauser", "1234");
      
      System.out.println("데이터 베이스 접속 성공.");
      
    } catch (ClassNotFoundException | SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      if(con != null)
        try {
          con.close();
        } catch (SQLException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
    }

  }

}
