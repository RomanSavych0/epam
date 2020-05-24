package controller.dao;

import controller.dao.connection.MyConnection;
import model.Passenger;
import model.Ticket;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class TicketDaoImpl extends AbstractCrudDaoImpl<Ticket> implements TicketDao {
    private static final String FIND_BY_ID_QUERY = "SELECT * FROM TICKET WHERE TICKET.ID = ?";
    private static final String SAVE_QUERY = "INSERT INTO TICKET(CITY_FROM , CITY_TO  , PRICE , DATE , TIME , AMOUNT) values(? , ? , ?, ? ,? ,?)";

    private static final String UPDATE_QUERY = "";
    private static final String FIND_ALL_QUERY = "SELECT *FROM TICKET";
    private static final String DELETE_QUERY = "";
    private static final String FIND_BY_STRING_PARAM = "SELECT* FROM TICKET WHERE TICKET.CiTY_FROM = ?  AND TICKET.CITY_TO =  ? ";


    public TicketDaoImpl(MyConnection connector) {
        super(connector, SAVE_QUERY, FIND_BY_ID_QUERY, FIND_ALL_QUERY, UPDATE_QUERY, DELETE_QUERY , FIND_BY_STRING_PARAM);

    }

    @Override
    protected void mapForInsertStatement(PreparedStatement preparedStatement, Ticket entity) throws SQLException {
        preparedStatement.setString(1, entity.getFrom());
        preparedStatement.setString(2, entity.getTo());
        preparedStatement.setInt(3, entity.getPrice());
        preparedStatement.setString(4, entity.getDate());
        preparedStatement.setString(5, entity.getTime());
        preparedStatement.setInt(6, entity.getAmout());

    }

    @Override
    protected Ticket mapResultSetToEntity(ResultSet resultSet) throws SQLException {

        Ticket ticket = new Ticket();
        ticket.setFrom(resultSet.getString("CITY_FROM"));
        ticket.setDate(resultSet.getString("DATE"));
        ticket.setPrice(resultSet.getInt("PRICE"));
        ticket.setTo(resultSet.getString("CITY_TO"));
        ticket.setAmout(resultSet.getInt("AMOUNT"));
        ticket.setId(resultSet.getInt("ID"));
        ticket.setTime(resultSet.getString("TIME"));
        return ticket;
    }
}
