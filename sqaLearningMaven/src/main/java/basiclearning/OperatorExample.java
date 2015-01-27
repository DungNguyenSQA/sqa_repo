package basiclearning;

public class OperatorExample {

	public static void main(String args[]){
		int a = 6;
		int b = 5;
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		int mod = a % b;
		int varnew = (a + b) + (a - b) + (a % b);
		System.out.println("******Arithmatic operator starts******");
		System.out.println(a +" add "+b+" = "+add);
		System.out.println(a +" sub "+b+" = "+sub);
		System.out.println(a +" mul "+b+" = "+mul);
		System.out.println(a +" div "+b+" = "+div);
		System.out.println(a +" mod "+b+" = "+mod);
		System.out.println("*****Arithmetic operator ends*****");
		
		System.out.println("*****assignment operator starts*****");
		//a = a = 5;
		a +=5;
		System.out.println("*****Value pof a is now "+ a);
		//b = b + 5
		b += a;
		System.out.println("******Value of b is now "+ b);
	}
}
