package classExercise;

public class InrEmployeeOverride extends InrPerson {
	private int IdNum;
	private int exprYr;
	protected int minAge = 21;
	
	public InrEmployeeOverride(){}

	public InrEmployeeOverride(int IdNum, int exprYr, String name, int age, char gender){
		super(name,age,gender);
		this.IdNum = IdNum;
		this.exprYr = exprYr;
	}
	
	public void printSocialId(){
		System.out.println("This is from employee override");
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
