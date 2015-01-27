package homeExercise;

/*
 * Write a fruit class that defines 4 constructors:
a)	default constructor
b)	constructor with 1 argument (String name)
c)	constructor with 2 arguments (String name, String taste)
d)	constructor with 3 arguments (String name, String taste, String color);
Only one of the constructor should have the initialization code and rest of 
the constructors should use “this(…)” syntax. From the main method, create 
4 objects one for each constructor type and print the properties after each 
object is created.

 */
public class Exercise10OverloadedCstr {
	
	private String name;
	private String taste;
	private String color;		
	
	//This is default contsr
	public Exercise10OverloadedCstr(){
		//this is redundant step
		this(null,null,null);
		System.out.println("just calling the main constructor from no args const.");
	}
	
	////This is contsr with 1 args.
	public Exercise10OverloadedCstr(String name){
		//this.name = name;
		this(name, null, null);
		System.out.println("just calling the main constructor from 1 args const.");
	}
	
	//This is contsr with 2 args.
	public Exercise10OverloadedCstr(String name, String taste){				
		//instead of doing this
		//this.name = name;
		//this.taste = taste;
		//it will call the overloaded constr. so that initialization code is
		//only at one place and duplication is avoided
		this(name, taste, null);
		System.out.println("just calling the main constructor from 2 args const.");
	}
	
	//This is contsr with 3 args.
	public Exercise10OverloadedCstr(String name1, String taste, String color){
		System.out.println("This is where initialization happens");
		this.name = name1;
		this.taste = taste;
		this.color = color;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {		
		this.name = name;
	}

	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;		
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}	
}
