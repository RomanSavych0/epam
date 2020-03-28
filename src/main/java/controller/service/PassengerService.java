package controller.service;

import model.Passenger;

public class PassengerService {

    public Passenger createPassenger(String name, String surname, boolean privilege) {
        Passenger passenger = new Passenger(name, surname, privilege);


        return passenger;
    }

    public Passenger createPassenger(int id, String name, String surname, boolean privilege) {
        Passenger passenger = new Passenger(id, name, surname, privilege);


        return passenger;
    }


}
