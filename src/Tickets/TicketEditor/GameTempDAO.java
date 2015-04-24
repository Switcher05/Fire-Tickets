/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tickets.TicketEditor;

import java.util.List;

/**
 *
 * @author Switcher
 */
public interface GameTempDAO {
    // Actions ------------------------------------------------------------------------------------

    /**
     * Returns a list of all users from the database ordered by user ID. The list is never null and
     * is empty when the database does not contain any user.
     * @return A list of all users from the database ordered by user ID.
     * @throws DAOException If something fails at database level.
     */
    public List<GameTemp> list() throws DAOException;

}
