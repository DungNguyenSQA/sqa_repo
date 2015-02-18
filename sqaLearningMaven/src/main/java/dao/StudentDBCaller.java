package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import classExercise.StudentInfoOverloadedCnstr;
import dao.SQAConnection;

public class StudentDBCaller {

	/*
	 * CREATE TABLE student_info(
	student_id    INT UNSIGNED  NOT NULL,
    student_name  VARCHAR(50)       NOT NULL DEFAULT '',
    student_zip         int(5)   NOT NULL DEFAULT 00000,
    PRIMARY KEY  (student_id)
);
Insert stmt : 
insert into student_info values(1,'Robert',54354);
insert into student_info values(2,'Jack',54325);
insert into student_info values(3,'Jon',43543);
insert into student_info values(4,'David',65364);
insert into student_info values(5,'Paul',74565);
	 */
	public static void main(String args[]){
		StudentDBCaller dbCaller = new StudentDBCaller();
		dbCaller.readStudentsName();
		dbCaller.addStudents();
		dbCaller.updateStudents();
		dbCaller.readStudents();
	}
	
	public List<String> readStudentsName(){
		List<String> stdNames= null;
		try{
			stdNames = new ArrayList<String>();
			Connection dbConn = SQAConnection.getConnection();
			Statement stmt = dbConn.createStatement();
		      String sql;
		      sql = "SELECT student_name from student_info";
		      ResultSet rs = stmt.executeQuery(sql);
		      while(rs.next()){		    	  			    	  	
		    	  	String name = rs.getString("student_name");
		    	  	//String name = rs.getString(1);
		    	  	System.out.println("name is : "+name);
		    	  	stdNames.add(name);
		      }
		}catch(Exception e){
			e.printStackTrace();
		}
		return stdNames;
	}
	
	public List<StudentInfoOverloadedCnstr> readStudents(){
		List<StudentInfoOverloadedCnstr> studentList = null;
		try{
			studentList = new ArrayList<StudentInfoOverloadedCnstr>();
			Connection dbConn = SQAConnection.getConnection();
			Statement stmt = dbConn.createStatement();
		      String sql;
		      sql = "SELECT * from student_info";
		      ResultSet rs = stmt.executeQuery(sql);
		      while(rs.next()){		    	  	
		    	  	int id = rs.getInt(1);
		    	  	String name = rs.getString("student_name");		    	  	
		    	  	int zip = rs.getInt(3);
		    	  	StudentInfoOverloadedCnstr stdInfo = new StudentInfoOverloadedCnstr(id,name,zip);
		    	  	studentList.add(stdInfo);
		    	  	System.out.println("id is : "+id+", name is : "+name+" and zip is "+zip);
		      }		      
		}catch(Exception e){
			e.printStackTrace();
		}
		return studentList;
	}
	private void addStudents(){
		try{
			Connection dbConn = SQAConnection.getConnection();
			Statement stmt = dbConn.createStatement();
		      String sql;
		      sql = "insert into student_info values(6,'Mike',34534)";
		      int result = stmt.executeUpdate(sql);		      
		      if(result == 1){
		    	  	System.out.println("Records successfully inserted");
		      }else{
		    	  	System.out.println("Error while persisting records");
		      }
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private void updateStudents(){
		try{
			Connection dbConn = SQAConnection.getConnection();
			Statement stmt = dbConn.createStatement();
		      String sql;
		      sql = "update student_info set student_name = 'Mike' where student_id=7";
		      int result = stmt.executeUpdate(sql);		      
		      if(result == 1){
		    	  	System.out.println("Records successfully updated");
		      }else{
		    	  	System.out.println("value of result is : "+result);
		    	  	System.out.println("Error while updating records");
		      }
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
