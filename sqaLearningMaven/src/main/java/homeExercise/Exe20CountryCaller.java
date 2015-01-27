package homeExercise;

public class Exe20CountryCaller {

	public static void main(String[] args) {
	/*	Exercise 20:  (Equals) 
	 *	1.Write a class Country 
	 *	2.Properties String countryCode, String 
	 *	countryName, long population, String 
	 *	currency. 
	 *	3.Define overloaded constructor that takes all 
	 *	these arguments as parameter and sets all the 
	 *	properties. 
	 *	4.Write a CountryCaller and a main method. 
	 *	5.Create two-two country objects for each of the 
	 *	below country: Canada, America, Italy, Spain, 
	 *	England. Use 3 letters code for these countries 
	 *	and set other properties while creating 
	 *	objects 
	 *	6. Compare the same country objects with each 
	 *	other and print out the results. 
	 *	7.Implement the equals and hashcode using 
	 *	countryCode as criteria. 
	 *	8.Repeat step 6.
	*/

		Exe20Country Country1 = new Exe20Country("CAN","CANADA",50000000,"CAD");
		Exe20Country Country2 = new Exe20Country("CAN","CANADA",50000000,"CAD");
		Exe20Country Country3 = new Exe20Country("USA","AMERICA",100000000,"USD");
		Exe20Country Country4 = new Exe20Country("USA","AMERICA",100000000,"USD");
		Exe20Country Country5 = new Exe20Country("ITY","ITALY",60000000,"EUR");
		Exe20Country Country6 = new Exe20Country("ITY","ITALY",60000000,"EUR");
		Exe20Country Country7 = new Exe20Country("SPA","SPAIN",70000000,"EUR");
		Exe20Country Country8 = new Exe20Country("SPA","SPAIN",70000000,"EUR");
		Exe20Country Country9 = new Exe20Country("UNK","ENGLAND",40000000,"UKP");
		Exe20Country Country10 = new Exe20Country("UNK","ENGLAND",40000000,"UKP");
		
		
		/*	6. Compare the same country objects with each 
		 *	other and print out the results. 
		 *	7.Implement the equals and hashcode using 
		 *	countryCode as criteria. 
		 *	8.Repeat step 6.
		 */
		System.out.println("1 and 2 = "+Country1.equals(Country2));
		System.out.println("3 and 4 = "+Country3.equals(Country4));
		System.out.println("5 and 6 = "+Country5.equals(Country6));
		System.out.println("7 and 8 = "+Country7.equals(Country8));
		System.out.println("9 and 10 = "+Country9.equals(Country10));
	}

}
