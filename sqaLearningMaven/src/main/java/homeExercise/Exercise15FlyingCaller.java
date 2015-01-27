package homeExercise;

public class Exercise15FlyingCaller {
	
	public static void main(String args[]){
		Exercise15IFlyingObject ob1 = new Exercise15Plane();
		Exercise15IFlyingObject ob2 = new Exercise15Chopper();
		System.out.println("Flying plane now.....");
		operate(ob1);
		System.out.println("-----------------------------");
		System.out.println("Flying chopper now.....");
		operate(ob2);
	}
	
//	public void add(int a, int b){
//		System.out.println(a + b);
//	}
	
	public static void operate(Exercise15IFlyingObject ob){
		while(true){
			if(ob.currentAltitude() < Exercise15IFlyingObject.maxAltitude){
				ob.flyHigh();
			}else{
				ob.land();
				break;
			}
		}
	}
}
