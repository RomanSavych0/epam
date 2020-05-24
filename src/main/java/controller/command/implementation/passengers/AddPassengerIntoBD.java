package controller.command.implementation.passengers;

import controller.command.interfaces.Command;
import controller.dao.PassengerDaoImpl;
import controller.service.PassengerServiceImpl;
import model.Passenger;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

public class AddPassengerIntoBD implements Command {
private PassengerServiceImpl passengerService;
    public String execute(HttpServletRequest request) throws SQLException {
        String name = request.getParameter("firstName");
        String surname = request.getParameter("surname");
        String  privilege = request.getParameter("privilege");
        boolean isPrevilege = true ;
        if(privilege == null)
        isPrevilege = false;


        passengerService = new PassengerServiceImpl();
         passengerService.insertPassenger(name,surname,isPrevilege);
        System.out.println(passengerService.getAllPassengers());

        return "passengers.jsp";
    }
}
