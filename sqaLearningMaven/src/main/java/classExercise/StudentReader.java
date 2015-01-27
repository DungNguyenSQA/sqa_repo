package classExercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class StudentReader {

	public static void main(String[] args) {

//		Create a studentInfo file with records like : 
//			1=Jack
//			2=Jon
//			3=Robert
//			4=Kim
//			5=Josh
//
//		Write a class StudentReader.java, Write the function 
//		readStudentsFromFile() to read the above created properties file and create student object for every row.
//		Stores all the students in an ArrayList
//		Loop through the arrayList and print the student names
//		Write a main class that will create the object of StudentReader and call the function readStudentsFromFile();		
		
		
		String fileName = "C:\\Users\\Admin\\workspace\\sqaLearningMaven\\src\\main\\java\\classExercise\\studentinfo.properties";
		Properties props = readStudentFromFile(fileName);
		System.out.println(props.getProperty("1"));
		System.out.println(props.getProperty("2"));
		System.out.println(props.getProperty("3"));
		System.out.println(props.getProperty("4"));
		System.out.println(props.getProperty("5"));
		
		List<StudentInfo> studentInfo = new ArrayList<StudentInfo>();
		studentInfo.add(props.getProperty("1"));
		
		
		
		
	}
	
	public static Properties readStudentFromFile(String fileName){
		
		//"C:\\Users\\Admin\\workspace\\sqaLearningMaven\\src\\main\\java\\classExercise\\studentinfo.properties"		
		Properties props = new Properties();		
		File f = new File(fileName);
		BufferedReader reader = null;
		try {			
			FileReader fileReader = new FileReader(f);
			reader = new BufferedReader(fileReader);			
			props.load(reader);					
		} catch (IOException e) {
			e.printStackTrace();		
		} finally {			
			if(reader != null){
				try{
					reader.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		return props;
	}
}
