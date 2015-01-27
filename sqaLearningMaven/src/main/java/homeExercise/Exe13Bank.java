package homeExercise;

public class Exe13Bank {

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
	
	private String address;
	private int totalEmployees;
	
	public Exe13Bank(){
	}
	public Exe13Bank(String address){
		this(address,0);
	}
	public Exe13Bank(String address, int totalEmployees){
		this.address = address;
		this.totalEmployees = totalEmployees;
	}
	
	public void makeDeposit(){
		System.out.println("This is makeDeposit from Bank class");
	}
	public void withdrawMoney(){
		System.out.println("This is withdrawMoney from Bank class");
	}
	
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	
	public int getTotalEmployees(){
		return totalEmployees;
	}
	public void setTotalEmployees(int totalEmployees){
		this.totalEmployees = totalEmployees;
	}
}
