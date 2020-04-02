package controller.command.implementation.passengers;

import controller.command.interfaces.Command;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

public class DeletePassenger implements Command {
    @Override
    public String execute(HttpServletRequest req) throws SQLException {
        return null;
    }
}
