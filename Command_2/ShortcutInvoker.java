package Command_2;

//invoker
public class ShortcutInvoker {
	private Command command;
    public void setCommand(Command command) { 
    	this.command = command; 
    }
    public void onKeyPress(String key) {
        if ("Ctrl+C".equalsIgnoreCase(key)) 
        	command.execute();
    }
}
