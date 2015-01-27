package basiclearning;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyExample {
	
	public static void main(String args[]){
		//Properties props = readTestProperties("/Users/prashantnagar/SQAClass/input/input.propeties");
		Properties props = readTestProperties("c:\\Users\\admin\\desktop\\desktop.ini");
		//System.out.println(props.getProperty("INR"));
//		LocalizedResourceName=@%SystemRoot%\system32\shell32.dll,-21769
//		IconResource=%SystemRoot%\system32\imageres.dll,-183
		System.out.println(props.getProperty("LocalizedResourceName"));
//		props.setProperty("USD", "abc");
		System.out.println(props.getProperty("IconResource"));
	}
	
	public static Properties readTestProperties(String fileName) {
		//"/Users/prashantnagar/SQAClass/input/input.propeties"		
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
	
	public static String getProperty(String key){
		return "abc";
	}
}
