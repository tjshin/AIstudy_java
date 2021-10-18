package day09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDBOne {

  public static void main(String[] args) {
    String url = "jdbc:mysql://127.0.0.1:3306/javadb?useUnicode=true&characterEncoding=utf8";
    String driver = "org.gjt.mm.mysql.Driver";
    Connection con = null; // DB 연결 객체
    Statement stmt = null; // SQL문 전송 객체
    ResultSet rs = null; // DQL(select)문을 전송한 후 실행된 결과값을 받는 자바클래스
    
    //1. 드라이버 메모리 올림 (객체 생성)
    try {
      Class.forName(driver);
      //2. 연결 객체 생성
      con = DriverManager.getConnection(url, "javauser", "1234");
      
      //3. DB 서버에 전송할 SQL 작성
      String sql = " select addressnum, name, handphone, address ";
      sql += " from address where addressnum = 4 ";
      
      //4. 전송 객체 생성 후 SQL 전송
      stmt = con.createStatement();
      
      rs = stmt.executeQuery(sql);
      
      //5. 전송 후 받은 결과값 확인
      if(rs.next()) {
        int addressnum = rs.getInt("addressnum");
        String name = rs.getString(2);
        String phone = rs.getString(3);
        String address = rs.getString("address");
        
        System.out.println("번호: " + addressnum);
        System.out.println("이름: " + name);
        System.out.println("전화번호: " + phone);
        System.out.println("주소: " + address);
      }
      
    } catch (ClassNotFoundException | SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      try {
        if(rs != null)rs.close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
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
