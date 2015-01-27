package homeExercise;

public class Exe15Plane implements Exe15FlyingObject{

//	Exercise 15 - Interface: Create an interface FlyingObject 
//	Declare the property int maxSpeed = 400, int 
//	maxAltitude = 20000. 
//	Declare the methods of flying object takeOff(), 
//	land(), capacity(), flyHigh(), currentAltitude() 
//	Create 2 classes, (Plane, Chopper) which 
//	implements the Interface. 
//	Caller should create the objects of both the classes. 
//	Caller should call a “operate” method that should 
//	keep on calling flyHigh() method till maxAltitude 
//	is not reached. Once maxAltitude is reached, 
//	land() method should be called. 
//
	int varMaxAltitude = Exe15FlyingObject.MAX_ALTITUDE;
	
	
	public void takeOff(){
		System.out.println("Plane is taking off");
	}
	
	public void land(){
		System.out.println("Plane is landing");
	}
	
	public int capacity(){
		System.out.println("Plane has some capacity");
		return 5;
	}
	
	public int currentAltitude(){
		System.out.println("Plane Current Altitude");
		return 0;
	}
	
	public int flyHigh(){
		varMaxAltitude -= 400;
		return varMaxAltitude;
	}

	public String getName(){
		return "Plane";
	}
}
