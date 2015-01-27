package basiclearning;

public class Hw0110Exercise4 {

	public static void main(String[] args) {
		
//		Define a function that accepts two int variables and returns the multiplication
//		value of that. Call this function from the main method and print the return value.		

		int a=1;
		int b=2;
		
		System.out.println(" "+a+" * "+b+" = "+calcMult(a,b));
		
	}
	
	public static int calcMult(int a, int b){
		return a*b;
	}


}
