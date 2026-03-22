package Composite_2;

public abstract class Component {
	protected String name;
	protected long size;
	
	public Component(String name, long size) {
		this.name = name;
		this.size = size;
	}
	public abstract void showProperty();
	public abstract long totalSize();
	
	
}
