package homeExercise;

public class Exe13Branch extends Exe13Bank{
	
//	Exercise 13 – Inheritance : Write a Bank class such that Bank class will have these properties: 
//	address, totalEmployees.
//	Bank class has setters and getters and these two functions. They only print some text in 
//	the body: makeDeposit, withdrawMoney. Define default and overloaded constructor for 
//	Bank class for above 2 properties.
//	Branch class extends Bank class, it has these properties : Timing, 
//	Define default and overloaded constructor for Branch class. Overloaded constructor should 
//	define 3 parameters and should call super to set parent class properties. 
//	Create a BranchCaller and create objects of Branch class and pass all the arguments and 
//	print the properties using getters. 
//
	
	private int Timing;
	
	public Exe13Branch(){
		super();
	}
	public Exe13Branch(String address, int totalEmployees, int Timing){
		super(address,totalEmployees);
		this.Timing = Timing;
	}
	
	public int getTiming(){
		return Timing;
	}
	public void setTiming(int Timing){
		this.Timing = Timing;
	}

}
