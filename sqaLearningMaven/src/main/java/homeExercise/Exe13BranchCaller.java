package homeExercise;

public class Exe13BranchCaller {

	public static void main(String[] args) {
//		Exercise 13 – Inheritance : Write a Bank class such that Bank class will have these properties: 
//		address, totalEmployees.
//		Bank class has setters and getters and these two functions. They only print some text in 
//		the body: makeDeposit, withdrawMoney. Define default and overloaded constructor for 
//		Bank class for above 2 properties.
//		Branch class extends Bank class, it has these properties : Timing, 
//		Define default and overloaded constructor for Branch class. Overloaded constructor should 
//		define 3 parameters and should call super to set parent class properties. 
//		Create a BranchCaller and create objects of Branch class and pass all the arguments and 
//		print the properties using getters. 
//
	Exe13Branch objBank = new Exe13Branch();
	System.out.println("Bank "+objBank.getAddress()+", #Employees : "+objBank.getTotalEmployees()+", Timing :"+objBank.getTiming());

	Exe13Branch objBank2 = new Exe13Branch("ABC 140 San Pedro rd",10,50);
	System.out.println("Bank "+objBank2.getAddress()+", #Employees : "+objBank2.getTotalEmployees()+", Timing :"+objBank2.getTiming());
	
	Exe13Branch objBank3 = new Exe13Branch("DEF 123 Unknowed St",1,1);
	System.out.println("Bank "+objBank3.getAddress()+", #Employees : "+objBank3.getTotalEmployees()+", Timing :"+objBank3.getTiming());
	}

}
