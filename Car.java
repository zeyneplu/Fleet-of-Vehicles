package week11;

//ZEYNEP USLU

public class Car extends Vehicle {
	private double milage;
	private int passenger;

	
	public Car() {
		super();
		this.milage = 1.0;
		this.passenger =1;
		
		}
	
	public Car(String manufacturer, int cylinders, String owner, double milage, int passenger) {
		super(manufacturer, cylinders, owner);
		this.setMilage(milage);
		this.setPassenger(passenger);
		
	}
	
	public double getMilage() {
		return this.milage;
	}
	
	public void setMilage(double milage) {
		if(milage >=0.0) {
			this.milage = milage;
		} else {
			this.milage = 1.0;
		}
	}
	
	public int getPassenger() {
		return this.passenger;
	}
	
	public void setPassenger(int passenger) {
		if(passenger >= 0) {
			this.passenger = passenger;
		} else {
			this.passenger =1;
		}
	}
	
	public boolean equals(Car otherCar) {
		return otherCar != null && super.equals(otherCar) && this.milage == otherCar.milage && 
				this.passenger == otherCar.passenger;
		
	}
	
	public String toString() {
		return super.toString() + "Gas Milage: " + this.milage + "Number of Passengers: " +this.passenger;
		
	}
 	
}