package excel;

public class ExcelCaller {
	
	public static void main(String args[]){
		ExcelUtil util = new ExcelUtil();
		util.readFile("/Users/prashantnagar/Dropbox/SQA_Jan-7/excel/testExcel.xlsx");
		util.writeFile("/Users/prashantnagar/Dropbox/SQA_Jan-7/excel/test1.xlsx");
	}
}
