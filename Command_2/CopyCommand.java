package Command_2;

public class CopyCommand implements Command {
	private TextDocument document;
    public CopyCommand(TextDocument doc) { 
    	this.document = doc; 
    }
    public void execute() { 
    	document.actionCopy(); 
    }

}
