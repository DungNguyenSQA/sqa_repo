package basicLearning;

public class CheckOddEven {

	public static void main(String[] args) {
//		Exercise 2 : CheckOddEven (if-else): Write a 
//		program called CheckOddEven which prints "Odd 
//		Number" if the int variable �number� is odd, or 
//		�Even Number� otherwise. 

		int varNumber = 12;
		
		if ((varNumber % 2) != 0) {
			System.out.println(varNumber+" is odd!");
		} else {
			System.out.println(varNumber+" is even");
		}
	}

}
