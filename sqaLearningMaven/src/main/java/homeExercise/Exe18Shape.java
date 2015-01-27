package homeExercise;

public abstract class Exe18Shape {

//	Exercise 18:  (Abstract classes) 
//	Write an abstract class Shape. Define a String variable “name” and a getter 
//	for that variable. 
//	Shape will have 1 overloaded constructor that takes the parameter String name
//	and sets that value to name property. 
//	Shape declares one abstract method double getArea() 
//
//	Write a circle class. Circle class should extend Shape class. 
//	Have a property double radius and a getter setter for that. 
//	Have one overloaded constructor that takes 2 arguments, (name and radius). 
//	Name argument should be passed to super class constructor. And radius should be 
//	assigned to radius property. 
//	Implement a double getArea() method that does the calculation of 3.14 * r*r and return 
//	the value. 
//	Implement the Triangle class similar to circle class, only different there is 
//	height and width instead of radius and getArea() will have height and width instead of radius. 
//
//	Create a shape caller class with a main method in it. Create the object of circle class 
//	and triangle class and pass name and radius for circle and name, height and width for 
//	triangle while creating object. 
//	Call the getName and getArea method and store the values in the variables. 
//	Print out the variables using sysout. 
//
	private String name;
	
	public Exe18Shape(){
	}
	public Exe18Shape(String name){
		this.name = name;
	}
	
	public abstract double getArea();
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
}
