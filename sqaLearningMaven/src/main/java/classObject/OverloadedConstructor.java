package classObject;

public class OverloadedConstructor {
	//Below are the properties/class variable/ instance variable/member variable		
	private String name;		
	private int age;
	private String ssn;

	public OverloadedConstructor(){
		//this(String,int,String);
		this("abc",12,"432-4323-43");
//		this.name="abc";
//		this.age=12;
//		this.ssn="432-4323-43";		
	}

	//this(String,int,String)
	public OverloadedConstructor(String name, int age, String ssn){
		this.name = name;
		this.age = age;
		this.ssn = ssn;
	}

	public OverloadedConstructor(String name, int age){
		this(name,age,null);
		//this.name=name;
		//this.age=age;		
	}		

	public OverloadedConstructor(String name){
		this(name,0,null);		
	}

	//This is an example of a function / instance method / behavior of a class
	public void printName(){
		System.out.println("My name is : "+name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}		
}
