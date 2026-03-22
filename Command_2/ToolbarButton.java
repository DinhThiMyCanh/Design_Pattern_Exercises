package Command_2;

//Invoker
public class ToolbarButton {
	private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No command assigned to this button.");
        }
    }
}
