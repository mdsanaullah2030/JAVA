
package jdbc7;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import set.DbUtil7;


public class Jdbc7 {

public static DbUtil7 db=new DbUtil7();
static PreparedStatement ps;
static ResultSet rs;
static String sql="";
    public static void main(String[] args) {
        save("gdhhfs", "sfs@");
        show();
        
        delete(2);
        System.out.println("Aftar delete");
        show();
        update("Rabbi", "Rabbi@", 5);
        System.out.println("aftar update");
        show();
    }
    public static void save(String name, String email){
        sql="insert into efa(name,email) values(?,?)";
        
    try {
        ps=db.getCon().prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, email);
        ps.executeUpdate();
        ps.close();
        db.getCon().close();
    } catch (SQLException ex) {
        Logger.getLogger(Jdbc7.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    public static void show(){
    sql="select * from efa";
    
    try {
        ps=db.getCon().prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
        String name=rs.getString("name");
        String email=rs.getString("email");
        String id=rs.getString("id");
            System.out.println("ID "+id+"\tName "+name+"\tEmail"+email);
            
        }
        rs.close();
        ps.close();
        db.getCon().close();
    } catch (SQLException ex) {
        Logger.getLogger(Jdbc7.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
    public static void delete(int id){
    sql="delete from efa where id=?";
    
    try {
        ps=db.getCon().prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close();
        db.getCon().close();
    } catch (SQLException ex) {
        Logger.getLogger(Jdbc7.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    
    }
    public static void update(String name,String email ,int id){
    sql="update efa set name=?, email=? where id=?";
    
    try {
        ps=db.getCon().prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, email);
        ps.setInt(3, id);
        
        ps.executeUpdate();
        ps.close();
        db.getCon().close();
    } catch (SQLException ex) {
        Logger.getLogger(Jdbc7.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    }
}
