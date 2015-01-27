package basiclearning;

public class Hw0110Exercise8 {

	public static void main(String[] args) {
//		Exercise 8: Write a java program that has 3 string variables:
//		1) Soccer
//		2) Football
//		3) Cricket
//			“Soccer” and “Cricket” are string literal, “Football” is java String object.
//
//			a) Compare 1 with 2, 1 with 3 and 2 with 3 for value equality and memory address (reference).
//			b) Print out the total characters in 2.
//			c) Print second last character from 3
//			d) Print the position of first “c” in 1.

		String str1 = "Soccer";
		String str2 = new String("Football");
		String str3 = "Cricket";
		
		System.out.println("Testing value equality for str1 and str2 : "+ (str1.equals(str2)));
		System.out.println("Comparing references of str1 and str2 : "+ (str1 == str2));
		
		System.out.println("Testing value equality for str1 and str3 : "+ (str1.equals(str3)));
		System.out.println("Comparing references of str1 and str3 : "+ (str1 == str3));
		
		System.out.println("Testing value equality for str2 and str3 : "+ (str2.equals(str3)));
		System.out.println("Comparing references of str2 and str3 : "+ (str2 == str3));
		
		System.out.println("Total characters in str2 : "+str2.length());
		
		System.out.println("Second last character from str3 : "+str3.substring(str3.length()-2,str3.length()-1));
		// ***** or ---->
		System.out.println("Second last character from str3 : "+str3.charAt(str3.length()-2));		
		
		System.out.println("Position of first 'c' in str1 : "+str1.indexOf('c'));
		System.out.println("Position of first 'z' in str1 : "+str1.indexOf('z'));
		
	}

}
