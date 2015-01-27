package homeExercise;

import homeExercise.Exe12BankAccount;

public class Exe12BankAccountCaller {

	public static void main(String[] args) {

//		Exercise 12 - Static:  Write a BankAccount class. It 
//		should have actHolderName, accountNumber, initialAmount properties. 
//		accountNumber should get  incremented and assigned automatically to the object everytime 
//		when a BankAccount object is created.  
//		Create BankAccountCaller class. Create 5 BankAccount objects and print accountNumber 
//		for every object. 

		Exe12BankAccount BankAccount1 = new Exe12BankAccount("John",50.25);
		System.out.println("Account# "+ Exe12BankAccount.accountNumber +", under "+BankAccount1.getAccountHolderName()+" has $"+BankAccount1.getInitialAmount());

		Exe12BankAccount BankAccount2 = new Exe12BankAccount("Mara",100.50);
		System.out.println("Account# "+ Exe12BankAccount.accountNumber +", under "+BankAccount2.getAccountHolderName()+" has $"+BankAccount2.getInitialAmount());
		
		Exe12BankAccount BankAccount3 = new Exe12BankAccount("Irma",200.00);
		System.out.println("Account# "+ Exe12BankAccount.accountNumber +", under "+BankAccount3.getAccountHolderName()+" has $"+BankAccount3.getInitialAmount());
		
		Exe12BankAccount BankAccount4 = new Exe12BankAccount("Paul",10);
		System.out.println("Account# "+ Exe12BankAccount.accountNumber +", under "+BankAccount4.getAccountHolderName()+" has $"+BankAccount4.getInitialAmount());
		
		Exe12BankAccount BankAccount5 = new Exe12BankAccount("Mickey",1000000.25);
		System.out.println("Account# "+ Exe12BankAccount.accountNumber +", under "+BankAccount5.getAccountHolderName()+" has $"+BankAccount5.getInitialAmount());
	}
}
