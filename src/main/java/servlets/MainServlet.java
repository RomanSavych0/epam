
package servlets;

import controller.command.implementation.passengers.CommandContainer;
import controller.command.implementation.tickets.FindTicket;
import controller.service.TicketService;
import model.enums.CommandConstant;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


@WebServlet(name = "MainServlet")
public class MainServlet extends HttpServlet {
    private CommandContainer container;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        try {
            container = new CommandContainer();
            TicketService ticketService = new TicketService();
            ticketService.InsertTicket(1, "Львів", "Київ", 188, "12.05.2020", "12:00", 8);
            ticketService.InsertTicket(2, "Львів", "Харків", 133, "12.06.2020", "12:00", 8);
            ticketService.InsertTicket(3, "Львів", "Одеса", 144, "12.07.2020", "12:00", 8);
            ticketService.InsertTicket(4, "Львів", "Маріуполь", 122, "13.05.2020", "12:00", 8);
            ticketService.InsertTicket(5, "Київ", "Львів", 188, "12.05.2020", "12:00", 8);
            ticketService.InsertTicket(6, "Київ", "Харків", 188, "12.05.2020", "12:00", 8);
            ticketService.InsertTicket(7, "Київ", "Одеса", 188, "12.05.2020", "12:00", 8);
            ticketService.InsertTicket(8, "Київ", "Маріуполь", 188, "12.05.2020", "12:00", 8);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        switch (request.getParameter("command")) {
            case ("addPassenger"):
                try {
                    container.executeCommand(CommandConstant.addPassengerIntoBD, request);


                } catch (SQLException | IllegalAccessException | InstantiationException e) {
                    e.printStackTrace();
                }
                break;
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//

        switch (request.getParameter("command")) {
            case ("findTicket"):
                try {
                  String page = container.executeCommand(CommandConstant.FindTicket , request);
                    request.getRequestDispatcher(page).forward(request, response);
                } catch (SQLException | IllegalAccessException | InstantiationException e) {
                    e.printStackTrace();
                }
        break;
        }
    }


}






