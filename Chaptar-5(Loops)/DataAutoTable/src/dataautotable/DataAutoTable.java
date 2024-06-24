
package dataautotable;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import text.DbUtil;


public class DataAutoTable {

static PreparedStatement ps;
static ResultSet rs;
static DbUtil db=new DbUtil();
    public static void main(String[] args) {
      
        String selectSql="insert into tawhid(name)valuse(?)";
    try {
        ps=db.getCon().prepareStatement(selectSql);
           
            ps.setString(1, "sanaullah@gmail.com");
    } catch (SQLException ex) {
        Logger.getLogger(DataAutoTable.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
    }
    
}
