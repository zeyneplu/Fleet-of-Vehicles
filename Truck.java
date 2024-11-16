package week11;

public class Truck extends Vehicle { 
	
	private double load;
	private double towing;
	
	public Truck() {
		super();
		this.load = 1.0;
		this.towing = 1.0;
		
	}
	
	public Truck(String manufacturer, int cylinders, String owner, double load, double towing) {
		super(manufacturer, cylinders, owner); //call vehicle's parameterized constructor
		this.setLoad(load);
		this.setTowing(towing);
		
	
	}
	
	public double getLoad() {
		return this.load;
		
	}
	
	public void setLoad(double load) {
		if(load >= 0.0) {
			this.load = load;
		} else {
			this.load = 1.0;
		}
	}
	
	public double getTowing() {
		return this.towing;
	}
	
	public void setTowing(double towing) {
		if(towing >=0.0) {
			this.towing = towing;
		} else {
			this.towing = 1.0;
		}
	}
 }
