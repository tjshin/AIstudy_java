package memo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import utility.DBClose;
import utility.Open;

public class MemoDAO {
  
  public List < MemoDTO > list() {
    List < MemoDTO > list = new ArrayList < MemoDTO > ();
    Connection con = Open.getConnection();
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    StringBuffer sql = new StringBuffer();
    
    sql.append(" SELECT * FROM memo ");
    sql.append(" ORDER BY NAME DESC ");
    
    try {
      pstmt = con.prepareStatement(sql.toString());
      
      rs = pstmt.executeQuery();
      
      while(rs.next()) {
        MemoDTO dto = new MemoDTO();
        dto.setMemonum(rs.getInt("memonum"));
        dto.setName(rs.getString("name"));
        dto.setContent(rs.getString("content"));
        dto.setPass(rs.getString("pass"));
        
        list.add(dto);
      }
      
      
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      DBClose.close(rs, pstmt, con);
    }
    return list;
    
  }
  
  public boolean delete(int memonum) {
    boolean flag = false;
    Connection con = Open.getConnection();
    PreparedStatement pstmt = null;
    StringBuffer sql = new StringBuffer();
    
    sql.append(" DELETE FROM memo ");
    sql.append(" WHERE memonum = ? ");
    
    try {
      pstmt = con.prepareStatement(sql.toString());
      pstmt.setInt(1, memonum);
      
      int cnt = pstmt.executeUpdate();
      
      if(cnt>0) flag = true;      
      
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      DBClose.close(pstmt, con);
    }
    return flag;    
  }
  
  public boolean update(MemoDTO dto) {
    boolean flag = false;
    Connection con = Open.getConnection();
    PreparedStatement pstmt = null;
    StringBuffer sql = new StringBuffer();
    
    sql.append(" UPDATE memo SET NAME = ?, content = ? ");
    sql.append(" WHERE memonum = ? ");
    
    try {
      pstmt = con.prepareStatement(sql.toString());
      pstmt.setString(1, dto.getName());
      pstmt.setString(2, dto.getContent());
      pstmt.setInt(3, dto.getMemonum());
      
      int cnt = pstmt.executeUpdate();
      
      if(cnt>0) flag = true;
      
      
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      DBClose.close(pstmt, con);
    }
    return flag;
    
  }
  
  public MemoDTO read(int memonum) {
    MemoDTO dto = null;
    Connection con = Open.getConnection();
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    StringBuffer sql = new StringBuffer();
    
    sql.append(" select memonum, name, content, pass from memo ");
    sql.append(" where memonum = ? ");
    
    try {
      pstmt = con.prepareStatement(sql.toString());
      pstmt.setInt(1, memonum);
      
      rs = pstmt.executeQuery();
      
      if(rs.next()) {
        dto = new MemoDTO();
        dto.setMemonum(rs.getInt("memonum"));
        dto.setName(rs.getString("name"));
        dto.setContent(rs.getString("content"));
        dto.setPass(rs.getString("pass"));
      }
      
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      DBClose.close(rs, pstmt, con);
    }
    return dto;
    
  }
  
  public boolean create(MemoDTO dto) {
    boolean flag = false;
    Connection con = Open.getConnection();
    PreparedStatement pstmt = null;
    StringBuffer sql = new StringBuffer();
    
    sql.append(" INSERT INTO memo(NAME, content, pass) ");
    sql.append(" VALUES(?, ?, ?) ");
    
    try {
      pstmt = con.prepareStatement(sql.toString());
      pstmt.setString(1, dto.getName());
      pstmt.setString(2, dto.getContent());
      pstmt.setString(3, dto.getPass());
      
      int cnt = pstmt.executeUpdate();
      
      if(cnt>0) flag = true;
      
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      DBClose.close(pstmt, con);
    }
    return flag;
    
  }

}
