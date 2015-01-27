package homeExercise;

public class Exe16Apple extends Exe16Fruit{

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
	@Override
	public void getWeight(){
		System.out.println("This is getWeight() from Apple");
	}

	//Should not work
//	@Override
//	public void getSource(){
//		System.out.println("This is getSource() from Apple");
//	}
}
