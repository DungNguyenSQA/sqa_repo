package homeExercise;

import java.util.List;
import java.util.ArrayList;

public class Exe21CountryArray {

	public static void main(String[] args) {

/*	Exercise 21: (Equals) 
 *	1. Use the same objects that you created in 
 *	Exercise 20 and store them into an array. 
 *	2. Write a program that will check the objects 
 *	within this array and only store the unique 
 *	objects into a new array. 
 *	3.Print out the new array. 
*/			
		Exe20Country[] countryArray = new Exe20Country[10];
		countryArray[0] = new Exe20Country("CAN","CANADA",50000000,"CAD");
		countryArray[1] = new Exe20Country("CAN","CANADA",50000000,"CAD");
		countryArray[2] = new Exe20Country("USA","AMERICA",100000000,"USD");
		countryArray[3] = new Exe20Country("USA","AMERICA",100000000,"USD");
		countryArray[4] = new Exe20Country("ITY","ITALY",60000000,"EUR");
		countryArray[5] = new Exe20Country("ITY","ITALY",60000000,"EUR");
		countryArray[6] = new Exe20Country("SPA","SPAIN",70000000,"EUR");
		countryArray[7] = new Exe20Country("SPA","SPAIN",70000000,"EUR");
		countryArray[8] = new Exe20Country("UNK","ENGLAND",40000000,"UKP");
		countryArray[9] = new Exe20Country("UNK","ENGLAND",40000000,"UKP");
		
		//Create the new array
		List<Exe20Country> countryArrayList = new ArrayList<Exe20Country>();
		//Call the method
		CheckUnique(countryArray,countryArrayList);
		
		//Print the initial array
		System.out.println("************ Starting Array *************");
		for (Exe20Country elmt : countryArray){
			System.out.print(elmt.getCountryName());
			System.out.print(" ("+elmt.getCountryCode()+") ");
			System.out.print(" has a population of "+elmt.getPopulation());
			System.out.println(", its currency is "+elmt.getCurrency());
		}
		
		//Print the arrayList
		System.out.println();
		System.out.println("*************** New Array ***************");
		for (Exe20Country element : countryArrayList){
			System.out.print(element.getCountryName());
			System.out.print(" ("+element.getCountryCode()+") ");
			System.out.print(" has a population of "+element.getPopulation());
			System.out.println(", its currency is "+element.getCurrency());
		}
	}
	
	public static void CheckUnique(Exe20Country[] countryArray,List<Exe20Country> countryArrayList){		
	/*	2. Write a program that will check the objects 
	 *	within this array and only store the unique 
	 *	objects into a new array.
	 */ 
		// For each element of the old array
		for (Exe20Country element : countryArray){
			int i=0;
			boolean found = false;
			//Look into each element of the new array until
			//the index is >= size of array AND element not found
			while ((i < countryArrayList.size()) && (!found)){
				if (element.equals(countryArrayList.get(i))){
					found = true;
					//Element found in the new array, we stop the
					//while loop, and start again the comparison
					//with the next element of the old array
				}
				i++;
			}
			//If element not found in the new array then store it in
			if (!found){
				countryArrayList.add(element);
			}
		}		
	}
}
