package controller.dao;

import controller.service.PassengerService;
import model.Passenger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PassengerDao {
    private static final String url = "jdbc:h2:tcp://localhost/~/test";
    private static final String user = "sa";
    private static final String password = "";
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public PassengerDao() throws SQLException {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        con = DriverManager.getConnection(url, user, password);
    }

    public void writeIntoBD(Passenger passenger) throws SQLException, IllegalAccessException, InstantiationException {

        String query = "INSERT INTO PASSENGERS(NAME , SURNAME , PRIVILEGE) VALUES('" + (passenger.getName()) + "','" + passenger.getSurname() + "'," + passenger.isPrivilege() + ")";

        stmt = con.createStatement();

        stmt.executeUpdate(query);


    }

    public List getAllPassengersFromBD() throws SQLException {
        String query = "SELECT *FROM PASSENGERS";
        stmt = con.createStatement();
        List<Passenger> passengerList = new ArrayList();
        rs = stmt.executeQuery(query);
        while (rs.next()) {

            Passenger passenger = new PassengerService().createPassenger(rs.getInt("ID"), rs.getString("NAME"), rs.getString("SURNAME"), rs.getBoolean("PRIVILEGE"));

            passengerList.add(passenger);

        }
            return passengerList;

    }


}


