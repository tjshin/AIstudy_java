package day06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex3 {

  public static void main(String[] args) {
    String user = "";
    String password = "";
    String url = "";
    
    Connection con = null;
    
    try {
      con = DriverManager.getConnection(url, user, password);
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    

  }

}
