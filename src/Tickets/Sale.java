/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tickets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Switcher
 */
public class Sale {
Connection c;
PreparedStatement pstmt;
ResultSet rs;

int id1;
int amount;
int[] amount2;
int gross;
//create an array for values to be closed by the close button int sale[id, amount sold, unsold amount]
public void getSelectedGame(int bin){
     try{
        c = DbConnect.getConnection();
        pstmt = c.prepareStatement("Select serial FROM tickets WHERE Bin = ?");
        pstmt.setInt(1,bin);
        rs = pstmt.executeQuery();
        rs.next();
       }catch (Exception e) { e.printStackTrace(); }
}
public int Prize(int bin, int subtotal, String serial){
    try{
        c = DbConnect.getConnection();
        pstmt = c.prepareStatement("INSERT INTO `fire_tickets`.`till_tape` (`serial`, `name`, `time`, `sale_amount`, `prize_amount`, `users_user_id`, `customers_cust_id`, `locations_loc_id`) VALUES (?, 'prize', ?, '0', ?, '1', '1', '1')");
        pstmt.setString(1,serial);
        pstmt.setTimestamp(2, getCurrentTimeStamp());
        pstmt.setInt(3, subtotal);
        pstmt.executeUpdate();
    }catch (Exception e) { e.printStackTrace(); }
    System.out.println("Updated till tape with prize - Serial: " + serial + " Sold: " + subtotal);
    return amount;
}

public int Sale(int bin, int subtotal, String serial){
    
    try{
        System.out.println("Recieved serial: "+ serial);
        c = DbConnect.getConnection();
        pstmt = c.prepareStatement("INSERT INTO `fire_tickets`.`till_tape` (`serial`, `name`, `time`, `sale_amount`, `prize_amount`, `users_user_id`, `customers_cust_id`, `locations_loc_id`) VALUES (?, 'sale', ?, ?, '0', '1', '1', '1')");
        pstmt.setString(1,serial);
        pstmt.setTimestamp(2, getCurrentTimeStamp());
        pstmt.setInt(3, subtotal);
        pstmt.executeUpdate();
        }catch (Exception e) { e.printStackTrace(); }
        System.out.println("Updated till tape with sale - Serial: " + serial + " Sold: " + subtotal);
        return amount;
}

public int unsold_amt(String serial, int unsold){
    try{
        c = DbConnect.getConnection();
        pstmt = c.prepareStatement("Select unsold_amt from tickets where serial = ?");
        pstmt.setString(1,serial);
        pstmt.executeQuery();
    }catch (Exception e) { e.printStackTrace(); }
       return unsold;     
}
public int Sale2(int unsold_amt, int actual_gross, int unsold_tickets, int subtotal, String serial) throws SQLException, Exception{
    PreparedStatement updateTill = null;
    //PreparedStatement updateTicket = null;
    
    String updateTillString = "INSERT INTO `fire_tickets`.`till_tape` (`serial`, `name`, `time`, `sale_amount`, `prize_amount`, `users_user_id`, `customers_cust_id`, `locations_loc_id`, invoice) VALUES (?, 'sale', ?, ?, '0', '3', '3', '1','0')";
   // String updateTicketString = "UPDATE tickets set unsold_amt = ?, actual_gross = ?, unsold_tickets =? where serial = ?";
   // unsold_amt = unsold_amt - subtotal; //needs fixed to adjust based on ticket price
    //actual_gross = actual_gross + subtotal;
    //unsold_tickets = unsold_tickets - subtotal;
    try{
//        Login login = new Login();
        c = DbConnect.getConnection();
        updateTill = c.prepareStatement(updateTillString,PreparedStatement.RETURN_GENERATED_KEYS);
     //   updateTicket = c.prepareStatement(updateTicketString);
        c.setAutoCommit(false);
        updateTill.setString(1,serial);
        updateTill.setTimestamp(2, getCurrentTimeStamp());
        updateTill.setInt(3, subtotal);
//        updateTill.setInt(4, login.getUserID());
        //updateTill.setInt(4, );
        updateTill.executeUpdate();
        ResultSet key = updateTill.getGeneratedKeys();
        System.out.println("key " + key);
//        updateTicket.setInt(1, unsold_amt);
//        updateTicket.setInt(2, actual_gross);
//        updateTicket.setInt(3, unsold_tickets);
//        updateTicket.setString(4, serial);
//        updateTicket.executeUpdate();
        c.commit();
      //  System.out.println("Sale completed");
        
                
    }catch (SQLException e ) {
        Utilities.printSQLException(e);
        if (c != null) {
            try {
                System.err.print("Transaction is being rolled back");
                c.rollback();
            } catch(SQLException excep) {
                Utilities.printSQLException(excep);
            }
        }
    } finally {
        if (updateTill != null) {
            updateTill.close();
        }
//        if (updateTicket != null) {
//            updateTicket.close();
//        }
        c.setAutoCommit(true);
    }
    return amount;
}

private static java.sql.Timestamp getCurrentTimeStamp() {

        java.util.Date today = new java.util.Date();
        return new java.sql.Timestamp(today.getTime());

}
public void Close(int bin, int amount, String serial){
    
    //Theory:select all rows where sale_closed is = 0 from till tape, then add up amount, minus prizes and update games with sold amounts. Use batch sql statemtns and java stack
  try{ 
        c = DbConnect.getConnection();
        //Select and add up the rows where sale is not closed. 
        pstmt = c.prepareStatement("Select SUM(sale_amount) from till_tape where sale_closed = 0");
        rs = pstmt.executeQuery();      
        System.out.println("Executed select");
        rs.next();
        int num = rs.getInt(1);//change to return of int value
        System.out.println(num);
        //Update rows where sale_closed = 0 to confirm the sale
        pstmt = c.prepareStatement("Update till_tape SET sale_closed = 1 where sale_closed = 0");
        pstmt.executeUpdate();
        System.out.println("Executed update");
        //Modify the values of the ticket rows, unsold, actual gross, actual prizes
        //use stack database

        }catch (Exception e) { e.printStackTrace(); }
      
}
    
}



