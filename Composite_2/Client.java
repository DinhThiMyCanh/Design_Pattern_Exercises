package Composite_2;

public class Client {

	public static void main(String[] args) {
		
		var parentFolder = new FolderComposite("parentFolder", 0);
		var file1 = new FileLeaf("b", 20);
		var file2 = new FileLeaf("c", 20);
		parentFolder.add(file1);
		parentFolder.add(file2);
		parentFolder.showProperty();
		System.out.println(parentFolder.totalSize());
		
		var childFolder = new FolderComposite("childFolder", 0);
		var file3 = new FileLeaf("d", 20);
		var file4 = new FileLeaf("e", 10);
		childFolder.add(file3);
		childFolder.add(file4);
		parentFolder.add(childFolder);
		parentFolder.showProperty();
		System.out.println(parentFolder.totalSize());
	}

}
