package Composite;

public class FileLeaf implements FileComponent {

	private String name;
	private long size;
	
	public FileLeaf(String name, long size) {
		this.name = name;
		this.size = size;
	}
	
	@Override
	public void showProperty() {
		System.out.println("Name:"+name+" Size:"+size);
		
	}

	@Override
	public long totalSize() {
		// TODO Auto-generated method stub
		return this.size;
	}

}
