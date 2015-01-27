package homeExercise;

public class Exe16Fruit {

//	Exercise 16: (Final) 
//	Write a class Fruit with properties name, taste and
//	originCountry. originCountry should be a final 
//	variable with value = “USA”  and methods String 
//	getSource();, getWeight() 
//	getSource() should be a final method. 
//	Write a sub class Apple and override getWeight 
//	method and also override getSource() method. 
//	(It should show compilation error) 
//
	private String name;
	private String taste;
	public final String originCountry = "USA";
	

	public void getWeight(){
		System.out.println("This is from getWeight");
	}
	
	public final void getSource(){
		System.out.println("This is from getSource");
	}
	
}
