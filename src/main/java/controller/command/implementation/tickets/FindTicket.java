package controller.command.implementation.tickets;

import controller.command.interfaces.Command;
import controller.service.TicketService;
import model.Ticket;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

public class FindTicket implements Command {

    private TicketService ticketService;

    @Override
    public String execute(HttpServletRequest req) throws SQLException {

        ticketService = new TicketService();
        String firstCity = req.getParameter("firstCity");


        String secondCity = req.getParameter("secondCity");

        for (Ticket t : ticketService.findByStringParams( firstCity, secondCity )
        ) {
            System.out.println(t);
        }
        req.setAttribute("List", ticketService.findByStringParams(firstCity, secondCity));

        return "index.jsp";
    }
}
