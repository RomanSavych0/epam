package controller.service;

import controller.dao.PassengerDaoImpl;
import controller.dao.TicketDaoImpl;
import controller.dao.connection.MyConnection;
import model.Passenger;
import model.Ticket;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class TicketService {
    private final MyConnection connection = new MyConnection();

    public TicketService() throws SQLException {

    }
 public void InsertTicket(int id ,String from, String to, int price, String date, String time, int amount)
 {
     TicketDaoImpl ticketDao = new TicketDaoImpl(connection);

     Ticket ticket = new Ticket(id , from , to , price , date , time , amount);
     ticketDao.save(ticket);
 }
public Optional<Ticket>findById(Integer id)
{
    TicketDaoImpl ticketDao = new TicketDaoImpl(connection);
    return ticketDao.findById(id);
}
public List<Ticket>findByStringParams(String firstCity , String secondCity)
{
    TicketDaoImpl ticketDao = new TicketDaoImpl(connection);
    return  ticketDao.findByStringParam(firstCity , secondCity);

}

public List<Ticket> getAllTickets()
{
    TicketDaoImpl ticketDao = new TicketDaoImpl(connection);

    return ticketDao.findAll();
}



    public static void main(String[] args) throws SQLException {

    }
}


