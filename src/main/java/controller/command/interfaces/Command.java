package controller.command.interfaces;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

public interface Command {
    String execute(HttpServletRequest req) throws SQLException;
}
