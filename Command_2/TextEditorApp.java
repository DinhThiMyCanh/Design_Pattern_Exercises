package Command_2;

//Client
public class TextEditorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextDocument document = new TextDocument();

        // Tạo các command
        Command bold = new BoldCommand(document);
        Command italic = new ItalicCommand(document);
        Command paste = new PasteCommand(document);
        Command copy = new CopyCommand(document);

        // Tạo các nút trên toolbar
        ToolbarButton boldButton = new ToolbarButton();
        ToolbarButton italicButton = new ToolbarButton();
        ToolbarButton pasteButton = new ToolbarButton();
        
        
     // Gán command cho từng nút
        boldButton.setCommand(bold);
        italicButton.setCommand(italic);
        pasteButton.setCommand(paste);

        // Người dùng nhấn nút
        boldButton.pressButton();   // Output: Text is now Bold.
        italicButton.pressButton(); // Output: Text is now Italic.
        pasteButton.pressButton();  // Output: Text has been Pasted.
        
     // Toolbar button
        ToolbarButton copyButton = new ToolbarButton();
        copyButton.setCommand(copy);

        // Shortcut Ctrl+C
        ShortcutInvoker shortcut = new ShortcutInvoker();
        shortcut.setCommand(copy);

        // Context menu (chuột phải)
        ContextMenuInvoker contextMenu = new ContextMenuInvoker();
        contextMenu.setCommand(copy);
        
     // Người dùng thao tác
        copyButton.pressButton();         // Output: Text has been Copied to clipboard.
        shortcut.onKeyPress("Ctrl+C");    // Output: Text has been Copied to clipboard.
        contextMenu.onRightClick("Copy"); // Output: Text has been Copied to clipboard.

	}

}
