package homeExercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import classObject.PersonConstructor;

public class Exe22Collection {

	public static void main(String[] args) {

/*		Exercise 22: (Collections) 
		1. ArrayList 
			a. Create a class with main method. 
			b. Define a method arrayListSample() 
			c. Create object of this class inside main 
			method and call arrayListSample() method. 
			d. This method should create 10 objects of 
			circle class. 2 of the object have radius = 
			5; 1 object = null and remaining 7 have 
			different objects. 
		2. HashSet: 
			Repeat the above exercise using HashSet. 
		3. HashMap 
			a. Create a class with main method. 
			b. Define a method hashMapSample() 
			c. Create object of this class inside main 
			method and call hashMapSample() method. 
			d. This method should create 10 objects of 
			Person class. Create a hash map and 
			store these objects in the hash map, ssn 
			of the person should be the key and 
			person object should be the value. 
			e. Write a for loop and print out all the 
			elements of hashmap. 
*/
		//1.ArrayList
		//This Array will have object of class Exe18Circle (extends from Exe18Shape)
		//
		List<Exe18Circle> arrayList = new ArrayList<Exe18Circle>();
		arrayListSample(arrayList);
		
		//2. HashSet: 
		//	Repeat the above exercise using HashSet.
		//
		Set<Exe18Circle> myHashSet = new HashSet<Exe18Circle>();
		hashSetSample(myHashSet);

		//2. HashMap: 
		//Repeat the above exercise using HashSet.
		//This hashMap will have the existing object PersonConstructor from classObject package
		//
		Map<String,PersonConstructor> myHashMap = new HashMap<String,PersonConstructor>();
		hashMapSample(myHashMap);
	}
	
	public static void arrayListSample(List<Exe18Circle> arrayList){
	//	1. ArrayList 
	//		a. Create a class with main method. 
	//		b. Define a method arrayListSample() 
	//		c. Create object of this class inside main 
	//		method and call arrayListSample() method. 
	//		d. This method should create 10 objects of 
	//		circle class. 2 of the object have radius = 
	//		5; 1 object = null and remaining 7 have 
	//		different objects. 
	//
		arrayList.add(new Exe18Circle("Red Circle",5));
		arrayList.add(new Exe18Circle("Blue Circle",5));
		arrayList.add(new Exe18Circle());
		arrayList.add(new Exe18Circle("White Circle",4));
		arrayList.add(new Exe18Circle("Orange Circle",3));
		arrayList.add(new Exe18Circle("Black Circle",2));
		arrayList.add(new Exe18Circle("Green Circle",1));
		arrayList.add(new Exe18Circle("Yellow Circle",1.5));
		arrayList.add(new Exe18Circle());
		arrayList.add(new Exe18Circle("Pink Circle",2.5));

		System.out.println("***************   ArrayList with for   ************");
		for (Exe18Circle element : arrayList){
			System.out.println(element.getName()+" radius="+element.getRadius());
		}
		System.out.println();

		System.out.println("*************** ArrayList with iterator ************");
		Iterator<Exe18Circle> itr = arrayList.iterator();				
		while(itr.hasNext()){
			Exe18Circle element = itr.next();
			System.out.println(element.getName()+" radius="+element.getRadius());
		}			
	}		

	public static void hashSetSample(Set<Exe18Circle> hashSet){
	//	2. HashSet
	//		a. Create a class with main method. 
	//		b. Define a method HashSetSample() 
	//		c. Create object of this class inside main 
	//		method and call arrayListSample() method. 
	//		d. This method should create 10 objects of 
	//		circle class. 2 of the object have radius = 
	//		5; 1 object = null and remaining 7 have 
	//		different objects. 
	//
		hashSet.add(new Exe18Circle("Red Circle",5));
		hashSet.add(new Exe18Circle("Blue Circle",5));
		hashSet.add(new Exe18Circle());
		hashSet.add(new Exe18Circle("White Circle",4));
		hashSet.add(new Exe18Circle("Orange Circle",3));
		hashSet.add(new Exe18Circle("Black Circle",2));
		hashSet.add(new Exe18Circle("Green Circle",1));
		hashSet.add(new Exe18Circle("Red Circle",5));
		hashSet.add(new Exe18Circle());
		hashSet.add(new Exe18Circle("Orange Circle",3));

		System.out.println("***************   HashSet with for   ************");
		for (Exe18Circle element : hashSet){
			System.out.println(element.getName()+" radius="+element.getRadius());
		}
		System.out.println();

		System.out.println("*************** HashSet with iterator ************");
		Iterator<Exe18Circle> itr = hashSet.iterator();				
		while(itr.hasNext()){
			Exe18Circle element = itr.next();
			System.out.println(element.getName()+" radius="+element.getRadius());
		}			
	}		

	public static void hashMapSample(Map<String,PersonConstructor> myHashMap){
//		3. HashMap 
//			a. Create a class with main method. 
//			b. Define a method hashMapSample() 
//			c. Create object of this class inside main 
//			method and call hashMapSample() method. 
//			d. This method should create 10 objects of 
//			Person class. Create a hash map and 
//			store these objects in the hash map, ssn 
//			of the person should be the key and 
//			person object should be the value. 
//			e. Write a for loop and print out all the 
//			elements of hashmap. 

		myHashMap.put("1000",new PersonConstructor("John",1,"1000"));
		myHashMap.put("1001",new PersonConstructor("John",2,"1001"));
		myHashMap.put("1002",new PersonConstructor("John",3,"1002"));
		myHashMap.put("1003",new PersonConstructor("John",4,"1003"));
		myHashMap.put("1004",new PersonConstructor("John",5,"1004"));
		myHashMap.put("1005",new PersonConstructor("John",6,"1005"));
		myHashMap.put("1006",new PersonConstructor("John",7,"1006"));
		myHashMap.put("1007",new PersonConstructor("John",8,"1007"));
		myHashMap.put("1008",new PersonConstructor("John",9,"1008"));
		myHashMap.put("1000",new PersonConstructor("Johny",1,"1000"));

		System.out.println("***************   HashMap with for   ************");
		for (Map.Entry<String,PersonConstructor> entry : myHashMap.entrySet()){
			String key = entry.getKey();
			PersonConstructor person = entry.getValue();			
			System.out.println("Key : "+key+" "+person.getName()+", age "+person.getAge()+", ssn "+person.getSsn());
		}
		System.out.println();

		System.out.println("*************** HashMap with iterator ************");
		Iterator<Entry<String,PersonConstructor>> itr = myHashMap.entrySet().iterator();				
		while(itr.hasNext()){
			Entry<String,PersonConstructor> entrySet = itr.next();
			String key = entrySet.getKey();
			PersonConstructor value = entrySet.getValue();
			System.out.println("Key : "+key+" "+value.getName()+", age "+value.getAge()+", ssn "+value.getSsn());
		}			
	}		
}
