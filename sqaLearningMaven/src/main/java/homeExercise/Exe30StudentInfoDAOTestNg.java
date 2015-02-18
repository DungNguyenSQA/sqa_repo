package homeExercise;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testNg.TestNgDataProvider;
import classExercise.StudentInfoOverloadedCnstr;
import dao.SQAConnection;

public class Exe30StudentInfoDAOTestNg {

//	Exercise 30: TestNg
//	1.Create a StudentInfo class, which has studentId, studentName and studentZip
//	 as the variable and their getter and setter.
//	
//	2.Write an overloaded constructor that will set all these 3 properties.
//	
//	3.Create a Data Provider Method that return the StudentInfo[][] object array.
//	1.It reads all the rows from student_info table.
//	2.From every row read studentId, studentName and studentZip and create a StudentInfo object.
//	3.Add this object to sudentInfo array.
//	4.Refer the data provider method in your test case and write test cases 
//	to verify student names from array.
//
//	For student_info table:
//	CREATE TABLE student_info(
//		student_id    INT UNSIGNED  NOT NULL,
//	student_name  VARCHAR(50)       NOT NULL DEFAULT '',
//	student_zipint(5)   NOT NULL DEFAULT 00000,
//	    PRIMARY KEY  (student_id));
//
//	Insert stmt :
//	insert into student_info values(1,'Robert',54354);
//	insert into student_info values(2,'Jack',54325);
//	insert into student_info values(3,'Jon',43543);
//	insert into student_info values(4,'David',65364);
//	insert into student_info values(5,'Paul',74565);
	
	
	//1. and 2. done in "classExercise.StudentInfoOverloadedCnstr"
	
	public List<StudentInfoOverloadedCnstr> readStudent(){
		//3.1. Read all the row from student_info table
		List<StudentInfoOverloadedCnstr> stdArr = null;
		
		try {
			stdArr = new ArrayList<StudentInfoOverloadedCnstr>();
			Connection dbConn = SQAConnection.getConnection();
			Statement stmt = dbConn.createStatement();
	
			String sql = "SELECT * from student_info";
		    ResultSet rs = stmt.executeQuery(sql);
		    while(rs.next()){    	
		      	int std_id = rs.getInt("student_id");
		      	String std_name = rs.getNString("student_name");
		      	int std_zip = rs.getInt("student_zipint");
		      	StudentInfoOverloadedCnstr std = new StudentInfoOverloadedCnstr(std_id,std_name,std_zip);
		      	stdArr.add(std);	      	
		    }
		}catch (Exception e){
			e.printStackTrace();			
		}
		return stdArr;
	}
//	@DataProvider(name = "test")
//	public static Object[][] studentInfo() {
//		return new Object[][] { {1, true }, { 6, false }, { 19, true },
//				{ 22, false }, { 23, true } };
//	}
//	
//	@Test(dataProviderClass = TestNgDataProvider.class, dataProvider="test")
//	public void testNg()
}
