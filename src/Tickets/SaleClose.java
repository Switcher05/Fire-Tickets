/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tickets;
import Tickets.Logging.LoggerExample;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Switcher
 */
/*TODO:
Subtract value from prizes remaining 
*/
public class SaleClose {
Connection c;
PreparedStatement pstmt;
ResultSet rs;
public int invoice_num;
public int invoice_num2;

private static final Logger LOGGER = Logger.getLogger(LoggerExample.class.getName());

    public void closeSale()throws SQLException, Exception{
    PreparedStatement updateTicket = null;
    PreparedStatement selectTicket = null;
    PreparedStatement updateTill = null;
    String selectTicketString = "Select * from till_tape inner join tickets where till_tape.serial = tickets.serial and till_tape.sale_closed = 0";
    String updateTicketString = "UPDATE tickets set unsold_amt = ?, actual_gross = ?, unsold_tickets =?, actual_prizes = ? where serial = ?";
    String updateTill_tape = "Update till_tape SET sale_closed = 1, invoice = ? where invoice = 0";
    try{
        c = DbConnect.getConnection();
        updateTicket = c.prepareStatement(updateTicketString);
        selectTicket = c.prepareStatement(selectTicketString);
        updateTill = c.prepareStatement(updateTill_tape);
//        c.setAutoCommit(false);
        rs = selectTicket.executeQuery();
        rs.next();
        int sale_amount = rs.getInt("sale_amount");
        int prize_amount = rs.getInt("prize_amount");
        String serial = rs.getString("serial");
        int unsold_amt = rs.getInt("unsold_amt");
        int actual_gross = rs.getInt("actual_gross");
        int unsold_tickets = rs.getInt("unsold_tickets");
        int actual_prizes = rs.getInt("actual_prizes");
        unsold_amt = unsold_amt - sale_amount; //needs fixed to adjust based on ticket price
        actual_gross = actual_gross + sale_amount;
        unsold_tickets = unsold_tickets - sale_amount;
        actual_prizes = actual_prizes + prize_amount;
        updateTicket.setInt(1, unsold_amt);
        updateTicket.setInt(2, actual_gross);
        updateTicket.setInt(3, unsold_tickets);
        updateTicket.setInt(4, actual_prizes);
        updateTicket.setString(5, serial);
        updateTicket.executeUpdate();
        updateTill.setInt(1, getInvoice());
        updateTill.executeUpdate();
        LOGGER.log(Level.INFO, "Sale completed, invoice number: {0}", invoice_num2);
        getInvoice();
//        c.commit();
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
        if (selectTicket != null) {
            selectTicket.close();
        }
        if (updateTicket != null) {
            updateTicket.close();
        }
        if (updateTill != null) {
            updateTill.close();
        }
//        c.setAutoCommit(true);
    }
    }
    public void getSale()throws SQLException, Exception{
        
        PreparedStatement getSaleReceipt = null;
        String saleReceipt = "Select sale_amount,serial from till_tape where invoice=105 and sale_closed = 0";
        try{
            c = DbConnect.getConnection();
            getSaleReceipt = c.prepareStatement(saleReceipt);
            c.setAutoCommit(false);
            rs = getSaleReceipt.executeQuery();
            while(rs.next()){
            String serial = rs.getString("serial");
            int amount = rs.getInt("sale_amount");
            }
            rs.next();
            c.commit();
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
        if (getSaleReceipt != null) {
            getSaleReceipt.close();
        }
        c.setAutoCommit(true);
    }
    }
    public int getInvoice()throws SQLException, Exception {

    PreparedStatement selectInvoice = null;
    String selectInvoiceNum = "Select MAX(till_tape.invoice) AS Invoice FROM till_tape";
    try{
        c = DbConnect.getConnection();
        selectInvoice = c.prepareStatement(selectInvoiceNum);
        c.setAutoCommit(false);
        rs = selectInvoice.executeQuery();
        rs.next();
        invoice_num = rs.getInt("invoice");
        LOGGER.log(Level.INFO, "Invoice num: {0}", invoice_num);
        invoice_num2 = invoice_num + 1;
        LOGGER.log(Level.INFO, "Invoice num: {0}", invoice_num2);
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
        if (selectInvoice != null) {
            selectInvoice.close();
        }
        c.setAutoCommit(true);
    }
    return invoice_num2;
}
}
