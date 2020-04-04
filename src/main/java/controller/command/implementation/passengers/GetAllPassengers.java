//package controller.command.implementation.passengers;
//
//import controller.command.interfaces.Command;
//import controller.dao.PassengerDaoImpl;
//
//import javax.servlet.http.HttpServletRequest;
//import java.sql.SQLException;
//
//public class GetAllPassengers implements Command {
//
//    PassengerDaoImpl dao;
//
//
//    public String execute(HttpServletRequest req) throws SQLException {
//        dao = new PassengerDaoImpl();
//        req.setAttribute("List", dao.getAllPassengersFromBD());
//
//        return "passengers.jsp";
//
//    }
//
//}
