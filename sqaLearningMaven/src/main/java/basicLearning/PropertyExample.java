package basicLearning;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyExample {
	
	public static void main(String args[]){
		Properties props = readTestProperties("/Users/prashantnagar/SQAClass/input/input.propeties");
		System.out.println(props.getProperty("INR"));
		System.out.println(props.getProperty("USD"));
		props.setProperty("USD", "abc");
		System.out.println(props.getProperty("USD"));
	}
	
	public static Properties readTestProperties(String fileName) {
		//"/Users/prashantnagar/SQAClass/input/input.propeties"		
		Properties props = new Properties();
		//Properties needs a reader object
		//BufferedReader needs FileReader
		//FileReader needs File object
		//File object needs the complete file path+name;
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
	
	public static String getProperty(String key){
		return "abc";
	}
}
