package homeExercise;

/*
 *	Create an interface FlyingObject
 *	Declare the property int maxSpeed = 400, 
 *	int maxAltitude = 20000.
 *	Declare the methods of flying object 
 *	takeOff(), land(), capacity(), flyHigh(), currentAltitude()
 */
public interface Exercise15IFlyingObject {
	int maxSpeed = 400;
	int maxAltitude = 20000;
	
	public abstract void takeOff();
	public abstract void land();
	public abstract int capacity();
	int flyHigh();
	int currentAltitude();
}
