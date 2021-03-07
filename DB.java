package hotel.management.system;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    Connection conn = null;
    public static Connection java_db() {

        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\LENOVO\\Desktop\\Hotel\\mydb.sqlite");
            //JOptionPane.showMessageDialog(null, "Connection to database is successful");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }

}
