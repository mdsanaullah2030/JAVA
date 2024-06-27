
package jdbc5;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import set.DbUtil5;


public class JDBC5 {
public static DbUtil5 db=new DbUtil5();
static PreparedStatement ps;
static ResultSet rs;
static String sql;
        

    public static void main(String[] args) {
      
        savedata("sanaullah", "sanaullah@gmail.com");
        showdata();
        
        delete(2);
        System.out.println("aftar the delete");
        showdata();
        updete("Rohim", "Rohim@gmail.com", 4);
        System.out.println("aftar update");
        showdata();
    }
    public static void savedata(String name,String email){
    sql="insert into  java(name,email) values(?,?)";
    try {
        ps=db.getCon().prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, email);
        ps.executeUpdate();
        ps.close();
        db.getCon().close();
        
    } catch (SQLException ex) {
        Logger.getLogger(JDBC5.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
    public static void showdata(){
    sql="select * from java";
    try {
        ps=db.getCon().prepareStatement(sql);
        rs=ps.executeQuery();
   while(rs.next()){
   String name=rs.getString("name");
   String email=rs.getString("email");
   String id=rs.getString("id");
       
       System.out.println("ID "+id+"\tName "+name+"\tEmail "+email);
   }
   rs.close();
   ps.close();
   db.getCon().close();
    } 
    catch (SQLException ex) {
        Logger.getLogger(JDBC5.class.getName()).log(Level.SEVERE, null, ex);
    }

    }
    public static void delete(int id){
        sql="delete from java where id=?";
    try {
        ps=db.getCon().prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close();
        db.getCon().close();
        
    } catch (SQLException ex) {
        Logger.getLogger(JDBC5.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
    public static void updete(String name, String email,int id){
    sql="update java set name=?, email=? where id=?";
    try {
        ps=db.getCon().prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, email);
        ps.setInt(3, id);
        
        ps.executeUpdate();
        ps.close();
        db.getCon().close();
    } catch (SQLException ex) {
        Logger.getLogger(JDBC5.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
    
}
