package controller.dao;

import controller.dao.connection.MyConnection;
import controller.service.PassengerServiceImpl;
import model.Passenger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PassengerDaoImpl extends AbstractCrudDaoImpl<Passenger> implements PassengerDao {
    private static final String FIND_BY_ID_QUERY = "SELECT * FROM PASSENGER WHERE PASSENGER.ID = ?";
    private static final String SAVE_QUERY = "";
    private static final String UPDATE_QUERY = "";
    private static final String FIND_ALL_QUERY = "SELECT *FROM PASSENGER";
    private static final String DELETE_QUERY = "";

    public PassengerDaoImpl(MyConnection connector) {
        super(connector, SAVE_QUERY, FIND_BY_ID_QUERY, FIND_ALL_QUERY, UPDATE_QUERY, DELETE_QUERY);


    }

    @Override
    protected Passenger mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        resultSet.next();
        return new Passenger(
                resultSet.getInt("ID"),
                resultSet.getString("NAME"),
                resultSet.getString("SURNAME"),
                resultSet.getBoolean("PRIVILEGE")
                );


    }


//    public PassengerDaoImpl() throws SQLException {
//        try {
//            Class.forName("org.h2.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        con = DriverManager.getConnection(url, user, password);
//    }

//    public void writeIntoBD(Passenger passenger) throws SQLException, IllegalAccessException, InstantiationException {
//
//        String query = "INSERT INTO PASSENGERS(NAME , SURNAME , PRIVILEGE) VALUES('" + (passenger.getName()) + "','" + passenger.getSurname() + "'," + passenger.isPrivilege() + ")";
//
//        stmt = con.createStatement();
//
//        stmt.executeUpdate(query);
//
//
//    }
//
//

}


