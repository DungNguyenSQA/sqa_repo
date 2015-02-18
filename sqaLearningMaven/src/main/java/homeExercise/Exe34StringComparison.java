package homeExercise;

public class Exe34StringComparison {

	public static void main(String[] args) {
//		Exercise 34 : String comparison
//		1.Write a class with main method.
//		2.Define String test2 = new String(“abc”);
//		3.String test3 = “abc”;
//		4.String test4 = “abc”;
//		5.String test5 = new String(“abc”);
//		6.Compare 2 and 3, 2 and 4, 2 and 5, 3 and 4, 3 and 5, 4 and 5 
//		using “=” operator and also using “equal” operator.

		String test2 = new String("abc");
		String test3 = "abc";
		String test4 = "abc";
		String test5 = new String("abc");
		
		//Carefully to surround comparison with ()
		System.out.println("2==3 "+(test2==test3));
		System.out.println("2==4 "+(test2==test4));
		System.out.println("2==5 "+(test2==test5));
		System.out.println("3==4 "+(test3==test4));
		System.out.println("3==5 "+(test3==test5));
		System.out.println("4==5 "+(test4==test5));
		
		System.out.println("equals 2==3 "+(test2.equals(test3)));
		System.out.println("equals 2==4 "+(test2.equals(test4)));
		System.out.println("equals 2==5 "+(test2.equals(test5)));
		System.out.println("equals 3==4 "+(test3.equals(test4)));
		System.out.println("equals 3==5 "+(test3.equals(test5)));
		System.out.println("equals 4==5 "+(test4.equals(test5)));
		
	}
}
