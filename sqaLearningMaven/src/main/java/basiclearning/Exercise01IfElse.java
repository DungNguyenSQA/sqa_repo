//package homeExercise;  //Modified for Git
package basiclearning;

public class Exercise01IfElse {
	
	//What we see inside the () is called as parameter list
	//data type and variable for e.g. (String name)
	
	//access_modifier returnType name(<optional parameter list>)
	public static void main(String[] args){
		//we do not give access modifier to local variables for e.g.
		//public int mark = 60; is invalid.
		//you have to initialize the local variable with some value.
		//Class level variables have default initializtion but not local variable.
		int mark = 40;
		
		//if(boolean condition){
		if(mark >= 60){
			System.out.println("pass");
		}else{
			System.out.println("fail");
		}
	}
}
