package classExercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionExercise {

/*
 *Create a class CollectionExercise
 *Create a method testArrayList, in this method:
 *Create object  of ArrayList
 *Add 5 names String  to an ArrayList
 *iterate the List using the for loop and print the names.
 *
 *Create a method testHashSet, in this method:
 *Create an Object of HashSet Class
 *add 5 duplicate names to the Set class .
 *Iterate the Set using for loop and print the names.
 *
 *Create a method testHashMap, in this method:
 *Create an object of HashMap class.
 *Insert the 5 stateCode, StateName into HashMap.
 *Repeat one of the stateCode with different StateName.
 *Iterate the map using for loop and print the codes and name.
 *
 *Call all the above 3 methods from main method.
 */

	public static void main(String[] args){

		testArrayList();
		testHashSet();
		testHashMap();
	}
	
	public static void testArrayList(){
//	Create a method testArrayList, in this method:
//	Create object  of ArrayList
//	Add 5 names String  to an ArrayList
//	iterate the List using the for loop and print the names.
		List<String> myArrList = new ArrayList<String>();
		myArrList.add("Paul");
		myArrList.add("Tara");
		myArrList.add("Robert");
		myArrList.add("Presley");
		myArrList.add("John");		

		System.out.println("******* This is For loop ArrayList.");
		for(String myName : myArrList){
			System.out.println("Name is "+myName);
		}		
		
		//Using an iterator
		Iterator<String> itr = myArrList.iterator();
		System.out.println("******* This is Iterator ArrayList.");
		while(itr.hasNext()){
			String name = itr.next();
			System.out.println("Name using iterator in ArrayList : "+name);
			}			
		}		
	public static void testHashSet(){
		
//	Create a method testHashSet, in this method:
//	Create an Object of HashSet Class
//	add 5 duplicate names to the Set class .
//	Iterate the Set using for loop and print the names.
//
		Set<String> myHashset = new HashSet<String>();
		myHashset.add("John");
		myHashset.add("John");
		myHashset.add("John");
		myHashset.add("John");
		myHashset.add("John");
		
		System.out.println("****** This is For loop HashSet.");
		for (String element : myHashset){
			System.out.println("Name is "+element);			
		}
		
		//Using an iterator
		Iterator<String> setIter = myHashset.iterator();
		System.out.println("******* This is Iterator HashSet.");
		while(setIter.hasNext()){
			System.out.println("Name using iterator in hash  : "+setIter.next());}
		}

	public static void testHashMap(){
		
//	Create a method testHashMap, in this method:
//	Create an object of HashMap class.
//	Insert the 5 stateCode, StateName into HashMap.
//	Repeat one of the stateCode with different StateName.
//	Iterate the map using for loop and print the codes and name.
//
		Map<Integer,String> myHashMap = new HashMap<Integer,String>();
		myHashMap.put(1, "CA");
		myHashMap.put(2, "NV");
		myHashMap.put(3, "OH");
		myHashMap.put(4, "MN");
		myHashMap.put(5, "WA");
		myHashMap.put(2, "OR");
		
		System.out.println("****** This is For loop HashMap.");
		for (Map.Entry<Integer, String> mapIter : myHashMap.entrySet()){
			System.out.println("State Code= "+mapIter.getKey()+", State Name= "+mapIter.getValue());
		}
		
		//Using an iterator
		Iterator<Entry<Integer, String>> mapIter = myHashMap.entrySet().iterator();
		System.out.println("******* This is Iterator HashMap.");
		while(mapIter.hasNext()){
			Entry<Integer,String> entrySet = mapIter.next();
			Integer key = entrySet.getKey();
			String value = entrySet.getValue();
			System.out.println("Using iterator key is :"+key+" and value is : "+value);
		}	
	}
}
