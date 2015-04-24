/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tickets.TicketEditor;
import static Tickets.TicketEditor.DAOUtil.*;
import Tickets.TicketEditor.Tickets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ryan
 */
public class TicketsDAOJBDC implements TicketsDAO {
    //constants
    private static final String SQL_FIND_BY_SERIAL = 
            "SELECT * FROM tickets where serial = ?";
    private static final String SQL_LIST_ORDER_BY_SERIAL =
            "SELECT * FROM tickets ORDER BY serial";
    private static final String SQL_INSERT_TICKET =
            "INSERT INTO `tickets`(`Serial`, `Date_placed`, `Date_removed`, `Unsold_amt`, `Actual_gross`, `Actual_prizes`, `Actual_net`, `Bin`, `Inplay`, `Unsold_tickets`, `Last_sale_rem`, `Prize_rem1`, `Prize_rem2`, `Prize_rem3`, `Prize_rem4`, `Prize_rem5`, `Prize_rem6`, `Prize_rem7`, `Prize_rem8`, `Prize_rem9`, `Prize_rem10`, `Prize_rem11`, `Prize_rem12`, `Prize_rem13`, `Prize_rem14`, `Prize_rem15`, `game_templates_part_num`, `game_templates_dists_id_dist_id`, `game_templates_mfg_id_mfg_id`) "
            + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    
    private static final String SQL_UPDATE = 
            "UPDATE tickets set serial = ?, unsold_amt = ?, unsold_tickets = ?";
    private static final String SQL_DELETE_TICKET =
            "DELETE FROM tickets where serial = ?";
    
    //vars
    private DAOFactory daoFactory;
    
    //constructors
    TicketsDAOJBDC(DAOFactory daoFactory){
        this.daoFactory = daoFactory;
    }
    //actions
    @Override
    public Tickets find(String serial) throws DAOException {
        return find (SQL_FIND_BY_SERIAL);
    }
    
    @Override
    public List<Tickets> list() throws DAOException {
        List<Tickets> tickets = new ArrayList<>();
        try(
                Connection connection = daoFactory.getConnection();
                PreparedStatement statement = connection.prepareStatement(SQL_LIST_ORDER_BY_SERIAL);
                ResultSet resultSet = statement.executeQuery();
                ){
            while (resultSet.next()){
                tickets.add(map(resultSet));
            }
        }catch (SQLException e){
            throw new DAOException(e);
        }
        return tickets;
    }
    
