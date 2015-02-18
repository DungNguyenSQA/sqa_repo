package testNg;

//string var , getter setter
//
//test class, methods, +assertion true, false, null, notnull, same, notsame, equals (2 array)  

public class testNgClass {

	private String string;

	public testNgClass(){}
	
	public testNgClass(String strString){
		this.string = strString;
	}
	
	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
}
