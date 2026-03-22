package Command_2;

public class ItalicCommand implements Command {
	private TextDocument document;

    public ItalicCommand(TextDocument doc) {
        this.document = doc;
    }

    @Override
    public void execute() {
        document.actionItalic();
    }

}
