package inheritence;

public class EmployeeCaller {

	public static void main(String[] args) {

//		Create a Person Class with gender, age and name. 
//		Create an Employee Class with IdNum, exprYr. That extends Person Class. Define a default and overloaded constructor for Person class and Employee Class. 
//		Employee class constructor should have all 5 properties.(2 of child and 3 of parent)
//		Write an Employee class caller. Create 2 objects one without any arguments and other with setting all the properties.
//		Print out all the properties for both the objects.
//
		Employee Employee1 = new Employee();
		System.out.println("Employee# "+Employee1.getIdNum()+", name "+Employee1.getName()+", age "+Employee1.getAge()+
							", gender "+Employee1.getGender()+", has "+Employee1.getExprYr()+" years of experience.");
		
		Employee Employee2 = new Employee(1,10,"John",30,'M');
		System.out.println("Employee# "+Employee2.getIdNum()+", name "+Employee2.getName()+", age "+Employee2.getAge()+
				", gender "+Employee2.getGender()+", has "+Employee2.getExprYr()+" years of experience.");
	}

}
