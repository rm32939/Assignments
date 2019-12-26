package assignment;

public class Person  {
	
	protected String name; 
	private address addr;
	
	public Person(String name) {
		this.name=name;
	}
	public Person(String name,address addr) {
		super();
		this.name = name;
		this.addr=addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
	
	
}
