/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tickets.TicketEditor;

import Tickets.DbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

/**
 *
 * @author Ryan
 */
public abstract class cGameTemplate implements gameTemplate{
    
    Connection con;
    Statement stmt;
    PreparedStatement pstmt;
    ResultSet rs;
    int[] prizeRem;
    int[] prizeAmt;
    int[] prizeAll;
    
    @Override
    public void viewTemplate() {
        try{
               con = DbConnect.getConnection();
               pstmt = con.prepareStatement("SELECT * FROM game_templates INNER JOIN tickets where game_templates_part_num = part_num",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
               rs = pstmt.executeQuery();
               rs.next();
               /*TODO 
               Add logger here
               */
               System.out.println("Loaded first row data");
        }catch(Exception e) { e.printStackTrace(); }
    }
    @Override
    public void createTemplate(){
        
    }
    @Override
    public void updateTemplate(){
        
    }
    @Override
    public void deleteTemplate(){
        
    }
    @Override
    public void listAllTemplate(){
        
    }
    @Override
    public void fillForms(){
        try{
            String part_no = rs.getString("part_num");
            String game_name = rs.getString("game_name");
            String game_cost = rs.getString("game_cost");
            String inv_num = rs.getString("invoice_num");
            String date_purch = rs.getString("date_purchased");
            String ticket_cost = rs.getString("ticket_cost");
            String num_tickets = rs.getString("num_tickets");
            String ideal_gross = rs.getString("idea_gross");
            String ideal_prizes = rs.getString("idea_prizes");
            String ideal_net = rs.getString("idea_net");
            String mf_id = rs.getString("mfg_id_mfg_id");
            String dist_id = rs.getString("dists_id_dist_id");
            String last_sale = rs.getString("last_sale");
            String last_sale_all = rs.getString("last_sale_allow");
            prizeAmt = new int[15];
            prizeAmt[0] = rs.getInt("prize_amt1");
            prizeAmt[1] = rs.getInt("prize_amt2");
            prizeAmt[2] = rs.getInt("prize_amt3");
            prizeAmt[3] = rs.getInt("prize_amt4");
            prizeAmt[4] = rs.getInt("prize_amt5");
            prizeAmt[5] = rs.getInt("prize_amt6");
            prizeAmt[6] = rs.getInt("prize_amt7");
            prizeAmt[7] = rs.getInt("prize_amt8");
            prizeAmt[8] = rs.getInt("prize_amt9");
            prizeAmt[9] = rs.getInt("prize_amt10");
            prizeAmt[10] = rs.getInt("prize_amt11");
            prizeAmt[11] = rs.getInt("prize_amt12");
            prizeAmt[12] = rs.getInt("prize_amt13");
            prizeAmt[13] = rs.getInt("prize_amt14");
            prizeAmt[14] = rs.getInt("prize_amt15");
            prizeAll = new int[15];
            prizeAll[0] = rs.getInt("prize_all1");
            prizeAll[1] = rs.getInt("prize_all2");
            prizeAll[2] = rs.getInt("prize_all3");
            prizeAll[3] = rs.getInt("prize_all4");
            prizeAll[4] = rs.getInt("prize_all5");
            prizeAll[5] = rs.getInt("prize_all6");
            prizeAll[6] = rs.getInt("prize_all7");
            prizeAll[7] = rs.getInt("prize_all8");
            prizeAll[8] = rs.getInt("prize_all9");
            prizeAll[9] = rs.getInt("prize_all10");
            prizeAll[10] = rs.getInt("prize_all11");
            prizeAll[11] = rs.getInt("prize_all12");
            prizeAll[12] = rs.getInt("prize_all13");
            prizeAll[13] = rs.getInt("prize_all14");
            prizeAll[14] = rs.getInt("prize_all15");
            
        }catch (Exception e) { e.printStackTrace(); } 
    }
}
