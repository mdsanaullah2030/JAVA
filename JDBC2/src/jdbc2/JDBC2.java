
package jdbc2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import set.DbUtil2;


public class JDBC2 {
public static DbUtil2 db=new DbUtil2();
static PreparedStatement ps;
static ResultSet rs;
static  String sql="";

  
    public static void main(String[] args) {
        saveEmp("Mahabur","Mahabur@gmail.com" ,"1552478");
        
        
        showEmp();  
        
         deleteEmp(2);
        System.out.println("\n aftar delete");
        showEmp();
        updateEmp("kutub", "kutub@gmail.com", "5214545", 1);
        System.out.println("\n aftar update \n");
        showEmp();
        
}
  public  static void saveEmp(String name,String email,String address ){
    sql="insert into java(  name,email,address) values(?,?,?)";
    
  
              
    try {
        ps=db.getCon().prepareStatement(sql);
         ps.setString(1, name);
          ps.setString(2, email);
                ps.setString(3, address);
               ps.executeUpdate();
               ps.close();
               db.getCon().close();
    } catch (SQLException ex) {
        Logger.getLogger(JDBC2.class.getName()).log(Level.SEVERE, null, ex);
    }
}
  public static void showEmp(){
  sql="select * from java";
    try {
        ps=db.getCon().prepareStatement(sql);
        rs=ps.executeQuery();
           while(rs.next()){
        String name=rs.getString("name");
        String email=rs.getString("email");
        String address=rs.getString("address");
        String empid=rs.getString("empid");
        
        
            System.out.println("Emp ID:"+ empid+"\tName:"+name+"\tEmal"+email+"\taddress"+address);
        
        }
        ps.close();
        rs.close();
        db.getCon().close();
    } catch (SQLException ex) {
        Logger.getLogger(JDBC2.class.getName()).log(Level.SEVERE, null, ex);
    }
  
  }
  public static  void deleteEmp(int empid ){
   sql="delete from java where empid=?";
    try {
        ps=db.getCon().prepareStatement(sql);
         ps.setInt(1, empid);
        ps.executeUpdate();
        ps.close();
        db.getCon().close();
        
    } catch (SQLException ex) {
        Logger.getLogger(JDBC2.class.getName()).log(Level.SEVERE, null, ex);
    }
  
  }
     public static  void updateEmp(String name,String email,String address,int empid){
     sql="update java set name=?,email=?,address=? where empid=?";
    try {
        ps=db.getCon().prepareStatement(sql);
          ps.setString(1, name);
                ps.setString(2, email);
                ps.setString(3, address);
                ps.setInt(4, empid);
                
               ps.executeUpdate();
               ps.close();
               db.getCon().close();
    } catch (SQLException ex) {
        Logger.getLogger(JDBC2.class.getName()).log(Level.SEVERE, null, ex);
    }
}
}