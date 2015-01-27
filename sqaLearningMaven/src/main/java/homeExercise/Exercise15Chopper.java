package homeExercise;

public class Exercise15Chopper implements Exercise15IFlyingObject {
	
	private int currentAlt;
	
	public void takeOff() {
		System.out.println("Chopper taking off now");
	}

	public void land() {
		System.out.println("Chopper landing now");
	}

	public int capacity() {
		return 5;
	}
	
	public int currentAltitude(){
		return currentAlt;
	}
	
	public int flyHigh() {
		currentAlt += 5000;
		System.out.println("Chopper flying at : "+currentAlt+" now");
		return currentAlt;
	}
}
