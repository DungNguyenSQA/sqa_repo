package classExercise;

public class StudentInfoStatic {
	public static int intStudentId;
	private String strStudentName;
	private int intStudentZip;
	
	public StudentInfoStatic(String strStudentName, int intStudentZip){
		this.strStudentName=strStudentName;
		this.intStudentZip=intStudentZip;
		intStudentId++;
	}

	public static int getIntStudentId() {
		return intStudentId;
	}
	public static void setIntStudentId(int intStudentId) {
		StudentInfoStatic.intStudentId = intStudentId;
	}
	public String getStrStudentName() {
		return strStudentName;
	}
	public void setStrStudentName(String strStudentName) {
		this.strStudentName = strStudentName;
	}
	public int getIntStudentZip() {
		return intStudentZip;
	}
	public void setIntStudentZip(int intStudentZip) {
		this.intStudentZip = intStudentZip;
	}
}
