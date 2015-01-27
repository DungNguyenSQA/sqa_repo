package homeExercise;

/*
 * Create a vehicle class. Properties : String color, int make and String model. 
 * Write a default constructor that initializes these properties to color=blue, 
 * make=VW, model=2015. Write a main method that creates the object by passing 
 * these values. Print the values of the properties after the object is created
 */
public class Exercise9ClassObject {

	//These are member variables/instance variables/properties
	private String strColor;
	private String strMake;
	private int intModel;

	//This is a constructor
	public Exercise9ClassObject(){		
		strColor="Blue";
		strMake="VW";
		intModel=2015;
	}
	
	//All the below methods are getters and setters
	public String getStrColor() {
		return strColor;
	}

	public void setStrColor(String strColor) {
		this.strColor = strColor;
	}

	public String getStrMake() {
		return strMake;
	}

	public void setStrMake(String strMake) {
		this.strMake = strMake;
	}

	public int getIntModel() {
		return intModel;
	}

	public void setIntModel(int intModel) {
		this.intModel = intModel;
	}	
	
	public static void main(String args[]){
		Exercise9ClassObject vm=new Exercise9ClassObject();
		//String str = new String("abc");
		System.out.println(vm.getStrColor());
		System.out.println(vm.getStrMake());
		System.out.println(vm.getIntModel());
	}
}