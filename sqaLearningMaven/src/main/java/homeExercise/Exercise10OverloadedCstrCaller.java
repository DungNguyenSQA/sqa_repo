package homeExercise;

public class Exercise10OverloadedCstrCaller {
	
	public static void main(String args[]){
		Exercise10OverloadedCstr obj1 = new Exercise10OverloadedCstr();
//		System.out.println("name is : "+obj1.getName());
//		System.out.println("taste is : "+obj1.getTaste());
//		System.out.println("color is : "+obj1.getColor());
//		System.out.println("*************************");
		
		Exercise10OverloadedCstr obj2 = new Exercise10OverloadedCstr("apple");
//		System.out.println("name is : "+obj2.getName());
//		System.out.println("taste is : "+obj2.getTaste());
//		System.out.println("color is : "+obj2.getColor());
//		System.out.println("*************************");
		
		Exercise10OverloadedCstr obj3 = new Exercise10OverloadedCstr("mango","sweet");
//		System.out.println("name is : "+obj3.getName());
//		System.out.println("taste is : "+obj3.getTaste());
//		System.out.println("color is : "+obj3.getColor());
//		System.out.println("*************************");
		
		Exercise10OverloadedCstr obj4 = new Exercise10OverloadedCstr("orange","sweet-sour","orange");
//		System.out.println("name is : "+obj4.getName());
//		System.out.println("taste is : "+obj4.getTaste());
//		System.out.println("color is : "+obj4.getColor());
//		System.out.println("*************************");
		printProperties(obj1);
		printProperties(obj2);
		printProperties(obj3);
		printProperties(obj4);
	}
	//private static void printMessage(String message)
	private static void printProperties(Exercise10OverloadedCstr exerciseObj){
		System.out.println("name is : "+exerciseObj.getName());
		System.out.println("taste is : "+exerciseObj.getTaste());
		System.out.println("color is : "+exerciseObj.getColor());
		System.out.println("*************************");
	}
}
