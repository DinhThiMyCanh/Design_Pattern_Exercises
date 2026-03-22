package Command_2;

public class PasteCommand implements Command {
	private TextDocument document;

    public PasteCommand(TextDocument doc) {
        this.document = doc;
    }

    @Override
    public void execute() {
        document.actionPaste();
    }
}
