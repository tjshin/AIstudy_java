package day09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDB {

  public static void main(String[] args) {
    String url = "jdbc:mysql://127.0.0.1:3306/javadb?useUnicode=true&characterEncoding=utf8";
    String driver = "org.gjt.mm.mysql.Driver";
    Connection con = null;
    Statement stmt = null;
    
    try {
      Class.forName(driver);
      
      con = DriverManager.getConnection(url, "javauser", "1234");
      
      String sql = " update address set handphone = '010-0000-0000', address = '캐나다' ";
      sql += " where addressnum = 2 ";
      
      stmt = con.createStatement();
      
      int cnt = stmt.executeUpdate(sql);
      
      System.out.println("레코드 " + cnt + " 개가 수정됨.");
      
    } catch (ClassNotFoundException | SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      try {
        if(stmt != null)stmt.close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
      try {
        if(con != null)con.close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      
    }

  }

}
