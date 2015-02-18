package junitTests;

public class PowerOfTwo {

	public static void main(String[] args) {

	int varPower = 3;
	System.out.println("Power of 2 "+varPower+" "+CalculatePowerOfTwo(varPower));
	}

	public static int CalculatePowerOfTwo(int power){
		int varNumber = 2;
		for (int i=1;i<power;i++){
			varNumber = varNumber * 2;
		}
		return varNumber;
	}
}
