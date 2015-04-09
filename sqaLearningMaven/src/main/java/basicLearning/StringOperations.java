package basicLearning;

public class StringOperations {

	public static void main(String[] args) {
		String str1 = "Java classes are funny";
		String str2 = "are they really?";
		
		System.out.println("Index of ' are' in str2 is : "+str2.indexOf("b"));
		
		String vowelStr = "vwl";
		FuncvowelStr(vowelStr);
	}

	public static boolean FuncvowelStr(String varVowel){
				
		if (varVowel.indexOf('a') > -1 || varVowel.indexOf('e') > -1 ||
			varVowel.indexOf('i') > -1 || varVowel.indexOf('o') >-1 ||
			varVowel.indexOf('u') > -1) {
			System.out.println("String has vowel");
			return true;
		} else {
			System.out.println("String do not have any");
			return false;
		}
		
	}
}
