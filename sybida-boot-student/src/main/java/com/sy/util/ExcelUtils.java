package com.sy.util;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;

public class ExcelUtils {
    public static Object getValue(Cell cell) {
        Object value = null;
        if (cell!=null) {
            switch (cell.getCellType()) {
                case STRING:
                    value = cell.getStringCellValue();
                    break;
                case BOOLEAN:
                    value = cell.getBooleanCellValue();
                    break;
                case NUMERIC:
                    //numeric跟decimal同义 用于精确存储数值; 
                    if (DateUtil.isCellDateFormatted(cell)) {
                        value = cell.getDateCellValue();
                    } else {
                        value = cell.getNumericCellValue();
                    }
                    break;
                case FORMULA:
                    //Formula是公式输入方法 
                    value = cell.getCellFormula();
                    break;
                default:
                    break;
            }
            return value;
        }else {
            return value;
        }
    }
}
