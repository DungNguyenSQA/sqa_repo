package basicLearning;

public class Hw0110Exercise6 {

	public static void main(String[] args) {
//		Exercise 6: Define a function that accepts a String array and 
//		print only first 3 characters of every string value. 
//		Call this function from the main method and pass a String array that has name of any 5 countries.
//
		String[] varArr = new String[]{"USA","FRANCE","JAPAN","AUSTRALIA","ETHIOPIA"};
		subString(varArr);
		
	}
	public static void subString(String[] inputArr){
		
		for (int i=0; i<inputArr.length; i++){										// or use for each loop
			System.out.println("Ele #"+i+" : "+ inputArr[i].substring(0,3));
		}
		
		double[] f = new double[]{34.43,5431.2,54.34,542.54};
		for (double element : f){
			System.out.println(element);
		}

	}
	
}
