package classExercise;

public class InrPerson {
	private String name;
	private int age;
	private char gender;
	protected int minAge = 1; 
	
	public InrPerson(){
		//System.out.println("This is from Person");
	}
	
	public InrPerson(String name, int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println("This is from overloaded Person");		
	}		

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}

	public char getGender(){
		return gender;
	}
	public void setGender(char gender){
		this.gender = gender;
	}
	
	public void printSocialId(){
		System.out.println("Printing social Id from Person");
	}
}
