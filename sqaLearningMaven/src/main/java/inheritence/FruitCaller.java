package inheritence;

public class FruitCaller {  

	public static void main(String args[]) {  
		/*
		 * ERRORS IN THIS CLASS ARE ON PURPOSE FOR UNDERSTANDING
		 */
		 
		/* this will through an exception, we can't refer a superclass object 
		 * with a subclass reference variable 
		 */  
//			Apple apple = new Fruit(); 
		   

		/* This will work fine at compile time but at run time it will through 
		 * "ClassCastException" because some method from Apple might not be
		 * seen because casted (= truncated) 
		 */  
			Apple myapple = (Apple) new Fruit(); 
		  

		/* 
		 * With a superclass instance all methods will be called of superclass 
		 * only, no matters if a subclass overrides them 
		 */  
			Fruit fruit = new Fruit();  
			fruit.name();  
			fruit.contains(); 
			fruit.myProtectedMethod();  
			fruit.defaultScope();  

		 
		/*  
		 * private methods of a superclass are not even visible to its subclass 
		 */  
//			fruit.myPrivateMethod(); 

		/* This is perfectly illegal, we can not call subclass members with a 
		 * superclass object 
		 */  
//			fruit.iAmApple(); 
		  

		/* 
		 * This is simple, a subclass can access all non-private members of a 
		 * superclass, if overridden then overridden methods are called, else 
		 * the superclass declaration are called 
		 */  
			Apple apple2 = new Apple();  
			apple2.name();  
			apple2.contains();  
			apple2.iAmApple();  

		/* this is illegal, private members of superclass are not visible to a 
		 * subclass 
		 */  
//			apple2.myPrivateMethod(); 
		  

		/* 
		 * a superclass reference with subclass object can call only those non 
		 * private methods that are present in superclass. if methods are 
		 * overriden, than overriden method will be called 
		 */ 
		//Fruit is super class, apple is the child class of apple.
		//Reference/Type of super class is allowed to have object of same type or child class
		//new Apple() object is created and then stored in Fruit reference. i.e. at runtime
		//appFruit reference will look at the Apple() class for methods.
			Fruit appFruit = new Apple();  
			appFruit.name();  
			appFruit.contains();
//			appFruit.iAmApple();

		/* 
		 * appFruit.iAmApple(); this will throw a compile time error, 
		 * non-overriden methods of a sub class can not be called from 
		 * superclass reference 
		 */  

		/* 
		 * appFruit.myPrivateMethod(); this will through a compile time error, 
		 * even the private methods of a superclass can not be called from a 
		 * superclass reference to subclass object 
		 */  

		/* 
		 * if subclass does not have same static method as in superclass, then 
		 * the subclass will call the one in superclass. 
		 */  
			Fruit.iAmStatic();  
			Apple.iAmStatic();  

		/* 
		 * a final method can not be overriden by a superclass, even we cant 
		 * hide it in subclass 
		 */  
			fruit.iAmFinal();  
//			apple.iAmFinal();  
			appFruit.iAmFinal();  

		/* 
		 * a static final method is used when we want a static method in 
		 * superclass to be protected from being hidden by subclass 
		 */  
			Fruit.iAmStaticFinal();  
			Apple.iAmStaticFinal();
	}
}  