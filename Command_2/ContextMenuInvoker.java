package Command_2;

public class ContextMenuInvoker {
	private Command command;
    public void setCommand(Command command) { 
    	this.command = command; 
    }
    public void onRightClick(String option) {
        if ("Copy".equalsIgnoreCase(option)) 
        	command.execute();
    }

}
