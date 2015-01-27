package homeExercise;

public class Exe9Vehicle {
	//Exercise 9: Class-Object : Create a vehicle class. 
	//Properties : String color, int make and String model. 
	//Write a default constructor that initializes these properties to color=blue, make=VW, model=2015.
	//Write a main method that creates the object by passing these values. 
	//Print the values of the properties after the object is created.
	
	private String make;
	private int model;
	private String color;
	
	public Exe9Vehicle(){
		make = "VW";
		model = 2015;
		color = "blue";
	}
	
	public void printVehicule(){
		System.out.println("Vehicule make :"+make+" with model : "+model+" has "+color+" color.");
	}
	
	public String getMake(){
		return make;
	}
	
	public void setMake(String make){
		this.make = make;
	}
	
	public int getModel(){
		return model;
	}
	
	public void setModel(int model){
		this.model = model;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
}
