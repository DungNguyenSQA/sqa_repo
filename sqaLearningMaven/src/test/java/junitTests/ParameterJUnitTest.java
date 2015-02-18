package junitTests;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static_example.Calculator;


/*
 * Define instance variable for each input you want to pass and one for result
Provide a constructor in class which takes these 3 parameters and assign the values to instance variables
Provide a static  method	which returns	a Collection of objects of array. And annonate the method with @Parameters annotations
Annonate the class with  @RunWith(Parameterized.class)
Write @Test method and provide the logic for test case.

 */
@RunWith(value=Parameterized.class)
public class ParameterJUnitTest {
	String[] abc = new String[4];
	private int operator1;
	private int operator2;
	private int result;

	Calculator calc = new Calculator();

	//This constructor is required to have same number of parameters as your input set
	//defined in @Parameters method. every attribute of the array is mapped to parameter 
	//of this constructor.
	public ParameterJUnitTest(int oper1, int oper2, int result){
		this.operator1 = oper1;
		this.operator2 = oper2;
		this.result = result;
	}

	@Test
	public void addTest(){
		Assert.assertEquals(calc.add(operator1, operator2), result);		
		//Assert.assertEquals(calc.add(2,2), 4);
	}	
			
	@Parameters(name= "{index}{0}{1}{2}")
	public static Collection<Integer[]> getAddData(){
		Integer[][] dataArr = null;
		
		dataArr = new Integer[][]{{2,2, 4},{ 3,3,6 },{ 4,4,8 }};		

//		Integer [] ar1 = new Integer[]{2,2, 4};
//		Integer [] ar2 = new Integer[]{3,3,6};
//		Integer [] ar3 = new Integer[]{4,4,8};
//		dataArr = new Integer[][]{ar1,ar2,ar3};
		//2,2,4
		//3,3,6
		//4,4,8
		//dataArr = readParameterizedDataFromFile();
		
		List<Integer[]> intArrList = Arrays.asList(dataArr);
		//intArrList.get(0) --> Integer[]--> 2,2,4
		//intArrList.get(1) --> Integer[]--> 3,3,6
		printOutArrList(intArrList);
		return intArrList;
	}

	public static void printOutArrList(List<Integer[]> intArrList){
		int index = 0;
		for(Integer[] intArr : intArrList){
			System.out.println("Printing array at index : "+index);
			for(Integer arr : intArr){
				System.out.print(arr);
				System.out.print("-");
			}
			index++;
			System.out.println();
		}
	}
}