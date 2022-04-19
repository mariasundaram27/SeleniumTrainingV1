package Functionalities;

import ObjectRepository.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandler extends TestBase {

    public static Map<String,String> getTestdata(String filepath,String sheetname) throws IOException {

        Map<String,String> testData = new HashMap<>();

        try {
            FileInputStream fileInputStream = new FileInputStream(filepath);
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            XSSFSheet sheet = workbook.getSheet(sheetname);
            int lastRowNo = sheet.getLastRowNum();

            for(int i=0;i<=lastRowNo;i++){
                Row row =sheet.getRow(i);
                Cell keycell = row.getCell(0);
                String key = keycell.getStringCellValue().trim();

                Cell valuecell =row.getCell(1);
                String value =valuecell.getStringCellValue().trim();
                testData.put(key,value);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return  testData;
    }
}
