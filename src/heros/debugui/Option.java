package heros.debugui;

public class Option {
	
	private static final Option option = new Option();
	
	public static final String EMPTY_STRING = "";
	public static final String LOCAL_ADDRESS = "localHost:1337";
	
	private String address = LOCAL_ADDRESS;
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	public static Option getInstance(){
		return option;
	}

}