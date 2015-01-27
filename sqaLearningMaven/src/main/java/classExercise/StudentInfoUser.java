package classExercise;

public class StudentInfoUser {

		public static void main(String args[]){
			
			StudentInfo StudentObject = new StudentInfo();
			StudentObject.setStudentName("myName");
			StudentObject.setStudentId(12);
			StudentObject.setStudentZip(95050);
			System.out.println("Student "+StudentObject.getStudentName()+" id "+StudentObject.getStudentId()+
					" zip "+StudentObject.getStudentZip());

			StudentInfo StudentObject2 = new StudentInfo();
			StudentObject2.setStudentName("yourName");
			StudentObject2.setStudentId(13);
			StudentObject2.setStudentZip(95013);
			System.out.println("Student "+StudentObject2.getStudentName()+" id "+StudentObject2.getStudentId()+
					" zip "+StudentObject2.getStudentZip());
		}

	}

