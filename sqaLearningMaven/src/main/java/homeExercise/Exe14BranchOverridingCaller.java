package homeExercise;

public class Exe14BranchOverridingCaller {

	public static void main(String[] args) {
//		Exercise 14: Method overriding: Write a BranchOverriding class that extends Bank class. 
//		It has this property: Timing
//		BranchOverriding class overrides the withdrawMoney function and provides its own 
//		implementation.
//		Write a caller class that creates the object of BranchOverriding and access all the properties and call 
//		all the methods. 
//
		Exe14BranchOverriding objBank = new Exe14BranchOverriding();
		System.out.println("Bank "+objBank.getAddress()+", #Employees : "+objBank.getTotalEmployees()+", Timing :"+objBank.getTiming());

		Exe14BranchOverriding objBank2 = new Exe14BranchOverriding("ABC 140 San Pedro rd",10,50);
		System.out.println("Bank "+objBank2.getAddress()+", #Employees : "+objBank2.getTotalEmployees()+", Timing :"+objBank2.getTiming());
		
		Exe14BranchOverriding objBank3 = new Exe14BranchOverriding("DEF 123 Unknowed St",1,1);
		System.out.println("Bank "+objBank3.getAddress()+", #Employees : "+objBank3.getTotalEmployees()+", Timing :"+objBank3.getTiming());

		objBank3.makeDeposit();
		objBank3.withdrawMoney();
		
	}

}
