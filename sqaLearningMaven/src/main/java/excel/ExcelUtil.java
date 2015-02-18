package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	public void readFile(String inputPath){
		try{
			FileInputStream fis = new FileInputStream(inputPath);
			XSSFWorkbook book = new XSSFWorkbook(fis);
			XSSFSheet sheet = book.getSheetAt(0);
			int rowNum=sheet.getLastRowNum()+1;
			int colNum=sheet.getRow(0).getLastCellNum();
			String cellVal = "";
			for(int i = 0; i<rowNum; i++){
				XSSFRow row = sheet.getRow(i);
				for(int j=0; j<colNum; j++){
					XSSFCell cell = row.getCell(j);
					final int cellType = cell.getCellType();
					if (cellType == Cell.CELL_TYPE_NUMERIC){
						final double cellValD = cell.getNumericCellValue();
						cellVal = String.valueOf(cellValD);
					}
					else if (cellType == Cell.CELL_TYPE_STRING){
						cellVal = cell.getStringCellValue();		
					}
					System.out.print(cellVal+"|");
				}
				System.out.println();
			}
		}catch(Exception e){
			e.printStackTrace();
		}		
	}

	public void writeFile(String outputPath){
		try{
			File f = new File(outputPath);
			FileOutputStream fos = new FileOutputStream(f);
			XSSFWorkbook book = new XSSFWorkbook();
			XSSFSheet sheet = book.createSheet("Sheet1");
			XSSFRow row = sheet.createRow(0);
			XSSFCell cell = row.createCell(0);
			cell.setCellValue(1);
			XSSFCell cell1 = row.createCell(1);
			cell1.setCellValue("Name");
			XSSFCell cell2 = row.createCell(2);
			cell2.setCellValue(43243);
			book.write(fos);
			fos.flush();
			fos.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
