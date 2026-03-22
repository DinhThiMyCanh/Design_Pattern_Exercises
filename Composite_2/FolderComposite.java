package Composite_2;

import java.util.ArrayList;
import java.util.List;

public class FolderComposite extends Component implements Operations {

	private List<Component> files;
	public FolderComposite(String name, long size) {
		super(name, size);
		files = new ArrayList<>();
	}

	@Override
	public void showProperty() {
		for (Component file:files)
			file.showProperty();
		
	}

	@Override
	public long totalSize() {
		long total =0;
		for (Component file:files)
			total += file.totalSize();
		return total;
	}

	@Override
	public void add(Component component) {
		files.add(component);
		
	}

	@Override
	public void remove(Component component) {
		files.remove(component);
		
	}

}
