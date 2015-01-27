package homeExercise;

public class Exercise16FinalApple extends Exercise16FinalFruit{
	 @Override
	 public void getWeight(){
	  System.out.println("This is getWeight() from Apple");
	 }
	 
	 //Uncommenting below will throw compile time error as we are trying to 
	 //override final method
//	 @Override
//	 public void getSource(){
//	  System.out.println("This is getSource() from Apple");
//	 }
}
