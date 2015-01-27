package inheritence;

public class Employee extends Person{

//	Create a Person Class with gender, age and name. 
//	Create an Employee Class with IdNum, exprYr. That extends Person Class. Define a default and overloaded constructor for Person class and Employee Class. 
//	Employee class constructor should have all 5 properties.(2 of child and 3 of parent)
//	Write an Employee class caller. Create 2 objects one without any arguments and other with setting all the properties.
//	Print out all the properties for both the objects.
//
	private int IdNum;
	private int exprYr;
	
	
	public Employee(){		
	}
	
	public Employee(int IdNum, int exprYr, String name, int age, char gender){
		super(name,age,gender);
		this.IdNum = IdNum;
		this.exprYr = exprYr;
	}
	
	public int getIdNum() {
		return IdNum;
	}
	public void setIdNum(int idNum) {
		IdNum = idNum;
	}
	public int getExprYr() {
		return exprYr;
	}
	public void setExprYr(int exprYr) {
		this.exprYr = exprYr;
	}
	
}
