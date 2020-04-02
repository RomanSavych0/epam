package controller.command.implementation.passengers;

import controller.command.interfaces.Command;
import model.enums.CommandConstant;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class CommandContainer {
    Map<CommandConstant, Command> container;

    public CommandContainer() {
        container = new HashMap<>();
        container.put(CommandConstant.addPassengerIntoBD, new AddPassengerIntoBD());
        container.put(CommandConstant.DeletePassenger, new DeletePassenger());
        container.put(CommandConstant.FindPassenger, new FindPassenger());
        container.put(CommandConstant.GetAllPassengers, new GetAllPassengers());
    }

    public void  executeCommand(CommandConstant command , HttpServletRequest request) throws SQLException {
        container.get(command).execute(request);


    }

}
