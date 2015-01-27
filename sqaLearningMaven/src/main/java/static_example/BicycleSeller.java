package static_example;

public class BicycleSeller {

	public static void main(String[] args) {
		//You can not call a non-static method from a static method
		//because there is no guarantee that static method will get called
		//from an object, but non-static methods should always get called from
		//objects.
		//printMessage();
		printStaticMessage();
		Bicycle bike1 = new Bicycle("black",9);
		System.out.println(Bicycle.getTotalNumOfBikes());
		
		Bicycle bike2 = new Bicycle("blue",3);
		System.out.println(bike2.getTotalNumOfBikes());
		
		Bicycle bike3 = new Bicycle("orange",0);
		System.out.println(bike3.getTotalNumOfBikes());
		
		Bicycle bike4 = new Bicycle("green",2);
		System.out.println(bike4.getTotalNumOfBikes());
		
		Bicycle bike5 = new Bicycle("white",6);
		System.out.println(bike5.getTotalNumOfBikes());
		
		//Calling the static variable
		System.out.println(Bicycle.totalNumOfBikes);
		System.out.println(Bicycle.getTotalNumOfBikes());

		//Calling the static method.
		//System.out.println(bike1.getTotalNumOfBikes());			
	}
	
	//You can call a static method from a non-static method.
	//This is allowed because it is guaranteed that object will only call 
	//a non-static method.
	public void printMessage(){
		System.out.println("fdsajkfsadjflkads;fj");
		printStaticMessage();
	}
	
	public static void printStaticMessage(){
		System.out.println("This is a static method");
		String str = new String("this is a utility example");
		Math.abs(-42.43);
	}

}
