package Command_2;

public class BoldCommand implements Command {
	private TextDocument document;

    public BoldCommand(TextDocument doc) {
        this.document = doc;
    }

    @Override
    public void execute() {
        document.actionBold();
    }

}
