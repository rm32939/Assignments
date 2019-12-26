package assignment;

public class address {
	private String Houseno;
	private String street;
	private String city;
	private String state;
	public address(String Houseno, String street, String city, String state) {
		super();
		this.Houseno= Houseno ;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	public String getHouseno() {
		return Houseno;
	}
	public void setHouseno(String houseno) {
		Houseno = houseno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "address [Houseno=" + Houseno + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
	
}
