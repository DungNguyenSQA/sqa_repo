package inheritence;

public class CarOverriding extends Vehicle{
	private int engineCap;
	private boolean isFourWheel;
	protected String source = "car";
	String name = "myCar";
	
	public CarOverriding(){		
		System.out.println("This is from Car");
		this.engineCap = 3;
	}
	
	public CarOverriding(int engineCap, boolean isFourWheel, int maxSpeed, 
			String color, String model){
		//Calling the parent class constructor
		super(maxSpeed, color, model);		
		this.engineCap = engineCap;
		this.isFourWheel = isFourWheel;
		System.out.println("This is from Car overloaded");
	}
		
	public void run(){
		System.out.println("My car is running");
		super.source = "vechileFromCar";
		super.getColor();
	}	
	
	public int getEngineCap() {
		return engineCap;		
	}
	public void setEngineCap(int engineCap) {
		this.engineCap = engineCap;
	}
	public boolean isFourWheel() {
		return isFourWheel;
	}
	public void setFourWheel(boolean isFourWheel) {
		this.isFourWheel = isFourWheel;
	}
}