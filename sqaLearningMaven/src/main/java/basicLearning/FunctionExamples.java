package basicLearning;

public class FunctionExamples {

	public static void main(String[] args) {
		int sum = calcsum(2,2);
		System.out.println("Lalue one is : "+sum);
		
		int value2 = calcsum(3,65);
		System.out.println("Value 2 is : "+value2);
		
		printname("Java");
		printname("Apple");
		
		for (int i=0; i<10; i++){
			printname("i is : "+i);
		}

	}
	
	public static int calcsum(int a, int b){
		int sum = a+b;
		return sum;
	}
	
	public static void printname(String str){
		System.out.println("Name is : "+str);
	}

}
