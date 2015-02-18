package junitTests;

public class ReadParamDataFromFile {

//	private static Integer[][] readParameterizedDataFromFile(){
//	String filePath = "mypath of file";
//	//read the file using while loop....
//	//read each row, conver into String[]
//	//Read each item from String[] and convert to Integer
//	//Assign each integer to new int array.
//	//Add that array to main 2 d array
//	//return that array
//	BufferedReader reader = null;
//	Integer[][] calc2dArr = new Integer[3][3];
//	try{
//		File empFile = new File("/Users/prashantnagar/Dropbox/SQA/FileInput/ParameterizedCalcTestInput.txt");			
//		FileReader fileReader = new FileReader(empFile);
//		reader = new BufferedReader(fileReader);
//		String calcRow = null;
//		//Start reading the input file.
//		int i=0;			
//		while((calcRow=reader.readLine()) != null){
//			//Split each row by "," to get String array
//			String[] strCalcArr = calcRow.split(",");
//			int operator1 = Integer.parseInt(strCalcArr[0]);
//			int operator2 = Integer.parseInt(strCalcArr[1]);
//			int result = Integer.parseInt(strCalcArr[2]);				
//			calc2dArr[i][0]=operator1;
//			calc2dArr[i][1]=operator2;
//			calc2dArr[i][2]=result;
//			i++;
//		}
//	}catch(Exception e){
//		e.printStackTrace();
//	}finally{
//		try{if(reader != null) reader.close();}catch(Exception e){}
//	}
//	return calc2dArr;
//}}
}