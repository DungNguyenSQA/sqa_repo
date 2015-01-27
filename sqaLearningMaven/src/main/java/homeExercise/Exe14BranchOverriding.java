package homeExercise;

public class Exe14BranchOverriding extends Exe13Bank{

//	Exercise 14: Method overriding: Write a BranchOverriding class that extends Bank class. 
//	It has this property: Timing
//	BranchOverriding class overrides the withdrawMoney function and provides its own 
//	implementation.
//	Write a caller class that creates the object of BranchOverriding and access all the properties and call 
//	all the methods. 
//
	private int Timing;
	
	public Exe14BranchOverriding(){
		super();
	}
	public Exe14BranchOverriding(String address, int totalEmployees, int Timing){
		super(address,totalEmployees);
		this.Timing = Timing;
	}
	
	@Override
	public void withdrawMoney(){
		System.out.println("This is withdrawMoney from BranchOverriding");
	}
	
	public int getTiming(){
		return Timing;
	}
	public void setTiming(int Timing){
		this.Timing = Timing;
	}
}
