package homeExercise;

public class Exercise18CircleCaller {
	public static void main(String args[]){
		//It is recommended and good practice to use Type of super class 
		Exercise18Shape myCircle = new Exercise18Circle("blueCircle",5);
		Exercise18Shape myTriangle = new Exercise18Triangle("redTriangle",4,5);
		
		
//		System.out.println("Area of "+myCircle.getName()+" is "+myCircle.getArea());
//		System.out.println("Area of "+myTriangle.getName()+" is "+myTriangle.getArea());
		Exercise18Shape[] shpArr = new Exercise18Shape[]{myCircle, myTriangle};
		
		for(Exercise18Shape sh : shpArr){
			System.out.println("Area of : " +sh.getName() + " is  : "
					+sh.getArea());
		}
	}
}
