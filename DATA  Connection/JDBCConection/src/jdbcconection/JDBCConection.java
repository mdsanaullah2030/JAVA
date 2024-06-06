
package jdbcconection;


import dbutil.DbUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JDBCConection {
 static PreparedStatement ps;
 static ResultSet rs;
   
    public static void main(String[] args) {
        
        DbUtil db=new DbUtil();
        String input="insert into student(name,gmail,address)values(?,?,?)";
        
     try {
         ps=db.getCon().prepareStatement(input);
         ps.setString(1, "sanaullah");
         ps.setString(2, "sanaullah@gmail.com");
         ps.setString(3, "Chapainwbgonj");
         
         ps.executeUpdate();
         ps.close();
         db.getCon().close();
         
         
         
         
     } catch (SQLException ex) {
         Logger.getLogger(JDBCConection.class.getName()).log(Level.SEVERE, null, ex);
     }
     
     String selectSql="select * from student";
     ResultSet rs;
     
     try {
         ps=db.getCon().prepareStatement(selectSql);
       
         rs=ps.executeQuery();
         
         while(rs.next()){
         int id=rs.getInt("id");
         String name=rs.getString("name");
         String gmail=rs.getString("gmail");
         String address=rs.getString("address");
         
             System.out.println("id"+id+"name"+name+"gmail"+gmail+"address");
         
         }
         ps.close();
         rs.close();
         db.getCon().close();
         
         
         
     } catch (SQLException ex) {
         Logger.getLogger(JDBCConection.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
}
