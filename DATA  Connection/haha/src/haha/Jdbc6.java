package haha;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import set.DbUtil6;


public class Jdbc6 {
public static DbUtil6 db=new DbUtil6();
static PreparedStatement ps;
static ResultSet rs;
static String sql="";
    public static void main(String[] args) {
        savedata("sanaullah", "sanaullah@gmail.com");
        showdata();
        deletedata(3);
        System.out.println("aftar delete");
        showdata();
        update("mahi", "mahi@gmail.com", 1);
        System.out.println("aftar update");
        showdata();
        
    }
    public static void savedata(String name,String email){
    sql="insert into jee(name,email) values(?,?)";
  
    try {
        ps=db.getCon().prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, email);
        ps.executeUpdate();
        ps.close();
        db.getCon().close();
    } catch (SQLException ex) {
        Logger.getLogger(Jdbc6.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}
    public static void showdata(){
    sql="select * from jee";
    try {
        ps=db.getCon().prepareStatement(sql);
       rs= ps.executeQuery();
        while(rs.next()){
        String name=rs.getString("name");
        String email=rs.getString("email");
        String id=rs.getString("id");
            System.out.println("ID "+id+"\tName "+name+"Email "+email);
        }
        ps.close();
        rs.close();
        db.getCon().close();
    } catch (SQLException ex) {
        Logger.getLogger(Jdbc6.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
       public static void deletedata(int id){
       
       sql="delete from jee where id=?";
    try {
        ps=db.getCon().prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close();
        db.getCon().close();
    } catch (SQLException ex) {
        Logger.getLogger(Jdbc6.class.getName()).log(Level.SEVERE, null, ex);
    }
       
       }
       public static void update(String name, String email, int id){
       sql="update jee set name=?,email=? where id=?";
    try {
        ps=db.getCon().prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, email);
        ps.setInt(3, id);
        ps.executeUpdate();
        ps.close();
        db.getCon().close();
    } catch (SQLException ex) {
        Logger.getLogger(Jdbc6.class.getName()).log(Level.SEVERE, null, ex);
    }
       
       }
            

}