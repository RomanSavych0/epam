package testMethods;

import controller.service.TicketService;

import java.sql.SQLException;

public class TestTickets {
    public static void main(String[] args) {
        TicketService ticketService = null;
        try {
            ticketService = new TicketService();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ticketService.InsertTicket(1, "Львів", "Київ", 188, "12.05.2020", "12:00", 8);
        ticketService.InsertTicket(2, "Львів", "Харків", 133, "12.06.2020", "12:00", 8);
        ticketService.InsertTicket(3, "Львів", "Одеса", 144, "12.07.2020", "12:00", 8);
        ticketService.InsertTicket(4, "Львів", "Маріуполь", 122, "13.05.2020", "12:00", 8);
        ticketService.InsertTicket(5, "Київ", "Львів", 188, "12.05.2020", "12:00", 8);
        ticketService.InsertTicket(6, "Київ", "Харків", 188, "12.05.2020", "12:00", 8);
        ticketService.InsertTicket(7, "Київ", "Одеса", 188, "12.05.2020", "12:00", 8);
        ticketService.InsertTicket(8, "Київ", "Маріуполь", 188, "12.05.2020", "12:00", 8);

        ticketService.getAllTickets();
       // System.out.println(ticketService.getAllTickets());
        System.out.println(ticketService.findByStringParams("Львів" ,"Маріуполь" ));
    }
}
