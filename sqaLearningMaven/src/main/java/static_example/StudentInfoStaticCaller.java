//package classExercise; //Change for Git
package static_example;


public class StudentInfoStaticCaller {
	
	public static void main(String args[]){
		
		StudentInfoStatic obj1=new StudentInfoStatic("Ritu",1111);
		System.out.println("Student 1 : Id = "+StudentInfoStatic.intStudentId+
				", name="+obj1.getStrStudentName()+", zip="+obj1.getIntStudentZip());
		
		StudentInfoStatic obj2=new StudentInfoStatic("Swati",2222);
		System.out.println("Student 2 : Id = "+StudentInfoStatic.intStudentId+
				", name="+obj2.getStrStudentName()+", zip="+obj2.getIntStudentZip());
		
		StudentInfoStatic obj3=new StudentInfoStatic("John",22432);
		System.out.println("Student 3 : Id = "+StudentInfoStatic.intStudentId+
				", name="+obj3.getStrStudentName()+", zip="+obj3.getIntStudentZip());
		
		StudentInfoStatic obj4=new StudentInfoStatic("Jane",22544);
		System.out.println("Student 4 : Id = "+StudentInfoStatic.intStudentId+
				", name="+obj4.getStrStudentName()+", zip="+obj4.getIntStudentZip());
		
		StudentInfoStatic obj5=new StudentInfoStatic("David",75476);
		System.out.println("Student 5 : Id = "+StudentInfoStatic.intStudentId+
				", name="+obj4.getStrStudentName()+", zip="+obj4.getIntStudentZip());
	}
}
