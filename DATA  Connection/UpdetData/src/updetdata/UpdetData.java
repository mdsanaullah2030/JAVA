
package updetdata;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import test.DbUtil;


public class UpdetData {
static PreparedStatement ps;
static ResultSet rs;

  
    public static void main(String[] args) {
        DbUtil db=new DbUtil();
        
        String insertSql="insert into biodata(name,email,address,cell)values(?,?,?,?)";
    try {
        ps=db.getCon().prepareStatement(insertSql);
        ps.setString(1, "Mostafizur");
        ps.setString(2, "Mostafizur@email.com");
        ps.setString(3, "Rajshahi");
        ps.setString(4, "12325435");
        ps.executeUpdate();
        ps.close();
        db.getCon().close();
    } catch (SQLException ex) {
        Logger.getLogger(UpdetData.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
}
