/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fire.tickets;
import Tickets.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Switcher
 */
public class FireTickets {
Connection con;
Statement stmt;
ResultSet rs;
int curRow = 0;

public void DoConnect( ) {
        String url = "jdbc:mysql://192.168.1.2:3306/"; 
        String dbName = "pos";
        String driver = "com.mysql.jdbc.Driver"; 
        String userName = "switcher"; 
        String password = "hawaii"; 
        try { 
            Class.forName(driver).newInstance(); 
            con = DriverManager.getConnection(url+dbName,userName,password);        
        } 
        catch (Exception e) { e.printStackTrace(); } 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login login = new Login();
login.setVisible(true);
    }
}
