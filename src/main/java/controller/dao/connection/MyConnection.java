package controller.dao.connection;

import controller.exeptions.DataBaseRuntimeException;
import controller.service.TicketService;

import java.sql.*;

public class MyConnection {
    private final String url = "jdbc:h2:mem:default";
    private final String user = "";
    private final String password = "";

    public MyConnection() throws SQLException {
        try {
            Class.forName("org.h2.Driver");
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS PASSENGER(ID INT AUTO_INCREMENT ,  NAME VARCHAR(20), " +
                    "SURNAME VARCHAR(20),PRIVILEGE BOOLEAN)");
            preparedStatement.executeUpdate();
            PreparedStatement pr = connection.prepareStatement("CREATE TABLE IF NOT EXISTS TICKET(ID INT AUTO_INCREMENT ,CiTY_FROM VARCHAR(20) , CITY_TO VARCHAR(20) , PRICE INT , DATE VARCHAR(20), TIME VARCHAR(20) , AMOUNT INT)");
            pr.executeUpdate();

        } catch (ClassNotFoundException e) {
            throw new DataBaseRuntimeException(e);
        }

    }


    public Connection getConnection() {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new DataBaseRuntimeException(e);
        }

    }

    void PrepareDefaultTableToTest(Connection connection) throws SQLException {


//        preparedStatement = connection.prepareStatement("INSERT INTO PASSENGER(NAME , SURNAME , PRIVILEGE) values(? , ? , ?) ");
//        preparedStatement.setString(1 , "pleg");
//        preparedStatement.setString(2 , "dasdsad");
//        preparedStatement.setBoolean(3 , false);
//        preparedStatement.executeUpdate();
//preparedStatement = connection.prepareStatement("INSERT INTO PASSENGER(NAME , SURNAME , PRIVILEGE) values(? , ? , ?) ");
//        preparedStatement.setString(1 , "asdaa");
//        preparedStatement.setString(2 , "dasddsdssad");
//        preparedStatement.setBoolean(3 , false);
//        preparedStatement.executeUpdate();
//


    }


}

