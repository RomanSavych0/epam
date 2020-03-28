package servlets;

import controller.command.implementation.passengers.AddPassengerIntoBD;
import controller.command.implementation.passengers.GetAllPassengers;
import controller.dao.PassengerDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


@WebServlet(name = "MainServlet")
public class MainServlet extends HttpServlet {
    private  PassengerDao dao;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

         System.out.println(request.getParameter("command"));
          new AddPassengerIntoBD().execute(request);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            new GetAllPassengers().execute(request);
            request.getRequestDispatcher("/passengers.jsp").forward(request, response);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
