package testNg;

import java.util.List;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

import dao.StudentDBCaller;

public class TestNgDataProvider {
	Logger log = Logger.getLogger(TestNgDataProvider.class);
	
	@DataProvider(name = "test1")
	public static Object[][] primeNumbers() {
		return new Object[][] { { 2, true }, { 6, false }, { 19, true },
				{ 22, false }, { 23, true } };
	}
	
	@DataProvider(name = "studentInfo")
	public static Object[][] getStudents() {
		return new Object[][] { { 2, true }, { 6, false }, { 19, true },
				{ 22, false }, { 23, true } };
	}
	
	@DataProvider(name = "addInput")
	public static Object[][] getCalcAddData(){
		return new Object[][] {
				{ 2, 2,4}, 
				{3,3,6}, 
				{ 4,4,8}
		};
//		Object[][] add2dArr = new Object[3][3];
//		add2dArr[0][0] = 2;
//		add2dArr[0][1] = 2;
//		add2dArr[0][2] = 4;
//		add2dArr[1][0] = 3;
//		add2dArr[1][1] = 3;
//		add2dArr[1][2] = 6;
//		add2dArr[2][0] = 4;
//		add2dArr[2][1] = 4;
//		add2dArr[2][2] = 8;		
//	}
	
//	@DataProvider(name = "studentDetails")
//	public static Object[][] getStudentData(){
		/*
		 * We are getting a single dimensional array list from the db.
		 * We alredy have a method that return a list of StudentInfo object.
		 * We will call that method to return the list. 
		 */
//		List<StudentInfo> stdList = new StudentDBCaller().readStudents();
		
		/*
		 *Now we need to convert the single dimensional arraylist into a 
		 *2d object array. We do that by defining a 2d array with :
		 * number of rows = size of arrayList
		 * number of columns = 1 (since it is 1d list) 
		 */
//		StudentInfo[][] stdArr = new StudentInfo[stdList.size()][];
//		int i = 0;		
//		for(StudentInfo stdInfo : stdList){
			/*
			 * You start reading individual elements from the list
			 * and populate that at the row. Value will be the array that will 
			 * have one object.This is how you convert a 1d data structure to 2d representation.
			 */
//			stdArr[i] = new StudentInfo[]{stdInfo};
//			i++;
//		}		
//		return stdArr;
	}
}
