package com.sy.dto.util;



import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.sy.dto.StudentExcel;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class ExcelUtil {
    public static void writeExcel(HttpServletResponse response, List<StudentExcel> list) throws IOException {
        ExcelWriter excelWriter = EasyExcel.write(response.getOutputStream()).build();
        WriteSheet sheet = EasyExcel.writerSheet(0, "sheet").head(StudentExcel.class).build();
        //往表格里面写数据
        excelWriter.write(list, sheet);
        //关闭输出流
        excelWriter.finish();
    }
}
