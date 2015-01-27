package homeExercise;

public class Exe12BankAccount {

//	Exercise 12 - Static:  Write a BankAccount class. It 
//	should have actHolderName, accountNumber, initialAmount properties. 
//	accountNumber should get  incremented and assigned automatically to the object everytime 
//	when a BankAccount object is created.  
//	Create BankAccountCaller class. Create 5 BankAccount objects and print accountNumber 
//	for every object. 

	public static int accountNumber;
	private String accountHolderName;
	private double initialAmount;
	
	public String getAccountHolderName(){
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName){
		this.accountHolderName = accountHolderName;
	}
	
	public double getInitialAmount(){
		return initialAmount;
	}
	public void setInitialAmount(double initialAmount){
		this.initialAmount = initialAmount;
	}
	
	public Exe12BankAccount(String accountHolderName, double initialAmount){
		accountNumber++;
		this.accountHolderName = accountHolderName;
		this.initialAmount = initialAmount;
	}
}
