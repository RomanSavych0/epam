package controller.service;

import controller.dao.PassengerDao;
import controller.dao.PassengerDaoImpl;
import controller.dao.connection.MyConnection;
import model.Passenger;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class PassengerServiceImpl {
    private final MyConnection connection = new MyConnection();

    public PassengerServiceImpl() throws SQLException {
    }

    public void insertPassenger(String name, String surname, Boolean privilege) {
        PassengerDaoImpl passengerDao = new PassengerDaoImpl(connection);
            Passenger passenger = new Passenger(name , surname , privilege);

        passengerDao.save(passenger);

    }



    public Optional<Passenger> findById(Integer id) {
        PassengerDaoImpl passengerDao = new PassengerDaoImpl(connection);

        return passengerDao.findById(id);




    }
    public List<Passenger> getAllPassengers()
    {
        PassengerDaoImpl passengerDao = new PassengerDaoImpl(connection);

        return passengerDao.findAll();

    }

    public static void main(String[] args) throws SQLException {
//
    PassengerServiceImpl passengerService = new PassengerServiceImpl();
    passengerService.insertPassenger("roma" ,  "sav" , true);

    }

}
