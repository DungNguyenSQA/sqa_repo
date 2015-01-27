package inheritence;

public class EmployeeOverridingCaller {

	public static void main(String[] args) {
//		Add a function in Person class called “PrintSocialId” 
//		Add a protected property int minAge = 1; in PersonClass.
//		Create an EmployeeOverriding Class with same properties as Employee class.
//		Override “PrintSocialId” function in EmployeeOverriding Class.
//		Override int minAge = 21 property in EmployeeOverriding class.
//		Create a EmployeeOverridingCaller
//		Create object and reference of EmployeeOverriding and call the overriden property and method
//		Create object of EmployeeOverriding but reference of Person class and then call the overriden property and method.
//	
		EmployeeOverriding EmployeeOver1 = new EmployeeOverriding(1,10,"John",30,'M');
		EmployeeOver1.PrintSocialId();
		System.out.println("Employee# "+EmployeeOver1.getIdNum()+", name "+EmployeeOver1.getName()+", age "+EmployeeOver1.getAge()+
				", gender "+EmployeeOver1.getGender()+", has "+EmployeeOver1.getExprYr()+" years of experience. minAge "+EmployeeOver1.minAge);

		Person EmployeeOver2 = new EmployeeOverriding(2,1,"Paul",21,'M');
		EmployeeOver2.PrintSocialId();
//		System.out.println("Employee# "+EmployeeOver2.getIdNum()+", name "+EmployeeOver2.getName()+", age "+EmployeeOver2.getAge()+
//				", gender "+EmployeeOver2.getGender()+", has "+EmployeeOver2.getExprYr()+" years of experience. minAge "+EmployeeOver2.minAge);
		System.out.println("In Person minAge "+EmployeeOver1.minAge);
		
	}

}
