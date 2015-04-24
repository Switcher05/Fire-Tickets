/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*TODO:
Need to create game template first then add to tickets table.
*/
package Tickets.TicketEditor;
import Tickets.DbConnect;
import Tickets.TicketEditor.DAOFactory;
import Tickets.TicketEditor.GameTemp;
import Tickets.TicketEditor.GameTempDAO;
import Tickets.TicketEditor.TicketsDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Switcher
 */
public class TicketsEditor extends javax.swing.JFrame {
Connection con;
Statement stmt;
PreparedStatement pstmt;
ResultSet rs;
String tickets_serial;
public int row = 0;
public int dbsize = 0;
Logger logger = Logger.getLogger( TicketsEditor.class.getName() );

    public TicketsEditor() {
        initComponents();
        //default_load();
       //Fillforms();
        LoadDB(0);
    }
    public void default_load(){
try{
        Connection c = DbConnect.getConnection();
        pstmt = c.prepareStatement("SELECT * FROM game_templates INNER JOIN tickets where game_templates_part_num = serial",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        rs = pstmt.executeQuery();
        //rs.next();
        System.out.println("Loaded first row data");
}catch (Exception e) { e.printStackTrace(); } 
    }
   
    public void Fillforms(){
  try{
        String game_name = rs.getString("game_name");
        String mf_id = rs.getString("mfg_id_mfg_id");
        String dist_id = rs.getString("dists_id_dist_id");
        String part_no = rs.getString("part_num");
        String inv_num = rs.getString("invoice_num");
        String date_purch = rs.getString("date_purchased");
        String ticket_cost = rs.getString("ticket_cost");
        String num_tickets = rs.getString("num_tickets");
        String ideal_gross = rs.getString("idea_gross");
        String ideal_prizes = rs.getString("idea_prizes");
        String ideal_net = rs.getString("idea_net");
        //int gmecst = rs.getInt("game_cost");
       // String game_cost = Integer.toString(gmecst);
        String game_cost = rs.getString("game_cost");
        String last_sale = rs.getString("last_sale");
        String last_sale_all = rs.getString("last_sale_allow");
        String priz_amt1 = rs.getString("prize_amt1");
        String priz_amt2 = rs.getString("prize_amt2");
        String priz_amt3 = rs.getString("prize_amt3");
        String priz_amt4 = rs.getString("prize_amt4");
        String priz_amt5 = rs.getString("prize_amt5");
        String priz_amt6 = rs.getString("prize_amt6");
        String priz_amt7 = rs.getString("prize_amt7");
        String priz_amt8 = rs.getString("prize_amt8");
        String priz_amt9 = rs.getString("prize_amt9");
        String priz_amt10 = rs.getString("prize_amt10");
        String priz_amt11 = rs.getString("prize_amt11");
        String priz_amt12 = rs.getString("prize_amt12");
        String priz_amt13 = rs.getString("prize_amt13");
        String priz_amt14 = rs.getString("prize_amt14");
        String priz_amt15 = rs.getString("prize_amt15");
        String priz_all1 = rs.getString("prize_all1");
        String priz_all2 = rs.getString("prize_all2");
        String priz_all3 = rs.getString("prize_all3");
        String priz_all4 = rs.getString("prize_all4");
        String priz_all5 = rs.getString("prize_all5");
        String priz_all6 = rs.getString("prize_all6");
        String priz_all7 = rs.getString("prize_all7");
        String priz_all8 = rs.getString("prize_all8");
        String priz_all9 = rs.getString("prize_all9");
        String priz_all10 = rs.getString("prize_all10");
        String priz_all11 = rs.getString("prize_all11");
        String priz_all12 = rs.getString("prize_all12");
        String priz_all13 = rs.getString("prize_all13");
        String priz_all14 = rs.getString("prize_all14");
        String priz_all15 = rs.getString("prize_all15");
        tickets_serial = rs.getString("tickets_serial");
        
        textGame.setText(game_name);
        textPartNum.setText(part_no);
        textManID.setText(mf_id);
        textDistID.setText(dist_id);
        textInvoiceNum.setText(inv_num);
        textInvoiceDate.setText(date_purch);
        textCostTicket.setText(ticket_cost);
        textNumTickets.setText(num_tickets);
        textIdealGross.setText(ideal_gross);
        textIdealPrizes.setText(ideal_prizes);
        textIdealNet.setText(ideal_net);
        textGameCost.setText(game_cost);
        textLastSale.setText(last_sale);
        textAllLast.setText(last_sale_all);
        textAmt1.setText(priz_amt1);
        textAmt2.setText(priz_amt2);
        textAmt3.setText(priz_amt3);
        textAmt4.setText(priz_amt4);
        textAmt5.setText(priz_amt5);
        textAmt6.setText(priz_amt6);
        textAmt7.setText(priz_amt7);
        textAmt8.setText(priz_amt8);
        textAmt9.setText(priz_amt9);
        textAmt10.setText(priz_amt10);
        textAmt11.setText(priz_amt11);
        textAmt12.setText(priz_amt12);
        textAmt13.setText(priz_amt13);
        textAmt14.setText(priz_amt14);
        textAmt15.setText(priz_amt15);
        textAll1.setText(priz_all1);
        textAll2.setText(priz_all2);
        textAll3.setText(priz_all3);
        textAll4.setText(priz_all4);
        textAll5.setText(priz_all5);
        textAll6.setText(priz_all6);
        textAll7.setText(priz_all7);
        textAll8.setText(priz_all8);
        textAll9.setText(priz_all9);
        textAll10.setText(priz_all10);
        textAll11.setText(priz_all11);
        textAll12.setText(priz_all12);
        textAll13.setText(priz_all13);
        textAll14.setText(priz_all14);
        textAll15.setText(priz_all15);
        String date_placed = rs.getString("Date_placed");
        String date_removed = rs.getString("Date_removed");
        int inplay2 = rs.getInt("Inplay");
        String inplay = Integer.toString(inplay2);
        String unsold_amt = rs.getString("Unsold_amt");
        String actual_gross = rs.getString("Actual_gross");
        String actual_prizes = rs.getString("Actual_prizes");
        String actual_net = rs.getString("Actual_net");
        String bin = rs.getString("Bin");
        String unsold_tick = rs.getString("Unsold_tickets");
        String serial = rs.getString("Serial");
        String priz_rem1 = rs.getString("prize_rem1");
        String priz_rem2 = rs.getString("prize_rem2");
        String priz_rem3 = rs.getString("prize_rem3");
        String priz_rem4 = rs.getString("prize_rem4");
        String priz_rem5 = rs.getString("prize_rem5");
        String priz_rem6 = rs.getString("prize_rem6");
        String priz_rem7 = rs.getString("prize_rem7");
        String priz_rem8 = rs.getString("prize_rem8");
        String priz_rem9 = rs.getString("prize_rem9");
        String priz_rem10 = rs.getString("prize_rem10");
        String priz_rem11 = rs.getString("prize_rem11");
        String priz_rem12 = rs.getString("prize_rem15");
        String priz_rem13 = rs.getString("prize_rem13");
        String priz_rem14 = rs.getString("prize_rem14");
        String priz_rem15 = rs.getString("prize_rem15");
        textDatePlaced.setText(date_placed);
        textDateRem.setText(date_removed);
        textUnsoldValue.setText(unsold_amt);
        textActualGross.setText(actual_gross);
        textActualPrizes.setText(actual_prizes);
        textActualNet.setText(actual_net);
        textBin.setText(bin);
        textUnsoldTickets.setText(unsold_tick);
        textSerial.setText(serial);
        textRem1.setText(priz_rem1);
        textRem2.setText(priz_rem2);
        textRem3.setText(priz_rem3);
        textRem4.setText(priz_rem4);
        textRem5.setText(priz_rem5);
        textRem6.setText(priz_rem6);
        textRem7.setText(priz_rem7);
        textRem8.setText(priz_rem8);
        textRem9.setText(priz_rem9);
        textRem10.setText(priz_rem10);
        textRem11.setText(priz_rem11);
        textRem12.setText(priz_rem12);
        textRem13.setText(priz_rem13);
        textRem14.setText(priz_rem14);
        textRem15.setText(priz_rem15);
 
  }catch (Exception e) { e.printStackTrace(); } 
//JOptionPane.showMessageDialog(TicketsEditor.this, err.getMessage());
}
    
    public void LoadDB(int x){
        DAOFactory javabase = DAOFactory.getInstance("javabase.jdbc");
        logger.log(Level.INFO, "DAOFactory successfully obtained");
        // Obtain UserDAO.
        TicketsDAO ticketsDAO = javabase.getTicketsDAO();
        logger.log(Level.INFO, "TicketsDAO sucessfully obtained");
        //Obtain GameTempDAO
        GameTempDAO gameTempDAO = javabase.getGameTempDAO();
        logger.log(Level.INFO, "Game Temp DAO sucessfully obtainted");
        //List<Tickets> tickets2 = ticketsDAO.list();
        //System.out.println("List of tickets successfully queried: " + tickets2);
        //System.out.println("Thus, amount of users in database is: " + tickets2.size());
        List<GameTemp> gameTemp = gameTempDAO.list();
        //System.out.println("list of game templates: " + gameTemp);
        GameTemp newTemp = new GameTemp();
        newTemp = gameTemp.get(x);
        dbsize = gameTemp.size();
        System.out.println("Size of db : " +dbsize);
        String gameName = newTemp.getGameName();
        String partNum = newTemp.getPartNum();
        int game_cost = newTemp.getGameCost();
        String gameCost = Integer.toString(game_cost);
        int ticket_cost = newTemp.getTicketCost();
        String ticketCost = Integer.toString(ticket_cost);
        int num_tickets = newTemp.getNumTickets();
        String numTickets = Integer.toString(num_tickets);
        int ideal_gross = newTemp.getIdealGross();
        String idealGross = Integer.toString(ideal_gross);
        int ideal_prizes = newTemp.getIdealPrizes();
        String idealPrizes = Integer.toString(ideal_prizes);
        int ideal_net = newTemp.getIdealNet();
        String idealNet = Integer.toString(ideal_net);
        int mfID = newTemp.getMfgID();
        String MFID = Integer.toString(mfID);
        int DistID = newTemp.getDistID();
        String distID = Integer.toString(DistID);
        int last_sale = newTemp.getLastSale();
        String lastSale = Integer.toString(last_sale);
        int last_sale_all = newTemp.getLastSaleAllow();
        String lastSaleAll = Integer.toString(last_sale_all);
        int prize_amt1 = newTemp.getPrizeAmt1();
        String prizeAmt1 = Integer.toString(prize_amt1);
        int prize_amt2 = newTemp.getPrizeAmt2();
        String prizeAmt2 = Integer.toString(prize_amt2);
        int prize_amt3 = newTemp.getPrizeAmt3();
        String prizeAmt3 = Integer.toString(prize_amt3);
        int prize_amt4 = newTemp.getPrizeAmt4();
        String prizeAmt4 = Integer.toString(prize_amt4);
        int prize_amt5 = newTemp.getPrizeAmt5();
        String prizeAmt5 = Integer.toString(prize_amt5);
        int prize_amt6 = newTemp.getPrizeAmt6();
        String prizeAmt6 = Integer.toString(prize_amt6);
        int prize_amt7 = newTemp.getPrizeAmt7();
        String prizeAmt7 = Integer.toString(prize_amt7);
        int prize_amt8 = newTemp.getPrizeAmt8();
        String prizeAmt8 = Integer.toString(prize_amt8);
        int prize_amt9 = newTemp.getPrizeAmt9();
        String prizeAmt9 = Integer.toString(prize_amt9);
        int prize_amt10 = newTemp.getPrizeAmt10();
        String prizeAmt10 = Integer.toString(prize_amt10);
        int prize_amt11 = newTemp.getPrizeAmt11();
        String prizeAmt11 = Integer.toString(prize_amt11);
        int prize_amt12 = newTemp.getPrizeAmt12();
        String prizeAmt12 = Integer.toString(prize_amt12);
        int prize_amt13 = newTemp.getPrizeAmt13();
        String prizeAmt13 = Integer.toString(prize_amt13);
        int prize_amt14 = newTemp.getPrizeAmt14();
        String prizeAmt14 = Integer.toString(prize_amt14);
        int prize_amt15 = newTemp.getPrizeAmt15();
        String prizeAmt15 = Integer.toString(prize_amt15);
        
        
        int prize_all1 = newTemp.getPrizeAll1();
        String prizeAll1 = Integer.toString(prize_all1);
        int prize_all2 = newTemp.getPrizeAll2();
        String prizeAll2 = Integer.toString(prize_all2);
        int prize_all3 = newTemp.getPrizeAll3();
        String prizeAll3 = Integer.toString(prize_all3);
        int prize_all4 = newTemp.getPrizeAll4();
        String prizeAll4 = Integer.toString(prize_all4);
        int prize_all5 = newTemp.getPrizeAll5();
        String prizeAll5 = Integer.toString(prize_all5);
        int prize_all6 = newTemp.getPrizeAll6();
        String prizeAll6 = Integer.toString(prize_all6);
        int prize_all7 = newTemp.getPrizeAll7();
        String prizeAll7 = Integer.toString(prize_all7);
        int prize_all8 = newTemp.getPrizeAll8();
        String prizeAll8 = Integer.toString(prize_all8);
        int prize_all9 = newTemp.getPrizeAll9();
        String prizeAll9 = Integer.toString(prize_all9);
        int prize_all10 = newTemp.getPrizeAll10();
        String prizeAll10 = Integer.toString(prize_all10);
        int prize_all11 = newTemp.getPrizeAll11();
        String prizeAll11 = Integer.toString(prize_all11);
        int prize_all12 = newTemp.getPrizeAll12();
        String prizeAll12 = Integer.toString(prize_all12);
        int prize_all13 = newTemp.getPrizeAll13();
        String prizeAll13 = Integer.toString(prize_all13);
        int prize_all14 = newTemp.getPrizeAll14();
        String prizeAll14 = Integer.toString(prize_all14);
        int prize_all15 = newTemp.getPrizeAll15();
        String prizeAll15 = Integer.toString(prize_all15);
        
        
        

        
        
        //System.out.println("Game Name: " + newTemp.getGameName());
        
        textGame.setText(gameName);
        textPartNum.setText(partNum);
        textGameCost.setText(gameCost);
        textCostTicket.setText(ticketCost);
        textNumTickets.setText(numTickets);
        textIdealGross.setText(idealGross);
        textIdealPrizes.setText(idealPrizes);
        textIdealNet.setText(idealNet);
        textManID.setText(MFID);
        textDistID.setText(distID);
        textLastSale.setText(lastSale);
        textAllLast.setText(lastSaleAll);
        textAmt1.setText(prizeAmt1);
        textAmt2.setText(prizeAmt2);
        textAmt3.setText(prizeAmt3);
        textAmt4.setText(prizeAmt4);
        textAmt5.setText(prizeAmt5);
        textAmt6.setText(prizeAmt6);
        textAmt7.setText(prizeAmt7);
        textAmt8.setText(prizeAmt8);
        textAmt9.setText(prizeAmt9);
        textAmt10.setText(prizeAmt10);
        textAmt11.setText(prizeAmt11);
        textAmt12.setText(prizeAmt12);
        textAmt13.setText(prizeAmt13);
        textAmt14.setText(prizeAmt14);
        textAmt15.setText(prizeAmt15);
        textAll1.setText(prizeAll1);
        textAll2.setText(prizeAll2);
        textAll3.setText(prizeAll3);
        textAll4.setText(prizeAll4);
        textAll5.setText(prizeAll5);
        textAll6.setText(prizeAll6);
        textAll7.setText(prizeAll7);
        textAll8.setText(prizeAll8);
        textAll9.setText(prizeAll9);
        textAll10.setText(prizeAll10);
        textAll11.setText(prizeAll11);
        textAll12.setText(prizeAll12);
        textAll13.setText(prizeAll13);
        textAll14.setText(prizeAll14);
        textAll15.setText(prizeAll15);
        
        
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        textGame = new javax.swing.JTextField();
        textSerial = new javax.swing.JTextField();
        textPartNum = new javax.swing.JTextField();
        textGameCost = new javax.swing.JTextField();
        textManID = new javax.swing.JTextField();
        textInvoiceNum = new javax.swing.JTextField();
        textInvoiceDate = new javax.swing.JTextField();
        textDistID = new javax.swing.JTextField();
        textGameType = new javax.swing.JTextField();
        textUnsoldTickets = new javax.swing.JTextField();
        textUnsoldValue = new javax.swing.JTextField();
        textActualGross = new javax.swing.JTextField();
        textActualPrizes = new javax.swing.JTextField();
        textIdealGross = new javax.swing.JTextField();
        textIdealPrizes = new javax.swing.JTextField();
        textIdealNet = new javax.swing.JTextField();
        textActualNet = new javax.swing.JTextField();
        textNumTickets = new javax.swing.JTextField();
        textCostTicket = new javax.swing.JTextField();
        textDatePlaced = new javax.swing.JTextField();
        textDateRem = new javax.swing.JTextField();
        textBin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        textAll9 = new javax.swing.JTextField();
        textAll10 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        textAll7 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        textAll8 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        textAll5 = new javax.swing.JTextField();
        textAll6 = new javax.swing.JTextField();
        textAll3 = new javax.swing.JTextField();
        textAll4 = new javax.swing.JTextField();
        textAll11 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        textAmt1 = new javax.swing.JTextField();
        textAmt2 = new javax.swing.JTextField();
        textRem3 = new javax.swing.JTextField();
        textRem4 = new javax.swing.JTextField();
        textRem1 = new javax.swing.JTextField();
        textRem2 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        textRem8 = new javax.swing.JTextField();
        textRem9 = new javax.swing.JTextField();
        textRem6 = new javax.swing.JTextField();
        textRem7 = new javax.swing.JTextField();
        textRem10 = new javax.swing.JTextField();
        textRem11 = new javax.swing.JTextField();
        textAll2 = new javax.swing.JTextField();
        textAll1 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        textRem5 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        textAmt11 = new javax.swing.JTextField();
        textAmt10 = new javax.swing.JTextField();
        textAmt9 = new javax.swing.JTextField();
        textAmt8 = new javax.swing.JTextField();
        textAmt7 = new javax.swing.JTextField();
        textAmt6 = new javax.swing.JTextField();
        textAmt5 = new javax.swing.JTextField();
        textAmt3 = new javax.swing.JTextField();
        textAmt4 = new javax.swing.JTextField();
        textAll12 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        textRem15 = new javax.swing.JTextField();
        textRem14 = new javax.swing.JTextField();
        textAll14 = new javax.swing.JTextField();
        textAll15 = new javax.swing.JTextField();
        textRem13 = new javax.swing.JTextField();
        textAll13 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        textLastSale = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        textAmt14 = new javax.swing.JTextField();
        textRem12 = new javax.swing.JTextField();
        textAmt15 = new javax.swing.JTextField();
        textAmt13 = new javax.swing.JTextField();
        textAmt12 = new javax.swing.JTextField();
        textAllLast = new javax.swing.JTextField();
        textLastRem = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        checkInplay = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");
        jMenu1.setToolTipText("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textGame.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        textSerial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        textIdealGross.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdealGrossActionPerformed(evt);
            }
        });

