package Composite;

import java.util.Arrays;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		FileComponent file1 = new FileLeaf("a", 10);
		FileComponent file2 = new FileLeaf("b", 15);
		FileComponent file3 = new FileLeaf("c", 5);
		
		List<FileComponent> files = Arrays.asList(file1,file2,file3);
		
		FileComponent folder = new FolderComposite(files);
		
		folder.showProperty();
		System.out.println(folder.totalSize());
		

	}

}
