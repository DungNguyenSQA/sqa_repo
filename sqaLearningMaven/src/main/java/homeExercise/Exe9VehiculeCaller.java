package homeExercise;

public class Exe9VehiculeCaller {

	public static void main(String[] args) {
		//Exercise 9: Class-Object : Create a vehicle class. 
		//Properties : String color, int make and String model. 
		//Write a default constructor that initializes these properties to color=blue, make=VW, model=2015.
		//Write a main method that creates the object by passing these values. 
		//Print the values of the properties after the object is created.
		
		Exe9Vehicle vc1 = new Exe9Vehicle();
		vc1.setMake("BMW");
		vc1.setModel(2015);
		vc1.setColor("Black");
		vc1.printVehicule();
		
		Exe9Vehicle vc2 = new Exe9Vehicle();
		vc2.setMake("Ford");
		vc2.setModel(1967);
		vc2.setColor("Red");
		vc2.printVehicule();

		Exe9Vehicle vc3 = new Exe9Vehicle();
		vc3.setMake("Cadillac");
		vc3.setModel(1937);
		vc3.setColor("Yellow");
		vc3.printVehicule();
		
	}
}
