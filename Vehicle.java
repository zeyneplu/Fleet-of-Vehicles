package week11;

public class Vehicle {
	
	//instance variables
	private String manufacturer;
	private int cylinders;
	private String owner;
	
	
	public Vehicle() {
		this.manufacturer = "none";
		this.cylinders = 6;
		this.owner = "none";
	}
	
	
	//constractor for vehicle with three features
	public Vehicle (String manufacturer, int cylinders, String owner) {
		setManufacturer(manufacturer);
		setCylinders(cylinders);
		setOwner(owner);
		
	}
	
	//accessor and mutator for manufacturer
	public String getManufacturer() {
		return manufacturer;
		}
	
	public void setManufacturer( String manufacturer) {
		if(manufacturer != null) {
			this.manufacturer = manufacturer;
		} else {
			this.manufacturer = "none";
		}
	}
	
	//getter setter for cylinders
	public int getCylinders() {
		return cylinders;
	}
	
	public void setCylinders(int cylinders) {
		if(cylinders >0) {
			this.cylinders = cylinders;
		} else {
			this.cylinders = 6;
		}
	}
	
	//getter setter for owner
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		if(owner !=null) {
			this.owner = owner;
		} else {
			this.owner = "none";
		}
	}
	
	public boolean equals (Vehicle otherVehicle) {
		return this.manufacturer.equalsIgnoreCase(otherVehicle.manufacturer) &&
				this.owner.equalsIgnoreCase(otherVehicle.owner) &&
				this.cylinders == otherVehicle.cylinders;
	}
		
	
	
	public String toString() {
		return "Manufacturer's Name: " +manufacturer+ 
				"Number of Cylinders: " +cylinders+
				"Owner's Name: " + owner;
	}
	

}
