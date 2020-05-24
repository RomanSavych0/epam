package controller.command.implementation.passengers;

import controller.command.interfaces.Command;
import controller.dao.PassengerDaoImpl;
import controller.service.PassengerServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

public class GetAllPassengers implements Command {

    private PassengerServiceImpl passengerService;

    public String execute(HttpServletRequest req) throws SQLException {

        passengerService = new PassengerServiceImpl();
        req.setAttribute("List", passengerService.getAllPassengers());

        return "passengers.jsp";

    }

}
