/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tickets.TicketEditor;
import static Tickets.TicketEditor.DAOUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Switcher
 */
public class GameTempDAOJBDC implements GameTempDAO{
    //constants
    private static final String SQL_LIST_GT_ORDER_PN =
            "SELECT * FROM game_templates ORDER BY part_num";       
    //vars
    private DAOFactory daoFactory;
    //contructors
    GameTempDAOJBDC(DAOFactory daoFactory){
        this.daoFactory = daoFactory;
    }
    //actions
    @Override
    public List<GameTemp> list() throws DAOException{
        List<GameTemp> gameTemp = new ArrayList<>();
        try(
                Connection connection = daoFactory.getConnection();
                PreparedStatement statement = connection.prepareStatement(SQL_LIST_GT_ORDER_PN);
                ResultSet resultSet = statement.executeQuery();
                ){
            while (resultSet.next()){
                gameTemp.add(map(resultSet));
                
            }
        }catch (SQLException e){
            throw new DAOException(e);
        }
        return gameTemp;
        
    }
    private static GameTemp map(ResultSet resultSet) throws SQLException{
        GameTemp gameTemp = new GameTemp();
        gameTemp.setPartNum(resultSet.getString("part_num"));
        gameTemp.setDistID(resultSet.getInt("dists_id_dist_id"));
        gameTemp.setMfgID(resultSet.getInt("mfg_id_mfg_id"));
        gameTemp.setGameName(resultSet.getString("game_name"));
        gameTemp.setGameCost(resultSet.getInt("game_cost"));
        gameTemp.setTicketCost(resultSet.getInt("ticket_cost"));
        gameTemp.setNumTickets(resultSet.getInt("num_tickets"));
        gameTemp.setIdealGross(resultSet.getInt("idea_gross"));
        gameTemp.setIdealPrizes(resultSet.getInt("idea_prizes"));
        gameTemp.setIdealNet(resultSet.getInt("idea_net"));
        gameTemp.setLastSale(resultSet.getInt("last_sale"));
        gameTemp.setLastSale(resultSet.getInt("last_sale_allow"));
        gameTemp.setPrizeAmt1(resultSet.getInt("prize_amt1"));
        gameTemp.setPrizeAmt2(resultSet.getInt("prize_amt2"));
        gameTemp.setPrizeAmt3(resultSet.getInt("prize_amt3"));
        gameTemp.setPrizeAmt4(resultSet.getInt("prize_amt4"));
        gameTemp.setPrizeAmt5(resultSet.getInt("prize_amt5"));
        gameTemp.setPrizeAmt6(resultSet.getInt("prize_amt6"));
        gameTemp.setPrizeAmt7(resultSet.getInt("prize_amt7"));
        gameTemp.setPrizeAmt8(resultSet.getInt("prize_amt8"));
        gameTemp.setPrizeAmt9(resultSet.getInt("prize_amt9"));
        gameTemp.setPrizeAmt10(resultSet.getInt("prize_amt10"));
        gameTemp.setPrizeAmt11(resultSet.getInt("prize_amt11"));
        gameTemp.setPrizeAmt12(resultSet.getInt("prize_amt12"));
        gameTemp.setPrizeAmt13(resultSet.getInt("prize_amt13"));
        gameTemp.setPrizeAmt14(resultSet.getInt("prize_amt14"));
        gameTemp.setPrizeAmt15(resultSet.getInt("prize_amt15"));
        gameTemp.setPrizeAll1(resultSet.getInt("prize_all1"));
        gameTemp.setPrizeAll2(resultSet.getInt("prize_all2"));
        gameTemp.setPrizeAll3(resultSet.getInt("prize_all3"));
        gameTemp.setPrizeAll4(resultSet.getInt("prize_all4"));
        gameTemp.setPrizeAll5(resultSet.getInt("prize_all5"));
        gameTemp.setPrizeAll6(resultSet.getInt("prize_all6"));
        gameTemp.setPrizeAll7(resultSet.getInt("prize_all7"));
        gameTemp.setPrizeAll8(resultSet.getInt("prize_all8"));
        gameTemp.setPrizeAll9(resultSet.getInt("prize_all9"));
        gameTemp.setPrizeAll10(resultSet.getInt("prize_all10"));
        gameTemp.setPrizeAll11(resultSet.getInt("prize_all11"));
        gameTemp.setPrizeAll12(resultSet.getInt("prize_all12"));
        gameTemp.setPrizeAll13(resultSet.getInt("prize_all13"));
        gameTemp.setPrizeAll14(resultSet.getInt("prize_all14"));
        gameTemp.setPrizeAll15(resultSet.getInt("prize_all15"));
        
        
        return gameTemp;
    }
}
