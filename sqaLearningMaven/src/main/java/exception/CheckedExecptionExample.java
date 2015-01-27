package exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CheckedExecptionExample {
	
	public static void main(String args[]){
		
		try{
			readFile();
		}catch(Exception e){
			System.out.println("Exception caught");
		}		
		writeFile();			
	}
	
	//This is delegating the checked exception to caller. To delegate you have to explicitly
	//call the throws Exception code.
	public static void readFile() throws FileNotFoundException, IOException{
		File file = new File("abc");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String str = null;
		while((str = reader.readLine()) != null){
			System.out.println("Line is : "+str);
		}
	}
	
	public static void writeFile(){
		File file = new File("abc");
		BufferedWriter writer = null;
		try{
			writer = new BufferedWriter(new FileWriter(file));
			writer.append("data1");			
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			if(writer != null){
				try{
					writer.flush();
					writer.close();
				}catch(Exception e){
					System.out.println("Can not close the writers"+e.getMessage());
				}
			}
		}
	}
}
