package homeExercise;

public class Exe10FruitOverloadedCnstr {

//		Overloaded constructor: Write a fruit class that defines 4 constructors: 
//		a)	default constructor 
//		b)	constructor with 1 argument (String name) 
//		c)	constructor with 2 arguments (String name,String taste) 
//		d)	constructor with 3 arguments (String name,String taste, String color); 
//		Only one of the constructor should have the initialization code and rest of the constructors 
//		should use �this(...)� syntax. 
//		From the main method, create 4 objects one for each constructor 
//		type and print the properties after each object is created. 

	private String strName;
	private String strTaste;
	private String strColor;
	
	public Exe10FruitOverloadedCnstr(){
		this("Apple","Ok","Red");
	}
	public Exe10FruitOverloadedCnstr(String strName){
		this(strName,null,null);
	}
	public Exe10FruitOverloadedCnstr(String strName, String strTaste){
		this(strName,strTaste,null);
	}
	public Exe10FruitOverloadedCnstr(String strName, String strTaste, String strColor){
		this.strName = strName;
		this.strTaste = strTaste;
		this.strColor = strColor;
	}
	
	
	public String getStrName(){
		return strName;
	}
	public void setStrName(String strName){
		this.strName = strName;
	}
	
	public String getStrTaste(){
		return strTaste;
	}
	public void setStrTaste(String strTaste){
		this.strTaste = strTaste;
	}
	
	public String getStrColor(){
		return strColor;
	}
	public void setStrColor(String strColor){
		this.strColor = strColor;
	}
}
