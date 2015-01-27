//package homeExercise; //Change for Git
package basiclearning;


/*
 * Write a java program that has 3 string variables:
1)	var4 = "Blue"
2)	var5 = "Blue"
3)	var5 = new String("Blue")

a)	Compare 1 with 2, 1 with 3 and 2 with 3 for value equality and memory address (reference).
b)	Print out the total characters in 2.
c)	Print second last character from 3
d)	Print the position of first “c” in 1.

 */
public class Exercise8StringObjects {
	
	public static void main(String args[]){
		String var1 = "Soccer";
		String var2 = "Cricket";
		String var3 = new String("Footbal");
		
		//Modifying the input for better understanding of == and equals 
		String var4 = "Blue";
		String var5 = "Blue";
		String var6 = new String("Blue");
		System.out.println("Blue.equals(Blue) is " +var4.equals(var5));
		System.out.println(var4.equals(var6));
		System.out.println(var5.equals(var6));
		System.out.println(var4 == var5);
		System.out.println(var4 == var6);
		System.out.println(var5 == var6);
		
		//Print second last character from 3
		char subChar = var3.charAt(var3.length()-2);
		System.out.println("second last character in "+var3+" is : "+subChar);
		//Print the position of first “c” in 1.
		int pos = var1.indexOf('c');
		System.out.println("Position of 'c' in "+var1+" is : "+pos);
	}
}
