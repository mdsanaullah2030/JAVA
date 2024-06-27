
package set;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbUtil5 {
    
  private Connection con=null;
  private String uml="jdbc:mysql://localhost:3307/isdb";
  private String user="root";
  private String password="";
  private String driver="com.mysql.cj.jdbc.Driver";
  
  public Connection getCon(){
      try {
          Class.forName(driver);
          con=DriverManager.getConnection(uml, user, password);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(DbUtil5.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(DbUtil5.class.getName()).log(Level.SEVERE, null, ex);
      }
      return con;
  
  }
}
