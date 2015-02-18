package homeExercise;

public class Exe33StaticNonStatic {

	public static void main(String[] args) {
//	Exercise 33: Static/Non Static
//	a)
//	1.Write a class that has static printName() method
//	2.Define non static method getName() in the same class
//	3.Call getName inside the printName() method.
//	b)
//	1.in the same class that has non static method printAddress();
//	2.Define a static method getAddress(); in the class.
//	3.Call getAddress() from printAddress() method.

		printName();
		printAddress();
	}
	
	public static void printName(){
		System.out.println("This is printName()");
		getName();
	}
	
	public static void getName(){
		System.out.println("This is getName()");
	}
	
	public static void printAddress(){
		System.out.println("This is printAddress");
		getAddress();
	}
	
	public static void getAddress(){
		System.out.println("This is getAddress");
	}
}
