package homeExercise;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import dao.SQAConnection;

public class Exe29SQL {

	public static void main(String[] args){
//	Exercise 29: SQL
//	•Country table country_name, country_code (top 50 countries)
//	•Olympics table – event_year, country_code (start from 1980)
//	•List all of the country names that have not hosted Olympics.
//	•List all of the country name that have hosted Olympics.
//	•List name of the country that have hosted Olympics after 1996;

		try{
			Connection dbConn = SQAConnection.getConnection();
			Statement stmt = dbConn.createStatement();

			String sql;
			sql = "SELECT country_name from Country, Olympics where Country.country_code not in Olympics ";
		    ResultSet rs = stmt.executeQuery(sql);
		    while(rs.next()){		    	  			    	  	
		      	String name = rs.getString("country_name");
		      	//String name = rs.getString(1);
		      	System.out.println("Country name is : "+name);
		    }
		}catch (Exception e){
			e.printStackTrace();			
		}		
	}
}
