package classObject;

public class Person {	
	//Below are the properties/class variable/ instance variable/member variable
	private String name;
	private int age;
	private String ssn;
	//firstName lastName
	private String fullName;
	
	public void setFullName(String firstname, String lastName){
		//do the validation or formating of name
		//this.fullName = firstName + lastName
	}
			
	//This is an example of a function / instance method / behavior of a class
	public void printName(){
		System.out.println("My name is : "+name);
	}	
	
	public void printFormattedSsn(){
		//this method will print out the ssn in format of xxx-xxxx-xx
	}
	
	public static void main(String args[]){		
//		String str = new String();
//		str = "abc";	
		//int[] intArr = new int[4];
		String str = new String("abc");
		
		Person personObject = new Person();
		//Person personObject;
		//personObject = new Person();
		personObject.name = "myName";
		personObject.age = 12;
		personObject.ssn = "243-432-432";
		personObject.printName();
		System.out.println("Age is : "+personObject.age);
		System.out.println("Age is : "+personObject.getAge());
		System.out.println("ssn is : "+personObject.ssn);
		
		Person personObject2 = new Person();
		personObject2.name = "yourName";
		personObject2.age = 54;
		personObject.setAge(54);
		personObject2.ssn = "432-432-4323";
		personObject2.printName();
		System.out.println("Age is : "+personObject2.age);
		System.out.println("ssn is : "+personObject2.ssn);
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