    @Override
    public void create(Tickets tickets) throws IllegalArgumentException, DAOException {
        if (tickets.getSerial() == null){
            throw new IllegalArgumentException("Ticket serial can not be null");
        }
        Object[] values = {
            tickets.getSerial(),
            tickets.getDatePlaced(),
            tickets.getDateRemoved(),
            tickets.getUnsoldAmt(),
            tickets.getActualGross(),
            tickets.getActualPrizes(),
            tickets.getActualNet(),
            tickets.getBin(),
            tickets.getInplay(),
            tickets.getUnsoldTickets(),
            tickets.getLastSaleRem(),
            tickets.getPrizeRem1(),
            tickets.getPrizeRem2(),
            tickets.getPrizeRem3(),
            tickets.getPrizeRem4(),
            tickets.getPrizeRem5(),
            tickets.getPrizeRem6(),
            tickets.getPrizeRem7(),
            tickets.getPrizeRem8(),
            tickets.getPrizeRem9(),
            tickets.getPrizeRem10(),
            tickets.getPrizeRem11(),
            tickets.getPrizeRem12(),
            tickets.getPrizeRem13(),
            tickets.getPrizeRem14(),
            tickets.getPrizeRem15(),
            tickets.getGame_templates_part_num(),
            tickets.getDistID(),
            tickets.getMfgID()
        };
        try (
            Connection connection = daoFactory.getConnection();
            PreparedStatement statement = prepareStatement(connection, SQL_INSERT_TICKET, true, values);
        ) {
            int affectedRows = statement.executeUpdate();
            if (affectedRows == 0) {
                throw new DAOException("Creating ticket failed, no rows affected.");
            }
            
//            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
//                if (generatedKeys.next()) {
//                    tickets.setSerial(generatedKeys.getString(0));
//                } else {
//                    throw new DAOException("Creating user failed, no generated key obtained.");
//                }
//            }
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }
    @Override
    public void update(Tickets tickets) throws DAOException {
        if (tickets.getSerial() == null) {
            throw new IllegalArgumentException("Ticket is not created yet, the ticket serial is null.");
        }

        Object[] values = {
            tickets.getUnsoldAmt(),
            tickets.getUnsoldTickets()
            
        };

        try (
            Connection connection = daoFactory.getConnection();
            PreparedStatement statement = prepareStatement(connection, SQL_UPDATE, false, values);
        ) {
            int affectedRows = statement.executeUpdate();
            if (affectedRows == 0) {
                throw new DAOException("Updating ticket failed, no rows affected.");
            }
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }

    @Override
    public void delete(Tickets tickets) throws DAOException {
        Object[] values = { 
            tickets.getSerial()
        };

        try (
            Connection connection = daoFactory.getConnection();
            PreparedStatement statement = prepareStatement(connection, SQL_DELETE_TICKET, false, values);
        ) {
            int affectedRows = statement.executeUpdate();
            if (affectedRows == 0) {
                throw new DAOException("Deleting ticket failed, no rows affected.");
            } else {
                tickets.setSerial(null);
            }
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }
    private static Tickets map(ResultSet resultSet) throws SQLException {
        Tickets tickets = new Tickets();
        tickets.setSerial(resultSet.getString("serial"));
        tickets.setDatePlaced(resultSet.getString("date_placed"));
        tickets.setDateRemoved(resultSet.getString("date_removed"));
        tickets.setUnsoldAmt(resultSet.getInt("unsold_amt"));
        tickets.setActualGross(resultSet.getInt("actual_gross"));
        tickets.setActualNet(resultSet.getInt("actual_prizes"));
        tickets.setActualNet(resultSet.getInt("actual_net"));
        tickets.setUnsoldTickets(resultSet.getInt("unsold_tickets"));
        tickets.setBin(resultSet.getInt("bin"));
        tickets.setInplay(resultSet.getInt("inplay"));
        tickets.setLastSaleRem(resultSet.getInt("last_sale_rem"));
        tickets.setPrizeRem1(resultSet.getInt("prize_rem1"));
        tickets.setPrizeRem2(resultSet.getInt("prize_rem2"));
        tickets.setPrizeRem3(resultSet.getInt("prize_rem3"));
        tickets.setPrizeRem4(resultSet.getInt("prize_rem4"));
        tickets.setPrizeRem5(resultSet.getInt("prize_rem5"));
        tickets.setPrizeRem6(resultSet.getInt("prize_rem6"));
        tickets.setPrizeRem7(resultSet.getInt("prize_rem7"));
        tickets.setPrizeRem8(resultSet.getInt("prize_rem8"));
        tickets.setPrizeRem9(resultSet.getInt("prize_rem9"));
        tickets.setPrizeRem10(resultSet.getInt("prize_rem10"));
        tickets.setPrizeRem11(resultSet.getInt("prize_rem11"));
        tickets.setPrizeRem12(resultSet.getInt("prize_rem12"));
        tickets.setPrizeRem13(resultSet.getInt("prize_rem13"));
        tickets.setPrizeRem14(resultSet.getInt("prize_rem14"));
        tickets.setPrizeRem15(resultSet.getInt("prize_rem15"));
        tickets.setDistID(resultSet.getInt("game_templates_dists_id_dist_id"));
        tickets.setMfgID(resultSet.getInt("game_templates_mfg_id_mfg_id"));
        tickets.setPartNum(resultSet.getString("game_templates_part_num"));
        return tickets;
    }
    
    
}
