//
//package servlets;
//
//import controller.command.implementation.passengers.CommandContainer;
//import controller.command.implementation.passengers.GetAllPassengers;
//import model.enums.CommandConstant;
//
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.sql.SQLException;
//
//
//@WebServlet(name = "MainServlet")
//public class MainServlet extends HttpServlet {
//    private CommandContainer container;
//
//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        super.init(config);
//        try {
//            container = new CommandContainer();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        switch (request.getParameter("command")) {
//            case ("addPassenger"):
//                try {
//                    container.executeCommand(CommandConstant.addPassengerIntoBD, request);
//                } catch (SQLException | IllegalAccessException | InstantiationException e) {
//                    e.printStackTrace();
//                }
//                break;
//
//        }
//
//
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        try {
//            String page = new GetAllPassengers().execute(request);
//            request.getRequestDispatcher(page).forward(request, response);
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
