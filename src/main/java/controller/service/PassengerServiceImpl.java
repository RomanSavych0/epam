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

    public Passenger createPassenger(String name, String surname, boolean privilege) {
        Passenger passenger = new Passenger(name, surname, privilege);


        return passenger;
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
 // Passenger passenger = new PassengerServiceImpl().findById(1).orElse(new Passenger());
//
   //    System.out.println(passenger.getName() +" " + passenger.getSurname() + "" + passenger.isPrivilege() +passenger.getPassengerCode());

        List<Passenger>passengerList = new PassengerServiceImpl().getAllPassengers();


    }

}
