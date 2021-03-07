package hotel.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class DBEmployee {
    PreparedStatement pst = null;
    String conString = "jdbc:sqlite:C:\\Users\\LENOVO\\Desktop\\hotel\\mydb.sqlite";

    public Boolean Delete(String id) {
        String sql = "DELETE from staff where id=" + id + "";
        try {
            Connection conn = DriverManager.getConnection(conString);
            Statement s = conn.prepareStatement(sql);
            pst = conn.prepareStatement(sql);
            pst.execute();
            return true;


        } catch (Exception e) {
            System.out.print(e);
            return false;
        } finally {
            try {
                pst.close();
            } catch (Exception e) {
            }
        }
    }
}
