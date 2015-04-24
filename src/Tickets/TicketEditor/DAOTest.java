/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tickets.TicketEditor;

import java.text.SimpleDateFormat;
import java.util.List;

import Tickets.TicketEditor.DAOFactory;
import Tickets.TicketEditor.TicketsDAO;
import Tickets.TicketEditor.Tickets;

/**
 * Test harness for the com.example.dao package. This require the following preconditions:
 * <ol>
 * <li>A MySQL server running at localhost:3306 with a database named 'javabase'.
 * <li>A 'user' table in the 'javabase' database which is created as follows:
 * <pre>
 * CREATE TABLE javabase.user (
 *     id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
 *     email VARCHAR(60) NOT NULL,
 *     password VARCHAR(32) NOT NULL,
 *     firstname VARCHAR(40) NULL,
 *     lastname VARCHAR(40) NULL,
 *     birthdate DATE NULL,
 *
 *     PRIMARY KEY (id),
 *     UNIQUE (email)
 * )
 * </pre>
 * <li>A MySQL user with the name 'java' and password 'd$7hF_r!9Y' which has sufficient rights on
 * the javabase.user table.
 * <li>A MySQL JDBC Driver JAR file in the classpath.
 * <li>A properties file 'dao.properties' in the classpath with the following entries:
 * <pre>
 * javabase.jdbc.driver = com.mysql.jdbc.Driver
 * javabase.jdbc.url = jdbc:mysql://localhost:3306/javabase
 * javabase.jdbc.username = java
 * javabase.jdbc.password = d$7hF_r!9Y
 * </pre>
 * </ol>
 *
 * @author BalusC
 * @link http://balusc.blogspot.com/2008/07/dao-tutorial-data-layer.html
 */
public class DAOTest {

    public static void main(String[] args) throws Exception {
        // Obtain DAOFactory.
        DAOFactory javabase = DAOFactory.getInstance("javabase.jdbc");
        System.out.println("DAOFactory successfully obtained: " + javabase);

        // Obtain UserDAO.
        TicketsDAO ticketsDAO = javabase.getTicketsDAO();
        System.out.println("TicketsDAO successfully obtained: " + ticketsDAO);
        //Obtain GameTempDAO
        GameTempDAO gameTempDAO = javabase.getGameTempDAO();
        System.out.println("Game Temp DAO sucessfully obtainted: " + gameTempDAO);
//        //create ticket
//        Tickets tickets = new Tickets();
//        tickets.setGame_templates_part_num("PG01106");
//        tickets.setDistID(3);
//        tickets.setMfgID(7);
//        tickets.setSerial("test2");
//        tickets.setBin(3);
//        ticketsDAO.create(tickets);
//        System.out.println("ticket successfully created: " + tickets);
        
//        // Create user.
//        Tickets tickets = new Tickets();
//        tickets.setUnsoldAmt(5000);
//        tickets.setUnsoldTickets(5001);
//        ticketsDAO.create(tickets);
//        System.out.println("tickets successfully created: " + tickets);

//        // Create another user.
//        User anotherUser = new User();
//        anotherUser.setEmail("bar@foo.com");
//        anotherUser.setPassword("anotherPassword");
//        anotherUser.setFirstname("Bar");
//        anotherUser.setLastname("Foo");
//        anotherUser.setBirthdate(new SimpleDateFormat("yyyy-MM-dd").parse("1978-03-26"));
//        userDAO.create(anotherUser);
//        System.out.println("Another user successfully created: " + anotherUser);

//        // Update user.
//        user.setFirstname("Foo");
//        user.setLastname("Bar");
//        userDAO.update(user);
//        System.out.println("User successfully updated: " + user);
//
//        // Update user.
//        user.setFirstname("Foo");
//        user.setLastname("Bar");
//        userDAO.update(user);
//        System.out.println("User successfully updated: " + user);

        // List all users.
        List<Tickets> tickets2 = ticketsDAO.list();
        System.out.println("List of tickets successfully queried: " + tickets2);
        System.out.println("Thus, amount of users in database is: " + tickets2.size());
        List<GameTemp> gameTemp = gameTempDAO.list();
        System.out.println("list of game templates: " + gameTemp);

       // GameTemp gameTemp2 = new GameTemp();
        //System.out.println("Game Cost: " + gameTemp2.getGameCost());
//        // Delete user.
//        userDAO.delete(user);
//        System.out.println("User successfully deleted: " + user);
//
//        // Check if email exists.
//        boolean exist = userDAO.existEmail("foo@bar.com");
//        System.out.println("This email should not exist anymore, so this should print false: " + exist);
//
//        // Change password.
//        anotherUser.setPassword("newAnotherPassword");
//        userDAO.changePassword(anotherUser);
//        System.out.println("Another user's password successfully changed: " + anotherUser);
//
//        // Get another user by email and password.
//        User foundAnotherUser = userDAO.find("bar@foo.com", "newAnotherPassword");
//        System.out.println("Another user successfully queried with new password: " + foundAnotherUser);
//
//        // Delete another user.
//        userDAO.delete(foundAnotherUser);
//        System.out.println("Another user successfully deleted: " + foundAnotherUser);
//
//        // List all users again.
//        users = userDAO.list();
//        System.out.println("List of users successfully queried: " + users);
//        System.out.println("Thus, amount of users in database is: " + users.size());
    }

}