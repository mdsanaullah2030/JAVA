
package jdbceconnection;

import dbutil.DbUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JdbceConnection {
static PreparedStatement ps;
static ResultSet rs;
  
    public static void main(String[] args) {
        DbUtil db=new DbUtil();
        
        String input ="insert into student(name,email,address,cell)values(?,?,?,?)";
        
        
    try {
        ps=db.getCon().prepareStatement(input);
        ps.setString(1, "Abdullah");
        ps.setString(2, "Abdullah@gmail.com");
        ps.setString(3, "Chapainwbgonj");
        ps.setString(4, "01303246215");
        ps.executeUpdate();
        ps.close();
        db.getCon().close();
    } catch (SQLException ex) {
        Logger.getLogger(JdbceConnection.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }
    
}
