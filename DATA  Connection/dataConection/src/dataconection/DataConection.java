
package dataconection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import test.DButil;


public class DataConection {

  static PreparedStatement ps;
  static ResultSet rs;
    public static void main(String[] args) {
       DButil db=new DButil();
       String input="insert into registasion(name,gemail,address,cell)values(?,?,?,?)";
       
       
      try {
          ps=db.getCon().prepareStatement(input);
       
          ps.setString(1, "Hamidullah");
          ps.setString(2, "samiullah@gmail.com");
          ps.setString(3, "Chapainwobgonj");
          ps.setString(4, "01303246215");
          
          ps.executeUpdate();
          ps.close();
          db.getCon().close();
          
      } catch (SQLException ex) {
          Logger.getLogger(DataConection.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      String selectSql="select * from registasion";
      ResultSet sr;
      try {
          ps=db.getCon().prepareStatement(selectSql);
          rs=ps.executeQuery();
          while(rs.next()){
              int id=rs.getInt("id");
              String name=rs.getString("name");
              String gemail=rs.getString("gemail");
              String address=rs.getString("address");
              String cell=rs.getString("cell");
              
              System.out.println("id "+id+" name "+name+" Gemail "+gemail+" address "+address+" cell "+cell);
          
          }
          ps.close();
          rs.close();
         db.getCon().close();
          
          
          
          
          
      } catch (SQLException ex) {
          Logger.getLogger(DataConection.class.getName()).log(Level.SEVERE, null, ex);
      }
    
      
      }
    }
    

