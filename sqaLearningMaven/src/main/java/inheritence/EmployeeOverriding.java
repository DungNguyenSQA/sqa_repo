package inheritence;

public class EmployeeOverriding extends Person{

//	Add a function in Person class called “PrintSocialId” 
//	Add a protected property int minAge = 1; in PersonClass.
//	Create an EmployeeOverriding Class with same properties as Employee class.
//	Override “PrintSocialId” function in EmployeeOverriding Class.
//	Override int minAge = 21 property in EmployeeOverriding class.
//	Create a EmployeeOverridingCaller
//	Create object and reference of EmployeeOverriding and call the overriden property and method
//	Create object of EmployeeOverriding but reference of Person class and then call the overriden property and method.
//	
	private int IdNum;
	private int exprYr;
	
	
	public EmployeeOverriding(){		
	}
	
	public EmployeeOverriding(int IdNum, int exprYr, String name, int age, char gender){
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
	
//	@Override
	public void PrintSocialId(){
		super.minAge = 21;
		System.out.println("This is from EmployeeOverriding");
	}
	
}
