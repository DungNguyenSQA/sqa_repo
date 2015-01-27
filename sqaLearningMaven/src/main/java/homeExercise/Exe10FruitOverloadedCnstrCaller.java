package homeExercise;

public class Exe10FruitOverloadedCnstrCaller {

	public static void main(String[] args) {
//		Overloaded constructor: Write a fruit class that defines 4 constructors: 
//		a)	default constructor 
//		b)	constructor with 1 argument (String name) 
//		c)	constructor with 2 arguments (String name,String taste) 
//		d)	constructor with 3 arguments (String name,String taste, String color); 
//		Only one of the constructor should have the initialization code and rest of the constructors 
//		should use �this(...)� syntax. 
//		From the main method, create 4 objects one for each constructor 
//		type and print the properties after each object is created. 

		Exe10FruitOverloadedCnstr Fruit1 = new Exe10FruitOverloadedCnstr();
		System.out.println("Fruit "+Fruit1.getStrName()+", Taste "+Fruit1.getStrTaste()+" Color "+Fruit1.getStrColor());
		
		Exe10FruitOverloadedCnstr Fruit2 = new Exe10FruitOverloadedCnstr("Kiwi");
		System.out.println("Fruit "+Fruit2.getStrName()+", Taste "+Fruit2.getStrTaste()+" color "+Fruit2.getStrColor());
		
		Exe10FruitOverloadedCnstr Fruit3 = new Exe10FruitOverloadedCnstr("Pear","Sweat");
		System.out.println("Fruit "+Fruit3.getStrName()+", Taste "+Fruit3.getStrTaste()+" color "+Fruit3.getStrColor());
		
		Exe10FruitOverloadedCnstr Fruit4 = new Exe10FruitOverloadedCnstr("Orange","Bitter","Orange");
		System.out.println("Fruit "+Fruit4.getStrName()+", Taste "+Fruit4.getStrTaste()+" color "+Fruit4.getStrColor());
		
	}

}
