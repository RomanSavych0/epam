package controller.command.implementation.passengers;

import controller.command.interfaces.Command;
import controller.dao.PassengerDao;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

public class GetAllPassengers implements Command {

    PassengerDao dao;


    public String execute(HttpServletRequest req) throws SQLException {
        dao = new PassengerDao();
        req.setAttribute("List", dao.getAllPassengersFromBD());

        return "passengers.jsp";

    }

}
