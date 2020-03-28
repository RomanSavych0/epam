package controller.command.implementation.passengers;

import controller.command.interfaces.Command;
import controller.dao.PassengerDao;
import controller.service.PassengerService;
import model.Passenger;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

public class AddPassengerIntoBD implements Command {
    private PassengerDao dao;

    public String execute(HttpServletRequest request) {
        String name = request.getParameter("firstName");
        String surname = request.getParameter("surname");
        String privilege = request.getParameter("privilege");
        boolean pr = false;
        System.out.println(name + " " + surname + " " + privilege);
        if (privilege != null)
            pr = true;


        Passenger passenger = new PassengerService().createPassenger(name, surname, pr);
        try {
            dao = new PassengerDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            dao.writeIntoBD(passenger);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


        return null;
    }
}
