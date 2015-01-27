package homeExercise;

public class Exe19CarException{

/*	Exercise 19 (Exception) 
 *	Write a class CarException. 
 *	Define a method Car[] carStore() that should 
 *	create 10 car objects and store into an array 
 *	and returns that array to caller. 
 *	Define a method void printCars(Car[] cars) 
 *	that prints loops 11 times and print out the 
 *	makes of every car. 
 *	Above method should have a try.. catch block, 
 *	in the catch block throw the exception back to 
 *	caller using throw new... syntax. 
 *	In main method, call carStore() method to get 
 *	array of car then call printCars method. 
 *	Main method should have a try ... catch block 
 *	and in catch block print the message of the 
 *	error. 
 */
	
	public static void main(String[] args){
		// Array[10] object car
		Exe19Car[] carArr = new Exe19Car[10];
	
		carStore(carArr);
	
		try{
			printCars(carArr);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
	
	/*	Define a method Car[] carStore() that should 
	 *	create 10 car objects and store into an array 
	 *	and returns that array to caller.
	 */ 
	public static Exe19Car[] carStore(Exe19Car[] carArray){
		
		Exe19Car myCar = new Exe19Car("Ford",2001,"Blue");
		carArray[0] = myCar;
		myCar = new Exe19Car("Crysler",2002,"Red");
		carArray[1] = myCar;
		 myCar = new Exe19Car("Chevy",2003,"Yellow");
		carArray[2] = myCar;
		myCar = new Exe19Car("Cadillac",2004,"Black");
		carArray[3] = myCar;
		myCar = new Exe19Car("GMC",2005,"White");
		carArray[4] = myCar;
		myCar = new Exe19Car("Toyota",2006,"Pearl");
		carArray[5] = myCar;
		myCar = new Exe19Car("Honda",2007,"Green");
		carArray[6] = myCar;
		myCar = new Exe19Car("Yamaha",2008,"Pink");
		carArray[7] = myCar;
		myCar = new Exe19Car("Suzuki",2009,"Blue");
		carArray[8] = myCar;
		myCar = new Exe19Car("Fiat",2001,"Red");
		carArray[8] = myCar;
		myCar = new Exe19Car("Volvo",2001,"Yellow");
		carArray[9] = myCar;
		
		return carArray;
	}
	
	/*	Define a method void printCars(Car[] cars) 
	 *	that prints loops 11 times and print out the 
	 *	makes of every car. 
	 *	Above method should have a try.. catch block, 
	 *	in the catch block throw the exception back to 
	 *	caller using throw new... syntax.
	 */ 
	public static void printCars(Exe19Car[] carArray) throws Exception{
		int i = 0;
		try{
			for (i = 0; i<=10; i++){
				
				//switch practice
				String rank = "";
				switch (i){
				case 9:
				case 8:
				case 7:
				case 6:
				case 5:
				case 4:
				case 3:
					rank = "th";
					break;
				case 2:
					rank = "rd";
					break;
				case 1:
					rank = "nd";
					break;
				case 0:
					rank = "st";
				}
				
				System.out.println((i+1)+rank+" car is "+carArray[i].getName());
			}
		}catch(Exception e){
			throw new Exception("Error for loop, index="+i);
		}
	}
}
