package inheritence;

public class Person {

//	Create a Person Class with gender, age and name. 
//	Create an Employee Class with IdNum, exprYr. That extends Person Class. Define a default and overloaded constructor for Person class and Employee Class. 
//	Employee class constructor should have all 5 properties.(2 of child and 3 of parent)
//	Write an Employee class caller. Create 2 objects one without any arguments and other with setting all the properties.
//	Print out all the properties for both the objects.
//

//	Overriding exercise:
//	Add a function in Person class called “PrintSocialId” 
//	Add a protected property int minAge = 1; in PersonClass.
//	Create an EmployeeOverriding Class with same properties as Employee class.
//	Override “PrintSocialId” function in EmployeeOverriding Class.
//	Override int minAge = 21 property in EmployeeOverriding class.
//	Create a EmployeeOverridingCaller
//	Create object and reference of EmployeeOverriding and call the overriden property and method
//	Create object of EmployeeOverriding but reference of Person class and then call the overriden property and method.
//		
	
	private String name;
	private int age;
	private char gender;
	//Overriden var
	protected int minAge = 1;
	
	
	public Person(){		
		System.out.println("This is from Person");
	}
	public Person(String name, int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println("This is from overloaded Person");
	}
	
	public void PrintSocialId(){		
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
	
}
