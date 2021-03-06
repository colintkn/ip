package percy.command;

import java.util.ArrayList;
import java.util.List;

import percy.storage.Storage;
import percy.task.TaskList;
import percy.ui.Ui;

public class ByeCommand extends Command {
    public static final String COMMAND = "bye";
    public static final ArrayList<String> USAGE_GUIDE = new ArrayList<String>(List.of(
            "bye: Closes the chat bot.",
            "Example: bye"));

    /**
     * Constructs a ByeCommand with isExit as true.
     */
    public ByeCommand() {
        super(true);
    }

    /**
     * Prints the bye message via the UI method, UI.bye().
     *
     * @param taskList The TaskList used to store the Tasks for this instance of Duke (not used in this method).
     */
    public String execute(TaskList taskList, Storage storage) {
        return Ui.makeByeMsg();
    }
}
