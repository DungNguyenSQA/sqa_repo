package inheritence;

public class CarOverridingCaller {
	public static void main(String args[]){
		//Car myCar1 = new Car();
		CarOverriding myCar1 = new CarOverriding(5,true,20,"blue","Nisan");		
		myCar1.run();
		
		
		//Getting the properties from Car class.
		int myCap = myCar1.getEngineCap();
		boolean isFrWheel = myCar1.isFourWheel();
		
		//Getting the properties from super class. vechile
		String color = myCar1.getColor();
		String model = myCar1.getModel();
		int maxSpeed = myCar1.getMaxSpeed();
		
		System.out.println("color is : "+color+", model is : "+model
				+ " and engineCap is : "+myCap);
		myCar1.run();
		
		Vehicle vh = new Vehicle();
		vh.run();
		
		//Overriden methods are always called from objects not from reference
		Vehicle car = new CarOverriding();
		car.run();
		
		//Overriden properties are always called from reference not objects
		String overridenProper = car.source;
		System.out.println(overridenProper);
	}
}
