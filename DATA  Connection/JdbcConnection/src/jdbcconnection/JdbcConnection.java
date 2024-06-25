
package jdbcconnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import text.DbUtil;

public class JdbcConnection {
public DbUtil db=new DbUtil();
static PreparedStatement ps;
static ResultSet rs;
static String sql="";

 
    public static void main(String[] args) {
        
        
        
        
        
    }
    public static void savedata(String name,String email){
    sql="insert into obaidullah(name,email)values(?,?)";
    ps=db.getCon().prepareStatement(email)
    }
    
}
