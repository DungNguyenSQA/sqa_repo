//package classExercise; //Modified for Git
package basicLearning;

public class ArrayExercise {
	
	public static void main(String args[]){
		//Exercise part 1
		char[] charArr = new char[5];
		charArr[0] = 'a';
		charArr[1] = 'b';
		charArr[2] = 'c';
		charArr[3] = 'd';
		charArr[4] = 'e';
		
		//Exercise part 2
		int[] intArr = new int[]{134,342,542,42,65};
		intArr = new int[]{134,342,542,42,65};
		
		printSize(intArr);
		
		String[] strArr = new String[]{"abc","cd","nvda","fdew"};
		printElements(strArr);
	}
	
	//Exercise part 3
	public static void printSize(int[] intArr){
		System.out.println("Size of the array is : "+intArr.length);
	}
	
	//Exercise part 4
	public static void printElements(String[] strArr){
		for(String str : strArr){
			System.out.println("String is : "+str);
		}
	}
}
