package jdbc3;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import set.DbUtil3;

public class JDBC3 {

    public static DbUtil3 db = new DbUtil3();
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql = "";

    public static void main(String[] args) {
        saveData("sanaullah", "sanaullah@gmail.com");
        showData();
    }

    public static void saveData(String name, String email) {
        sql = "insert into jee(name,email) values(?,?)";
        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.executeUpdate();
            ps.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBC3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void showData() {
        sql = "select * from jee";
        try {
            ps = db.getCon().prepareStatement(sql);
            ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String empid = rs.getString("empid");
                System.out.println("Emp ID" + empid + "\tname" + name + "Email" + email);

            }
            ps.close();
            rs.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBC3.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
