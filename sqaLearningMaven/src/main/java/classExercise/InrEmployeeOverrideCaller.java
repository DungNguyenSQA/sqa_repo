package classExercise;

public class InrEmployeeOverrideCaller {
	
	public static void main(String args[]){
		//Create object and reference of EmployeeOverriding and call 
		//the overriden property and method
		InrEmployeeOverride inEmp1 = new InrEmployeeOverride();
		System.out.println("From emp object and emp refer. : "+inEmp1.minAge);
		inEmp1.printSocialId();
		
		//Create object of EmployeeOverriding but reference of Person class 
		//and then call the overriden property and method.
		InrPerson inEmp2 = new InrEmployeeOverride();
		System.out.println("From person ref and emp object : "+inEmp2.minAge);
		inEmp2.printSocialId();
	}
}
