//package homeExercise;  //Modified for Git
package basicLearning;

public class Exercise02CheckOddEven {
	public static void main(String args[]){
		int number = 60;
		int remain = number%2;
		System.out.println("output of "+number+" % 2 = "+remain);
		if(remain == 0){
			System.out.println("even");
		}else{
			System.out.println("odd");
		}
	}
}
