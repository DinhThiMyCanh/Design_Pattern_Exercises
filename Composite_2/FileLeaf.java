package Composite_2;

public class FileLeaf extends Component{

	public FileLeaf(String name, long size) {
		super(name, size);
	}

	@Override
	public void showProperty() {
		System.out.println("Name:"+name+" Size:"+size);
		
	}

	@Override
	public long totalSize() {
		// TODO Auto-generated method stub
		return size;
	}

}
