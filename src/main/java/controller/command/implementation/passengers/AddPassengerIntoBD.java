//package controller.command.implementation.passengers;
//
//import controller.command.interfaces.Command;
//import controller.dao.PassengerDaoImpl;
//import controller.service.PassengerServiceImpl;
//import model.Passenger;
//
//import javax.servlet.http.HttpServletRequest;
//import java.sql.SQLException;
//
//public class AddPassengerIntoBD implements Command {
//    private PassengerDaoImpl dao;
//
//    public String execute(HttpServletRequest request){
//        String name = request.getParameter("firstName");
//        String surname = request.getParameter("surname");
//        String privilege = request.getParameter("privilege");
//        boolean pr = false;
//        System.out.println(name + " " + surname + " " + privilege);
//        if (privilege != null)
//            pr = true;
//
//
//
//        Passenger passenger = new PassengerServiceImpl().createPassenger(name, surname, pr);
//        try {
//            dao = new PassengerDaoImpl();
//            dao.writeIntoBD(passenger);
//        }catch ( SQLException | InstantiationException | IllegalAccessException e)
//        {
//            e.printStackTrace();
//        }
//        return null;
//    }
//}
