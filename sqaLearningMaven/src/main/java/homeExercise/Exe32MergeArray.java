package homeExercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exe32MergeArray {

	public static void main(String[] args) {
//		Exercise 32:
//		1.Define 2 integer array
//		a.Arr1 = {345,32,65,24,65,765,242,765,43}
//		b.Arr2 = {3,547,65,243,877,34,98,543,23,32,24}
//		2.Write a function to merge these 2 arrays into 1 array in ascending
//		order and store only unique numbers in it.
//		3.Print the array.

		int[] varArr1 = new int[]{345,32,65,24,65,765,242,765,43};
		int[] varArr2 = new int[]{3,547,65,243,877,34,98,543,23,32,24};

		//Sort the first Array into an array List
		List<Integer> arrlArrayList1 = new ArrayList<Integer>();		
		sortArray(varArr1,arrlArrayList1);
		printArrayL(arrlArrayList1);
		
		System.out.println();
		
		//Sort the second Array into an Array List
		List<Integer> arrlArrayList2 = new ArrayList<Integer>();		
		sortArray(varArr2,arrlArrayList2);
		printArrayL(arrlArrayList2);
		
		//Call to the function mergeTwoArray to merge the two array list
		//into one
		List<Integer> arrlArrayList = new ArrayList<Integer>();		
		mergeTwoArray(arrlArrayList1,arrlArrayList2,arrlArrayList);
		printArrayL(arrlArrayList);		
	}
	
		//This function read the given array of type Int and return an ascending
		//Array List of type Integer
		public static List<Integer> sortArray(int[] varArr, List<Integer> arrlArrayList){
			int i = 0;
			//Read element of array one by one
			for (int element : varArr){
				//loop until end of ArrayList or until an element of it is >
				while ((i<arrlArrayList.size()) && (element > arrlArrayList.get(i))){
					i++;
				}
				if (i>=arrlArrayList.size()){
					//Add number to the end of array list
					arrlArrayList.add(element);
				}else{
					//INSERT number to array list
					arrlArrayList.add(i, element);
				}
				//loop from the beginning of the ArrayList for the
				//next number in the given Array
				i=0;
			}
			return arrlArrayList;
		}
		
		//This function read two ArrayList and merge
		//into one with UNIQUE #
		public static List<Integer> mergeTwoArray(List<Integer> varArrL1, List<Integer> varArrL2, List<Integer> varArrL){
			//First add element of first sort ArrayList to the Result ArrayList
			//make sure not to take the same number
			varArrL.add(varArrL1.get(0));
			for (int element : varArrL1){
				if (varArrL.get(varArrL.size()-1) < element){
					varArrL.add(element);
				}
			}
			//Now add the second list to the result in the same way
			int i = 0;
			for (int element : varArrL2){
				while ((i<varArrL.size()) && (element > varArrL.get(i))){
					i++;
				}
				if (i>=varArrL.size()) {
					varArrL.add(element);					
				}else{
					if (element < varArrL.get(i)){
						varArrL.add(i,element);											
					}
				}
				i=0;
			}			
			return varArrL;
		}
		
		//This function print out an array list of type Integer
		public static void printArrayL(List<Integer> varArrL){
			Iterator<Integer> itr = varArrL.iterator();
			System.out.print("{");
			while(itr.hasNext()){
				int element = itr.next();
				System.out.print(element+" ");
			}
			System.out.println("}");
		}
}
