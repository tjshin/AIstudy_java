package day09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDB {

  public static void main(String[] args) {
    String url = "jdbc:mysql://127.0.0.1:3306/javadb?useUnicode=true&characterEncoding=utf8";
    String driver = "org.gjt.mm.mysql.Driver";
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    try {
      Class.forName(driver);
      
      con = DriverManager.getConnection(url, "javauser", "1234");
      
      String sql = " select addressnum, name, handphone, address ";
      sql += " from address order by name asc ";
      
      stmt = con.createStatement();
      
      rs = stmt.executeQuery(sql);
      
      while(rs.next()) {
        int addressnum = rs.getInt("addressnum");
        String name = rs.getString(2);
        String phone = rs.getString(3);
        String address = rs.getString("address");
        
        System.out.println("번호: " + addressnum);
        System.out.println("이름: " + name);
        System.out.println("전화번호: " + phone);
        System.out.println("주소: " + address);
        System.out.println("================================");
      }
      
      
    } catch (ClassNotFoundException | SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      try {
        if(rs != null) rs.close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
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
