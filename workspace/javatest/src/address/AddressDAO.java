package address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import utility.DBClose;
import utility.Open;

public class AddressDAO {
  
  
  public List < AddressDTO > list(){
    List < AddressDTO > list = new ArrayList < AddressDTO > ();
    Connection con = Open.getConnection();
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    StringBuffer sql = new StringBuffer();
    
    sql.append(" SELECT * FROM address ");
    sql.append(" ORDER BY NAME DESC ");
    
    try {
      pstmt = con.prepareStatement(sql.toString());
      
      rs = pstmt.executeQuery();
      
      while(rs.next()) {
        AddressDTO dto = new AddressDTO();
        dto.setAddressnum(rs.getInt("addressnum"));
        dto.setName(rs.getString("name"));
        dto.setHandphone(rs.getString("handphone"));
        dto.setAddress(rs.getString("address"));
        
        list.add(dto); //없으면 한 줄만 나옴
        
      }
      
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      DBClose.close(rs, pstmt, con);
    }
    return list;
  }
    
  /** 역할
   * 레코드 삭제
   * @param addressnum - primary key
   * @return true - 삭제 성공, false - 삭제 실패
   */
  public boolean delete(int addressnum) {
    boolean flag = false;
    Connection con = Open.getConnection();
    PreparedStatement pstmt = null;
    StringBuffer sql = new StringBuffer();
    
    sql.append(" delete from address ");
    sql.append(" where addressnum = ? ");
    
    try {
      pstmt = con.prepareStatement(sql.toString());
      pstmt.setInt(1, addressnum);
      
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
    
  /** 역할
   * 레코드 수정
   * @param dto - 수정할 데이터
   * @return true - 수정 성공, false - 수정 실패
   */
  public boolean update(AddressDTO dto) {
    boolean flag = false;
    Connection con = Open.getConnection();
    PreparedStatement pstmt = null;
    StringBuffer sql = new StringBuffer();
    
    sql.append(" UPDATE address ");
    sql.append(" SET handphone = ?, ");
    sql.append(" 		address = ? ");
    sql.append(" WHERE addressnum = ? ");
    
    try {
      pstmt = con.prepareStatement(sql.toString());
      pstmt.setString(1, dto.getHandphone());
      pstmt.setString(2, dto.getAddress());
      pstmt.setInt(3, dto.getAddressnum());
      
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
  
  /** 역할
   * 레코드 하나를 가져옵니다.
   * @param addressnum - primary key
   * @return AddressDTO - 레코드 하나
   */
  public AddressDTO read(int addressnum) {
    AddressDTO dto = null;
    Connection con = Open.getConnection();
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    StringBuffer sql = new StringBuffer();
    
    sql.append(" SELECT addressnum, NAME, handphone, address FROM address ");
    sql.append(" WHERE addressnum = ? ");
    
    try {
      pstmt = con.prepareStatement(sql.toString());
      pstmt.setInt(1, addressnum);
      
      rs = pstmt.executeQuery();
      
      if(rs.next()) {
        dto = new AddressDTO();
        dto.setAddressnum(rs.getInt("addressnum"));//rs에서 꺼내와서 DTO에 저장합니다.
        dto.setName(rs.getString("name"));
        dto.setHandphone(rs.getString("handphone"));
        dto.setAddress(rs.getString("address"));
      }
      
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }finally {
      DBClose.close(rs, pstmt, con);
    }    
    return dto;
  }
  
  /** 역할
   * 데이터 베이스에 레코드 생성
   * @param dto - 생성될 데이터
   * @return true - 생성 성공, false - 생성 실패
   */
  public boolean create(AddressDTO dto) {
    boolean flag = false;
    Connection con = Open.getConnection();
    PreparedStatement pstmt = null;
    StringBuffer sql = new StringBuffer();
    
    sql.append(" INSERT INTO address(NAME, handphone, address) ");
    sql.append(" VALUES(?, ?, ?) ");
    
    try {
      pstmt = con.prepareStatement(sql.toString());
      pstmt.setString(1, dto.getName());
      pstmt.setString(2, dto.getHandphone());
      pstmt.setString(3, dto.getAddress());
      
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
