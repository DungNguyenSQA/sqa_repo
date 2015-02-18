package homeExercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.log4j.Logger;

public class Exe35FileOpsException {

	private static final Logger log = Logger.getLogger(Exe35FileOpsException.class);
	// static because I just need one instantiation of Logger
	
	public static void main(String[] args) {
//	Exercise 35: File Ops and exception handling
//	1.Write a class that writes a file with name of 10 countries in 10 lines.
//	2.If the file already exists then delete the file first.
//	3.Print the name and absolute path of the file once file is written.
//	4.Read the file and print it in the console and also in the log file.
//	Also count and print total number of rows in the file.

		//Create file. Delete if exists.
		File file = new File("/Users/Admin/Test/test1.txt");
		if (file.exists()){
			System.out.println("File exists. Need to delete.");
			log.info("File exists. Need to delete.");
			file.delete();
		}

		//Call write file
		writeFile(file);
		System.out.println("File "+file.getAbsolutePath()+" created");
		log.info("File "+file.getAbsolutePath()+" created");
		
		//Call Read File
		try{
			readFile(file);
		}catch (Exception e){
			System.out.println("Exception caught readFile "+e.getMessage());
			log.info("Exception caught readFile "+e.getMessage());
		}
		
	}
	
	//Write 10 country names in the file on 10 lines
	public static void writeFile(File file){
		BufferedWriter writer = null;
		try{
			writer = new BufferedWriter(new FileWriter(file));
			writer.append("USA\n");
			writer.append("FRANCE\n");
			writer.append("ITALY\n");
			writer.append("MEXICO\n");
			writer.append("CHINA\n");
			writer.append("INDIA\n");
			writer.append("AUSTRALIA\n");
			writer.append("GWANA\n");
			writer.append("SOUTH AFRICA\n");
			writer.append("CANADA\n");			
		}catch(IOException ieo){
			ieo.printStackTrace();
		}finally{
			if (writer != null){
				try{
					writer.flush();
					writer.close();
				}catch (Exception e){
					System.out.println("Can not close the writers"+e.getMessage());
					log.info("Can not close the writers"+e.getMessage());
				}
			}
		}
	}
	
	//Read file
	public static void readFile(File file) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String str = null;
		int i = 0;
		while((str = reader.readLine()) != null){
			System.out.println(str);
			log.info(str);
			i++;
		}
		System.out.println("Number of line read "+i);
		log.info("Number of line read "+i);
	}
}
