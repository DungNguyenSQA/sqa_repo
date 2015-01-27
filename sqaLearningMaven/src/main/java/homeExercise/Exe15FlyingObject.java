package homeExercise;

public interface Exe15FlyingObject {

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
	int MAX_SPEED = 400;
	int MAX_ALTITUDE = 20000;
	
	void takeOff();
	void land();
	int capacity();
	int flyHigh();
	int currentAltitude();
	String getName();
	
}
