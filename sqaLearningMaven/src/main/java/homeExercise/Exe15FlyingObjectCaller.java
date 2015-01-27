package homeExercise;

public class Exe15FlyingObjectCaller {

	public static void main(String[] args) {
//		Exercise 15 - Interface: Create an interface FlyingObject 
//		Declare the property int maxSpeed = 400, int 
//		maxAltitude = 20000. 
//		Declare the methods of flying object takeOff(), 
//		land(), capacity(), flyHigh(), currentAltitude() 
//		Create 2 classes, (Plane, Chopper) which 
//		implements the Interface. 
//		Caller should create the objects of both the classes. 
//		Caller should call a “operate” method that should 
//		keep on calling flyHigh() method till maxAltitude 
//		is not reached. Once maxAltitude is reached, 
//		land() method should be called. 
//
		Exe15FlyingObject plane = new Exe15Plane();				
		Exe15FlyingObject chopper = new Exe15Chopper();
			
		Exe15FlyingObject[] flyingobjectArr = new Exe15FlyingObject[]{plane,chopper};
		operate(flyingobjectArr);
	}
		
	public static void operate(Exe15FlyingObject[] flyingobjectArr){
		for(Exe15FlyingObject object : flyingobjectArr){
			int flyhighCall = 1;
				
			while(object.flyHigh() >=0){
				System.out.println("Call for :"+object.getName()+" - "
						+(flyhighCall++)+" times");			
			}
			object.land();
		}				
	}
}

