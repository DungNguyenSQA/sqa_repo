package classObject;

public class PersonCaller {
	public static void main(String args[]){
		//Calling PersonObject
//		Person personObject = new Person();		
//		personObject.setName("myName");
//		personObject.setAge(12);
//		personObject.setSsn("243-432-432");
//		personObject.printName();
//		System.out.println("Age is : "+personObject.getAge());
//		System.out.println("Age is : "+personObject.getAge());
//		System.out.println("ssn is : "+personObject.getSsn());
//		
//		Person personObject2 = new Person();
//		personObject2.setName("yourName");
//		personObject2.setAge(54);		
//		personObject2.setSsn("432-432-4323");
//		personObject2.printName();
//		System.out.println("Age is : "+personObject2.getAge());
//		System.out.println("ssn is : "+personObject2.getSsn());
//
//		//Calling PersonConstructor
//		PersonConstructor pc = new PersonConstructor();
//		System.out.println("Default value for age is : "+pc.getAge());
		
		//Calling overloaded constructor
		System.out.println("Creating objects with overloaded constructors *****");
		//Calling the default consturctor.
		OverloadedConstructor oc0 = new OverloadedConstructor();
		System.out.println("name from default const. : "+oc0.getName());
		
		OverloadedConstructor oc = new OverloadedConstructor("myName",23,"432-54-5435");			
		oc.printName();
		System.out.println("Age is : "+oc.getAge());			
		
		OverloadedConstructor oc2 = new OverloadedConstructor("yourName",534);			
		oc2.printName();
		System.out.println("Age is : "+oc2.getAge());			
	}
}