        textIdealNet.setEditable(false);
        textIdealNet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdealNetActionPerformed(evt);
            }
        });

        textBin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        textBin.setEnabled(false);

        jLabel1.setText("Game:");

        jLabel2.setText("Part Number:");

        jLabel3.setText("Manuf. ID:");

        jLabel4.setText("Serial:");

        jLabel5.setText("Game cost:");

        jLabel6.setText("Invoice Number:");

        jLabel7.setText("Invoice Date:");

        jLabel8.setText("Dist. ID:");

        jLabel9.setText("Game Type:");

        jLabel10.setText("Date placed:");

        jLabel11.setText("Date removed:");

        jLabel12.setText("Unsold tickets:");

        jLabel13.setText("Unsold value:");

        jLabel14.setText("Actual gross:");

        jLabel15.setText("Actual Prizes:");

        jLabel16.setText("Actual net:");

        jLabel17.setText("Number of tickets:");

        jLabel18.setText("Cost per ticket:");

        jLabel19.setText("Ideal gross:");

        jLabel20.setText("Ideal prizes:");

        jLabel21.setText("Ideal net:");

        jLabel22.setText("Bin:");

        textID.setEnabled(false);

        jLabel23.setText("Game id:");

        btnFirst.setText("First");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setText("Last");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel ");
        btnCancel.setEnabled(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel24.setText("Ticket Editor");

        jButton1.setText("Move to in play");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel25.setText("Prize 11:");

        jLabel26.setText("Prize 10:");

        jLabel27.setText("Prize 9:");

        jLabel28.setText("Prize 1:");

        jLabel29.setText("Prize 2:");

        jLabel30.setText("Prize 3:");

        jLabel31.setText("Prize 4:");

        jLabel32.setText("Prize 5:");

        jLabel33.setText("Prize 6:");

        jLabel34.setText("Prize 7:");

        jLabel35.setText("Prize 8:");

        jLabel36.setText("Remaining:");

        jLabel37.setText("Allowed:");

        jLabel38.setText("Amount:");

        jLabel39.setText("Prize 13:");

        jLabel40.setText("Prize 14:");

        jLabel41.setText("Prize 12:");

        jLabel42.setText("Prize 15:");

        jLabel43.setText("Last Sale:");

        jLabel44.setText("Amount:");

        jLabel45.setText("Allowed:");

        jLabel46.setText("Remaining:");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Instock", "Inplay", "Closed" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton2.setText("Move to closed");

        jButton3.setText("Move to instock");

        checkInplay.setText("Inplay?");
        checkInplay.setEnabled(false);

        jButton4.setText("Switch");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jMenu2.setText("File");

        jMenu4.setText("Templates");

        jMenuItem1.setText("Crazy Joes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenu2.add(jMenu4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(33, 33, 33)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textDatePlaced, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textDateRem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textNumTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel18)
                                            .addGap(18, 18, 18)
                                            .addComponent(textCostTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(2, 2, 2)
                                                    .addComponent(jLabel21)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(textIdealNet, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(45, 45, 45)
                                                    .addComponent(checkInplay)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel15)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(textActualPrizes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel16)
                                                        .addGap(22, 22, 22)
                                                        .addComponent(textActualNet, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel14)
                                                    .addGap(12, 12, 12)
                                                    .addComponent(textActualGross, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel19)
                                                .addComponent(jLabel20))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(textIdealGross, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textIdealPrizes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel12)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(textUnsoldTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel13)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(textUnsoldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textPartNum, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textGameCost, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textManID, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textInvoiceNum, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textInvoiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textGameType, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textDistID, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textGame, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel22)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textBin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textAmt8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel25)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textAmt11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textAll11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(textRem11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel27)
                                        .addComponent(jLabel26))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(textAmt10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textAll10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(textRem10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(textAmt9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(14, 14, 14)
                                            .addComponent(textAll9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(textRem9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textAmt4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textAll4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textAmt3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textAll3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textAmt2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textAll2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textAmt1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textAll1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel38)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel37))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textAmt5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textAll5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textAmt6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textAll6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textAmt7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textAll7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textAll8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textRem7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textRem6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textRem5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textRem1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel36)
                                    .addComponent(textRem3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textRem4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textRem2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textRem8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textLastSale, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textAllLast, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textLastRem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textAmt15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textAll15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textRem15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textAmt14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textAll14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textRem14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textAmt13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textAll13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textRem13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textAmt12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textAll12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textRem12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel45)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel46)))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel22)
                                    .addComponent(textBin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8)
                                    .addComponent(textDistID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel23)
                                    .addComponent(textPartNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textGameCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(textManID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(textInvoiceNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(textInvoiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textGameType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(textDatePlaced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel11)
                                            .addComponent(textDateRem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel17)
                                            .addComponent(textNumTickets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel18)
                                            .addComponent(textCostTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(checkInplay)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel19)
                                                    .addComponent(textIdealGross, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(textIdealPrizes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel20)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel12)
                                                    .addComponent(textUnsoldTickets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel13)
                                                    .addComponent(textUnsoldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel14)
                                                .addComponent(textActualGross, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textIdealNet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel21))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(textActualPrizes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel15))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel16)
                                                    .addComponent(textActualNet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(169, 169, 169)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel44)
                                    .addComponent(jLabel45)
                                    .addComponent(jLabel46))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel41)
                                    .addComponent(textAmt12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textAll12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textRem12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel39)
                                    .addComponent(textAmt13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textAll13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textRem13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel40)
                                    .addComponent(textAmt14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textAll14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textRem14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel42)
                                    .addComponent(textAmt15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textAll15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textRem15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel43)
                                    .addComponent(textLastSale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textAllLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textLastRem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(jLabel37)
                            .addComponent(jLabel36))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(textAmt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAll1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textRem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(textAmt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAll2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textRem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(textAmt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAll3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textRem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(textAmt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAll4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textRem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(textAmt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAll5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textRem5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(textAmt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAll6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textRem6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(textAmt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAll7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textRem7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(textAmt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAll8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textRem8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(textAmt9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAll9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textRem9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(textAmt10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAll10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textRem10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(textAmt11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAll11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textRem11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(236, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
//       try{
//           rs.first();
//           //checkInplay.setSelected(true);
//           Fillforms();
//           
//           
//       }
//       catch (SQLException err) {
//        JOptionPane.showMessageDialog(TicketsEditor.this, err.getMessage());
//        } 
        row = 0;
        LoadDB(row);
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
//try {
//if ( rs.next( ) ) {
//Fillforms();
//}
//else {
//rs.previous( );
//JOptionPane.showMessageDialog(TicketsEditor.this, "End of File");
//}
//}
//catch (SQLException err) {
//JOptionPane.showMessageDialog(TicketsEditor.this, err.getMessage());
//}
        row++;
        LoadDB(row);

    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
//    try {
//    if ( rs.previous( ) ) {
//        
//
//    Fillforms();
//    }
//    else {
//        rs.previous( );
//        JOptionPane.showMessageDialog(TicketsEditor.this, "End of File");
//    }
//    }
//    catch (SQLException err) {
//    JOptionPane.showMessageDialog(TicketsEditor.this, err.getMessage());
//    }
        row--;
        LoadDB(row);
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
//try {
//    if ( rs.last( ) ) {
//        
//
//Fillforms();
//    }
//    else {
//        rs.previous( );
//    }
//    }
//catch (SQLException err) {
//catch (SQLException err) {
//JOptionPane.showMessageDialog(TicketsEditor.this, err.getMessage());
//}
            row = dbsize - 1;
            LoadDB(row);
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        update_tickets();
        update_templates();
    }//GEN-LAST:event_btnUpdateActionPerformed
    private void update_templates(){

        String game = textGame.getText();
        String part = textPartNum.getText();
        String mf = textManID.getText();
        String ds = textDistID.getText();
        String serial = textSerial.getText( );
        String invoice_num = textInvoiceNum.getText();
        String invoice_date = textInvoiceDate.getText();
        String ticket_cost = textCostTicket.getText();
        String num_tickets = textNumTickets.getText();
        String ideal_gross = textIdealGross.getText();
        String ideal_prizes = textIdealPrizes.getText();
        String ideal_net = textIdealNet.getText();
        String game_cost = textGameCost.getText();
        String last_sale = textLastSale.getText();
        String last_all = textAllLast.getText();
        String amt1 = textAmt1.getText();
        String amt2 = textAmt2.getText();
        String amt3 = textAmt3.getText();
        String amt4 = textAmt4.getText();
        String amt5 = textAmt5.getText();
        String amt6 = textAmt6.getText();
        String amt7 = textAmt7.getText();
        String amt8 = textAmt8.getText();
        String amt9 = textAmt9.getText();
        String amt10 = textAmt10.getText();
        String amt11 = textAmt11.getText();
        String amt12 = textAmt12.getText();
        String amt13 = textAmt13.getText();
        String amt14 = textAmt14.getText();
        String amt15 = textAmt15.getText();
        String all1 = textAll1.getText();
        String all2 = textAll2.getText();
        String all3 = textAll3.getText();
        String all4 = textAll4.getText();
        String all5 = textAll5.getText();
        String all6 = textAll6.getText();
        String all7 = textAll7.getText();
        String all8 = textAll8.getText();
        String all9 = textAll9.getText();
        String all10 = textAll10.getText();
        String all11 = textAll11.getText();
        String all12 = textAll12.getText();
        String all13 = textAll13.getText();
        String all14 = textAll14.getText();
        String all15 = textAll15.getText();
        try {
        Connection c = DbConnect.getConnection();
        pstmt = c.prepareStatement("SELECT * FROM game_templates where tickets_serial = ?",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        pstmt.setString(1,tickets_serial);
        rs = pstmt.executeQuery();
        rs.next();           
            rs.updateString("part_num", part);
            rs.updateString("game_name", game );
            rs.updateString("dists_id_dist_id", ds);
            rs.updateString("mfg_id_mfg_id", mf);
            rs.updateString("tickets_serial", serial );
            rs.updateString("invoice_num", invoice_num);
            rs.updateString("date_purchased",invoice_date);
            rs.updateString("ticket_cost", ticket_cost);
            rs.updateString("num_tickets", num_tickets);
            rs.updateString("idea_gross",ideal_gross);
            rs.updateString("idea_prizes",ideal_prizes);
            rs.updateString("idea_net",ideal_net);
            rs.updateString("game_cost",game_cost);
            rs.updateString("last_sale",last_sale);
            rs.updateString("last_sale_allow",last_all);
            rs.updateString("prize_amt1",amt1);
            rs.updateString("prize_amt2",amt2);
            rs.updateString("prize_amt3",amt3);
            rs.updateString("prize_amt4",amt4);
            rs.updateString("prize_amt5",amt5);
            rs.updateString("prize_amt6",amt6);
            rs.updateString("prize_amt7",amt7);
            rs.updateString("prize_amt8",amt8);
            rs.updateString("prize_amt9",amt9);
            rs.updateString("prize_amt10",amt10);
            rs.updateString("prize_amt11",amt11);
            rs.updateString("prize_amt12",amt12);
            rs.updateString("prize_amt13",amt13);
            rs.updateString("prize_amt14",amt14);
            rs.updateString("prize_amt15",amt15);
            rs.updateString("prize_all1",all1);
            rs.updateString("prize_all2",all2);
            rs.updateString("prize_all3",all3);
            rs.updateString("prize_all4",all4);
            rs.updateString("prize_all5",all5);
            rs.updateString("prize_all6",all6);
            rs.updateString("prize_all7",all7);
            rs.updateString("prize_all8",all8);
            rs.updateString("prize_all9",all9);
            rs.updateString("prize_all10",all10);
            rs.updateString("prize_all11",all11);
            rs.updateString("prize_all12",all12);
            rs.updateString("prize_all13",all13);
            rs.updateString("prize_all14",all14);
            rs.updateString("prize_all15",all15);
            rs.updateString("prize_all15",all15);
            rs.updateRow( );
            JOptionPane.showMessageDialog(TicketsEditor.this, "Updated");
            } catch (Exception err) { err.printStackTrace(); }
    }
    private void update_tickets(){
        String date_placed = textDatePlaced.getText();
        String date_rem = textDateRem.getText();
//        String unsold_value = textUnsoldValue.getText();
        String actual_gross = textActualGross.getText();
        String actual_prizes = textActualPrizes.getText();
        String acutal_net = textActualNet.getText();
        String bin = textBin.getText();
        String unsold_tickets = textUnsoldTickets.getText();
        //String serial = textSerial.getText();
        String rem1 = textRem1.getText();
        String rem2 = textRem2.getText();
        String rem3 = textRem3.getText();
        String rem4 = textRem4.getText();
        String rem5 = textRem5.getText();
        String rem6 = textRem6.getText();
        String rem7 = textRem7.getText();
        String rem8 = textRem8.getText();
        String rem9 = textRem9.getText();
        String rem10 = textRem10.getText();
        String rem11 = textRem11.getText();
        String rem12 = textRem12.getText();
        String rem13 = textRem13.getText();
        String rem14 = textRem14.getText();
        String rem15 = textRem15.getText();
    try {
        Connection c = DbConnect.getConnection();
        pstmt = c.prepareStatement("SELECT * FROM tickets where serial = ?",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        pstmt.setString(1,tickets_serial);
        rs = pstmt.executeQuery();
        rs.next();
        rs.updateString("date_placed",date_placed);
        rs.updateString("date_removed", date_rem);
        rs.updateString("actual_gross",actual_gross);
        rs.updateString("actual_prizes",actual_prizes);
        rs.updateString("bin",bin);
        rs.updateString("unsold_tickets",unsold_tickets);
        rs.updateString("actual_net",acutal_net);
        rs.updateString("prize_rem1",rem1);
        rs.updateString("prize_rem2",rem2);
        rs.updateString("prize_rem3",rem3);
        rs.updateString("prize_rem4",rem4);
        rs.updateString("prize_rem5",rem5);
        rs.updateString("prize_rem6",rem6);
        rs.updateString("prize_rem7",rem7);
        rs.updateString("prize_rem8",rem8);
        rs.updateString("prize_rem9",rem9);
        rs.updateString("prize_rem10",rem10);
        rs.updateString("prize_rem11",rem11);
        rs.updateString("prize_rem12",rem12);
        rs.updateString("prize_rem13",rem13);
        rs.updateString("prize_rem14",rem14);
        rs.updateString("prize_rem15",rem15);
        rs.updateRow( );
        JOptionPane.showMessageDialog(TicketsEditor.this, "Updated");
        } catch (Exception err) { err.printStackTrace(); }
    }
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        btnFirst.setEnabled( false );
        btnPrevious.setEnabled( false ) ;
        btnNext.setEnabled( false );
        btnLast.setEnabled( false );
        btnUpdate.setEnabled( false );
        btnDelete.setEnabled( false );
        btnNew.setEnabled( false );

        btnSave.setEnabled( true );
        btnCancel.setEnabled( true );
        textGame.setText("");
        textID.setText("");
        textSerial.setText("");
        textPartNum.setText("");
        textManID.setText("");
        textDistID.setText("");
        textGameType.setText("");
        textInvoiceNum.setText("");
        textInvoiceDate.setText("");
        textDatePlaced.setText("");
        textDateRem.setText("");
        textCostTicket.setText("");
        textNumTickets.setText("");
        textIdealGross.setText("");
        textIdealPrizes.setText("");
        textUnsoldValue.setText("");
        textActualGross.setText("");
        textActualPrizes.setText("");
        textActualNet.setText("");
        textBin.setText("");
        textUnsoldTickets.setText("");
        textIdealNet.setText("");
        textGameCost.setText("");
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        btnFirst.setEnabled( true );
        btnPrevious.setEnabled( true ) ;
        btnNext.setEnabled( true );
        btnLast.setEnabled( true );
        btnUpdate.setEnabled( true );
        btnDelete.setEnabled( true );
        btnNew.setEnabled( true );
        btnSave.setEnabled( false );
        btnCancel.setEnabled( false );
    }//GEN-LAST:event_btnCancelActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
/*
         INSERT INTO Persons_Table (person_id, person_name,person_email)
          SELECT person_id, customer_name, customer_email
          FROM customer_table
          WHERE "insert your where clause here";
    DELETE FROM customer_table
          WHERE "repeat your where clause here";
        */
    String sql = "INSERT INTO Inplay SELECT * FROM Instock WHERE Inplay = 1";
    String sqldel = "DELETE FROM Instock WHERE Inplay = 1";
            try{
                stmt.executeUpdate(sql);
                stmt.executeUpdate(sqldel);
            }catch (SQLException err) {
JOptionPane.showMessageDialog(TicketsEditor.this, err.getMessage());
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String game1 = textGame.getText();
        String serial1 = textSerial.getText();
        String mf_id1 = textManID.getText();
        String dist_id1 = textDistID.getText();
        String partnum = textPartNum.getText();
        //String gametype1 = textGameType.getText();
        //String invoicenum1 = textInvoiceNum.getText();
        //String datepur = textInvoiceDate.getText();
        //String dateplace = textDatePlaced.getText();
        //String daterem = textDateRem.getText();
        //String costtick = textCostTicket.getText();
        //String numticks = textNumTickets.getText();
        //int numbertick = Integer.parseInt(numticks);
        //int costtick1 = Integer.parseInt(costtick);
        //int idealgross1 = numbertick*costtick1;

        //String idealgross = Integer.toString(idealgross1);
        //textIdealGross.setText(idealgross);
        //textIdealGross.validate();
        //String idealprizes = textIdealPrizes.getText();
        //String unsoldvalue = textUnsoldValue.getText();
        //String actualgross = textActualGross.getText();
        //String actualprizes = textActualNet.getText();
        //String actualnet = textActualNet.getText();
        ////String bin = textBin.getText();
        //String unsoldtick = textUnsoldTickets.getText();
        //String idealnet = textIdealNet.getText();
        //String gamecst = textGameCost.getText();


        try{
            rs.moveToInsertRow();
            rs.updateString("game_name", game1);
            rs.updateString("inplay_serial", serial1);
            rs.updateString("mfg_id_mfg_id", mf_id1);
            rs.updateString("dists_id_dist_id", dist_id1);
        //    rs.updateString("Game_Type", gametype1);
            rs.updateString("part_num", partnum);
        //    rs.updateString("Invoice_num", invoicenum1);
        //    rs.updateString("Date_purch", datepur);
        //    rs.updateString("Date_placed", dateplace);
        //    rs.updateString("Date_removed", daterem);
        //    rs.updateString("Ticket_cost", costtick);
        //    rs.updateString("Num_tickets", numticks);
        //    rs.updateString("Ideal_gross", idealgross);
        //    rs.updateString("Ideal_prizes", idealprizes);
        //    rs.updateString("Ideal_net", idealnet);
        //    rs.updateString("Unsold_amt", unsoldvalue);
        //    rs.updateString("Actual_gross", actualgross);
        //    rs.updateString("Actual_prizes", actualprizes);
        //    rs.updateString("Actual_net", actualnet);
        //    rs.updateString("Unsold_tickets", unsoldtick);
        //    rs.updateString("Game_cost", gamecst);
            rs.insertRow();
           // stmt.close();
           // rs.close();

        //    stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        //    String sql = "SELECT * FROM Instock";
        //    rs = stmt.executeQuery(sql);
        //    rs.next();
        //    Fillforms();
            btnFirst.setEnabled( true );
            btnPrevious.setEnabled( true ) ;
            btnNext.setEnabled( true );
            btnLast.setEnabled( true );
            btnUpdate.setEnabled( true );
            btnDelete.setEnabled( true );
            btnNew.setEnabled( true );

            btnSave.setEnabled( false );
            btnCancel.setEnabled( false );
            JOptionPane.showMessageDialog(TicketsEditor.this, "Added");
        }
        catch (SQLException err){
            System.out.println(err.getMessage());

        } finally {
            try { if(rs != null) rs.close(); } catch (Exception ex2) { }
            try { if (stmt != null) stmt.close(); } catch (Exception ex2) { }  
            try { if (con != null) con.close(); } catch (Exception ex2) { }  
        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
  
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       String itemText = (String)jComboBox1.getSelectedItem( );
       jTextField1.setText( itemText );
       try{
            Connection c = DbConnect.getConnection();
        Statement stmt = c.createStatement();
        String sql = "SELECT * FROM " + itemText;
        rs = stmt.executeQuery(sql);
        rs.next();
        /*
        String url = "jdbc:mysql://74.91.120.129:3306/"; 
        String dbName = "pos";
        String driver = "com.mysql.jdbc.Driver"; 
        String userName = "Switcher"; 
        String password = "hawaii"; 
        try { 
            Class.forName(driver).newInstance(); 
            con = DriverManager.getConnection(url+dbName,userName,password); 
            //conn.close(); 
            stmt = con.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE );
            String sql = "SELECT * FROM instock ";
            rs = stmt.executeQuery(sql);
            rs.next(); 
            //  */
        } 
        catch (Exception e) { e.printStackTrace(); }
       Fillforms();
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void textIdealNetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdealNetActionPerformed
 String gross1 = textIdealGross.getText();
 String prizes1 = textIdealPrizes.getText();
 int gross = Integer.parseInt(gross1);
 int prizes = Integer.parseInt(prizes1);
 
 int idealnet = gross - prizes;
    String toString = Integer.toString(idealnet);
 textIdealNet.setText(toString);
 
 
    }//GEN-LAST:event_textIdealNetActionPerformed

    private void textIdealGrossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdealGrossActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIdealGrossActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicketsEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketsEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketsEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketsEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketsEditor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox checkInplay;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField textActualGross;
    private javax.swing.JTextField textActualNet;
    private javax.swing.JTextField textActualPrizes;
    private javax.swing.JTextField textAll1;
    private javax.swing.JTextField textAll10;
    private javax.swing.JTextField textAll11;
    private javax.swing.JTextField textAll12;
    private javax.swing.JTextField textAll13;
    private javax.swing.JTextField textAll14;
    private javax.swing.JTextField textAll15;
    private javax.swing.JTextField textAll2;
    private javax.swing.JTextField textAll3;
    private javax.swing.JTextField textAll4;
    private javax.swing.JTextField textAll5;
    private javax.swing.JTextField textAll6;
    private javax.swing.JTextField textAll7;
    private javax.swing.JTextField textAll8;
    private javax.swing.JTextField textAll9;
    private javax.swing.JTextField textAllLast;
    private javax.swing.JTextField textAmt1;
    private javax.swing.JTextField textAmt10;
    private javax.swing.JTextField textAmt11;
    private javax.swing.JTextField textAmt12;
    private javax.swing.JTextField textAmt13;
    private javax.swing.JTextField textAmt14;
    private javax.swing.JTextField textAmt15;
    private javax.swing.JTextField textAmt2;
    private javax.swing.JTextField textAmt3;
    private javax.swing.JTextField textAmt4;
    private javax.swing.JTextField textAmt5;
    private javax.swing.JTextField textAmt6;
    private javax.swing.JTextField textAmt7;
    private javax.swing.JTextField textAmt8;
    private javax.swing.JTextField textAmt9;
    private javax.swing.JTextField textBin;
    private javax.swing.JTextField textCostTicket;
    private javax.swing.JTextField textDatePlaced;
    private javax.swing.JTextField textDateRem;
    private javax.swing.JTextField textDistID;
    private javax.swing.JTextField textGame;
    private javax.swing.JTextField textGameCost;
    private javax.swing.JTextField textGameType;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textIdealGross;
    private javax.swing.JTextField textIdealNet;
    private javax.swing.JTextField textIdealPrizes;
    private javax.swing.JTextField textInvoiceDate;
    private javax.swing.JTextField textInvoiceNum;
    private javax.swing.JTextField textLastRem;
    private javax.swing.JTextField textLastSale;
    private javax.swing.JTextField textManID;
    private javax.swing.JTextField textNumTickets;
    private javax.swing.JTextField textPartNum;
    private javax.swing.JTextField textRem1;
    private javax.swing.JTextField textRem10;
    private javax.swing.JTextField textRem11;
    private javax.swing.JTextField textRem12;
    private javax.swing.JTextField textRem13;
    private javax.swing.JTextField textRem14;
    private javax.swing.JTextField textRem15;
    private javax.swing.JTextField textRem2;
    private javax.swing.JTextField textRem3;
    private javax.swing.JTextField textRem4;
    private javax.swing.JTextField textRem5;
    private javax.swing.JTextField textRem6;
    private javax.swing.JTextField textRem7;
    private javax.swing.JTextField textRem8;
    private javax.swing.JTextField textRem9;
    private javax.swing.JTextField textSerial;
    private javax.swing.JTextField textUnsoldTickets;
    private javax.swing.JTextField textUnsoldValue;
    // End of variables declaration//GEN-END:variables
}
