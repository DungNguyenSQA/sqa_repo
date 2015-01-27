package classExercise;

public class StudentInfoOverloadedCnstr {
	private int studentId;
	private String studentName;
	private int studentZip;

	public StudentInfoOverloadedCnstr(){
		//this(0,null,0); redundant if I not passing some different values than default
		this(1,"John",94555);
	}

	public StudentInfoOverloadedCnstr(int studentId, String studentName) {
		this(studentId,studentName,0);
	}

	public StudentInfoOverloadedCnstr(int studentId, String studentName, int studentZip) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentZip = studentZip;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentZip() {
		return studentZip;
	}

	public void setStudentZip(int studentZip) {
		this.studentZip = studentZip;
	}
}
