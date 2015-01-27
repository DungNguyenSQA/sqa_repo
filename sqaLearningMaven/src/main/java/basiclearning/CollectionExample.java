package basiclearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CollectionExample {

	//private List<String> myArrList;
	//private Set<Integer> myHashSet;	
	//private Map<String,String> myHashMap;

	public static void main(String args[]){
		CollectionExample myCollections = new CollectionExample();
		//myCollections.arrayListExample();
		//myCollections.hashSetExample();
		myCollections.hashMapExample();;		
	}
	
	/*
	 * ArrayList class is a member of the Java Collections Framework.
	 * Its a dynamic array, Accessed using indexes and allows Null
	 */
	public void arrayListExample(){
		//instantiate the object of type ArrayList of type String
		List<String> myArrList = new ArrayList<String>();
		//myArrList = new ArrayList<Circle>():
		//start inserting data into Arraylist
		String str = "red";
		//Circle cir = new Circle("myCir",5);
		//myArrList.add(cir);
		myArrList.add(str);
		//myArrList.add(432);
		//myArrList.add(new Circle("myCir",5));
		myArrList.add("blue");
		myArrList.add("green");
		myArrList.add("yellow");
		myArrList.add("blue");		

		//Read through the arrayList
		System.out.println("Size of my array list is : "+myArrList.size());
		System.out.println("2nd element of my arraylist is : "+myArrList.get(1));		
		
		for(String myColor : myArrList){			
			System.out.println("Color is "+myColor);
		}		
		
		/*
		 * for(int i=0; i<myArrList.size(); i++){
		 * 	String myColor = myArrList.get(i);
		 * 	System.out.println("Color is "+myColor);
		 * }
		 */

		//Using an iterator
		Iterator<String> itr = myArrList.iterator();				
		while(itr.hasNext()){
			String color = itr.next();
			System.out.println("Color using iterator : "+color);
			if(color.equalsIgnoreCase("blue")){
				itr.remove();
			}			
		}		
		System.out.println("Size of my array list after iterator is : "+myArrList.size());
	}
	
	public void hashSetExample(){
		//instantiate the object of HashSet of type Integer
		//Integer is the wrapper class for int data type
		Set<Integer> myHashSet = new HashSet<Integer>();

		//populate HashSet
		boolean result = false;
		result = myHashSet.add(100);
		result = myHashSet.add(250);
		result = myHashSet.add(null);
		result = myHashSet.add(-100);
		result = myHashSet.add(null);
		result = myHashSet.add(300);
		myHashSet.add(100);

		System.out.println("size of hashset is : "+myHashSet.size());

		//loop through the hashset		
		for(Integer myInt : myHashSet){
			System.out.println("Integer from loop is "+myInt);
		}
		
		//Can't use old for loop
//		for(int i=0; i<myHashSet.size(); i++){
//			Integer setElemet = myHashSet.get(i);
//		}
		
		//use iterator
		Iterator<Integer> setItr = myHashSet.iterator();
		while(setItr.hasNext()){			
			System.out.println("Integer from iterator is : "+setItr.next());			
		}		
	}
	
	public void hashMapExample(){
		//Set<Integer> myHashSet = new HashSet<Integer>();		
		Map<String,String> myHashMap = new HashMap<String,String>();
		myHashMap.put("INR","Indian Rupee");
		myHashMap.put("USD","United States Dollar");
		myHashMap.put("YEN","Japanese Yen");
		myHashMap.put("Dinar","Dubai Dinar");
		myHashMap.put("YEN","Japanese Yen2");
//"name-Joe","age-34","country-India"
		System.out.println("Reading directly using key age: "+myHashMap.get("age"));
		System.out.println("Reading directly using key YEN: "+myHashMap.get("YEN"));
		
		
//		for(Integer myInt : myHashSet){
//			System.out.println("Integer from loop is "+myInt);
//		}
		
		for(Map.Entry<String, String> entry : myHashMap.entrySet()){
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key is :"+key+" and value is : "+value);
		}

		Iterator<Entry<String,String>> mapItr = myHashMap.entrySet().iterator();
		while(mapItr.hasNext()){
			Entry<String,String> entrySet = mapItr.next();
			String key = entrySet.getKey();
			String value = entrySet.getValue();
			System.out.println("Using iterator key is :"+key+" and value is : "+value);
		}
	}
}
