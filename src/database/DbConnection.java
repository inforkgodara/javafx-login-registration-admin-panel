/**
 * @author inforkgodara
 */
package database;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection {
    private Connection con;
    private static DbConnection dbc;
    private DbConnection() {
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            FileInputStream fis=new FileInputStream("assets\\database\\connection.prop");
            Properties p=new Properties (); 
            p.load(fis); 
            con=DriverManager.getConnection((String)p.get("url"),(String)p.get("username"),(String)p.get("password"));
        } catch (Exception ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static DbConnection getDatabaseConnection() {
        if (dbc == null) {
            dbc = new DbConnection();
        }
        return dbc;
    }
    
    public Connection getConnection() {
        return con;
    }
    
    public static void main(String[] args) {
        new DbConnection();
    }
}
