package classExercise;

public class StudentInfoOverloadedCnstrCaller {
	
	public static void main(String args[]){
		StudentInfoOverloadedCnstr St1 = new StudentInfoOverloadedCnstr();
		String stdName1 = St1.getStudentName();
		int stdId1 = St1.getStudentId();
		int stdZip1 = St1.getStudentZip();
		System.out.println("Student :"+stdName1+" with id "+stdId1+" Zip "+stdZip1);

		StudentInfoOverloadedCnstr St2 = new StudentInfoOverloadedCnstr(2,"Titi");		
		String stdName2 = St2.getStudentName();
		int stdId2 = St2.getStudentId();
		int stdZip2 = St2.getStudentZip();
		System.out.println("Student :"+stdName2+" with id "+stdId2+" Zip "+stdZip2);

		StudentInfoOverloadedCnstr St3 = new StudentInfoOverloadedCnstr(3,"Tito",95200);		
		String stdName3 = St3.getStudentName();
		int stdId3 = St3.getStudentId();
		int stdZip3 = St3.getStudentZip();
		System.out.println("Student :"+stdName3+" with id "+stdId3+" Zip "+stdZip3);
	}
}
