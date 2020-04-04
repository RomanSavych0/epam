package controller.dao.connection;

import controller.exeptions.DataBaseRuntimeException;

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
            preparedStatement = connection.prepareStatement("INSERT INTO PASSENGER(NAME , SURNAME , PRIVILEGE) values(? , ? , ?) ");
            preparedStatement.setString(1 , "roma");
            preparedStatement.setString(2 , "Sav");
            preparedStatement.setBoolean(3 , true);
            preparedStatement.executeUpdate();

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

