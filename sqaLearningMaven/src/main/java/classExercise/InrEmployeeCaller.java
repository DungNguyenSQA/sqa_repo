package classExercise;

public class InrEmployeeCaller {
	public static void main(String args[]){
		InrEmployee Employee1 = new InrEmployee();
		System.out.println("Employee# "+Employee1.getIdNum()+", name "+Employee1.getName()+", age "+Employee1.getAge()+
				", gender "+Employee1.getGender()+", has "+Employee1.getExprYr()+" years of experience.");

		InrEmployee Employee2 = new InrEmployee(1,10,"John",30,'M');
		System.out.println("Employee# "+Employee2.getIdNum()+", name "+Employee2.getName()+", age "+Employee2.getAge()+
				", gender "+Employee2.getGender()+", has "+Employee2.getExprYr()+" years of experience.");
	}	
}
