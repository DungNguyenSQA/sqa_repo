package classExercise;

public class FlowerComparison {

	public static void main(String[] args) {

		/*
		 * Create a class “FlowerEquals” with properties:
		 *	Name
		 *	Color
		 *  Season
		 *	Overloaded constructor that takes “name”, “color” and “season” as parameter
		 *	Write the getter and setters of these properties.
		 *	Generate “equals” and “hashcode” method using Name and Color properties.
		 *	Write a differentClass “FlowerComparision” and define a main method in it.
		 *	In method create 5 obejcts of FlowerEquals.
		 *		1 - Rose, Red, Summer
		 *		2- Rose, White, Summer
		 *		3- Rose, Yellow, Summer
		 *		4- Rose, Red, Summer
		 *		5 - Lotus, white, Summer.
		 *	Compare objects 1 and 2, 1 and 3, 1 and 4, 1 and 5, 2 and 3, 2 and 4,
		 *	2 and 5, 3 and 4, 3 and 5, 4 and 5.
		 */
		
		
		//Create 5 objects of FlowerEquals
		FlowerEquals flowerEq1 = new FlowerEquals("Rose","Red","Summer");
		FlowerEquals flowerEq2 = new FlowerEquals("Rose","White","Summer");
		FlowerEquals flowerEq3 = new FlowerEquals("Rose","Yellow","Summer");
		FlowerEquals flowerEq4 = new FlowerEquals("Rose","Red","Summer");
		FlowerEquals flowerEq5 = new FlowerEquals("Lotus","White","Summer");
		
		//Compare
		System.out.println("1 and 2 = "+flowerEq1.equals(flowerEq2));
		System.out.println("1 and 3 = "+flowerEq1.equals(flowerEq3));
		System.out.println("1 and 4 = "+flowerEq1.equals(flowerEq4));
		System.out.println("1 and 5 = "+flowerEq1.equals(flowerEq5));
		System.out.println("2 and 3 = "+flowerEq2.equals(flowerEq3));
		System.out.println("2 and 4 = "+flowerEq2.equals(flowerEq4));
		System.out.println("2 and 5 = "+flowerEq2.equals(flowerEq5));
		System.out.println("3 and 4 = "+flowerEq3.equals(flowerEq4));
		System.out.println("3 and 5 = "+flowerEq3.equals(flowerEq5));
		System.out.println("4 and 5 = "+flowerEq4.equals(flowerEq5));
		
		
	}

	public static FlowerEquals createFlowerEq(String name,String color,String season){
		FlowerEquals flowerEq = new FlowerEquals(name,color,season);
		return  flowerEq;
	}
}
