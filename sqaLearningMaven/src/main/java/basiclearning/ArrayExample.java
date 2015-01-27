package basiclearning;

public class ArrayExample {

	public static void main(String[] args) {
		//We define and instantiate the int array object with size 3
		int[] intArr = new int[3];
		//We start populating individual array elements with values
		intArr[0] = 456;
		intArr[1] = 54;
		intArr[2] = 23;
		
		//Another way to define, instantiate and initialize the array
		int[] anotherArr = new int[]{90,23,76,32,754,2432,543};
		
		//We read the individual array elements
		int secondIndex  = intArr[1];
		System.out.println("Value at 1st index is : "+intArr[0]);
		System.out.println("Value at 2nd index is : "+secondIndex);

		secondIndex  = anotherArr[1];
		System.out.println("Value at 1st index is : "+anotherArr[0]);
		System.out.println("Value at 2nd index is : "+secondIndex);
		System.out.println("Value at 1st index is : "+anotherArr[4]);
		System.out.println("Value at 2nd index is : "+anotherArr[5]);
		
		//We loop through the lenght of array and read every element
		for (int i=0; i<intArr.length; i++){
			System.out.println("Value at "+i+" index is : "+intArr[i]);
		}
		
		//populate the array
		for (int i=0; i<anotherArr.length; i++){
			anotherArr[i] = i+10;
		}
		
		System.out.println("....Printsize");
		printSize(intArr);
		System.out.println("....printElement");
		printElement(intArr[0]);
		System.out.println("....printVal");
		printVal(intArr);
	}
	
	public static void printSize(int[] inputArr){
		System.out.println("Size of the array is : "+inputArr.length);
	}
		
	public static void printElement(int ele){
		System.out.println("Value of element is : "+ele);
	}
	
	public static void printVal(int[] inputarr){
		for (int arrValue : inputarr){
			System.out.println("Value is : "+arrValue);
		}
	}
	
}
