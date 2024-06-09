
package dataupdet;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import test.Student;


public class DataUpdet {
static PreparedStatement ps;
static ResultSet rs;
static DbUtil db=new DbUtil();


    public static void main(String[] args) { 
        
        saveData();
        showData();
       Student student=new Student(4, "Hamidullah", "Hamidullah@gmail.com", "chapi", "0142345");
       editData(student);
       showData();
    }
    
    public  static void saveData(){
    String insertSql="insert into biodata(name,email,address,cell)values(?,?,?,?)";
    try {
        ps=db.getCon().prepareStatement(insertSql);
        ps.setString(1, "sanaullah");
        ps.setString(2, "sanaullah@email.com");
        ps.setString(3, "Rajshahi");
        ps.setString(4, "01303246215");
        ps.executeUpdate();
        ps.close();
        db.getCon().close();
    } catch (SQLException ex) {
        Logger.getLogger(DataUpdet.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    }
    public static void showData(){
    String showSql="select * from biodata ";
    try {
        ps=db.getCon().prepareStatement(showSql);
        rs=ps.executeQuery();
        
        while(rs.next()){
            int id=rs.getInt("id");
            String name=rs.getString("name");
            String email=rs.getString("email");
            String address=rs.getString("address");
            String cell=rs.getString("cell");
            
        
            System.out.println("ID "+id+" Name "+" email "+email+" address "+address+" cell "+cell);
        }
        ps.close();
        rs.close();
        db.getCon().close();
        
        
        
        
    } catch (SQLException ex) {
        Logger.getLogger(DataUpdet.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    
    }
    public static void editData(Student s){
    
    String sql="update biodata set name=?,email=?,address=?,cell=? where id=?";
    
    try {
        ps=db.getCon().prepareStatement(sql);
        ps.setString(1, s.getName());
        ps.setString(2, s.getEmail());
        ps.setString(3, s.getAddress());
        ps.setString(4, s.getCell());
        ps.setInt(5, s.getId());
        System.out.println("Eidet successful");
    } catch (SQLException ex) {
        Logger.getLogger(DataUpdet.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    }
    
}
