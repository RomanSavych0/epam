package controller.command.implementation.tickets;

import controller.command.interfaces.Command;
import controller.service.PassengerServiceImpl;
import controller.service.TicketService;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

public class GetAllTickets implements Command {
    private TicketService ticketService;

    @Override
    public String execute(HttpServletRequest req) throws SQLException {
        ticketService = new TicketService();
        req.setAttribute("List", ticketService.getAllTickets());

        return "index.jsp";

    }
}
