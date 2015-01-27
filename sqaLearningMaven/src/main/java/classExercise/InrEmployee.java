package classExercise;

public class InrEmployee extends InrPerson {
	private int IdNum;
	private int exprYr;

	public InrEmployee(){}

	public InrEmployee(int IdNum, int exprYr, String name, int age, char gender){
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
