package com.sy.register;

import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class IOxlsl {
//    public static StringBuffer IO(String s){
//        String filePath= s;
//        StringBuffer sb = new StringBuffer();
//        File file=new File(filePath);
//        BufferedReader reader = null;
//        String tempString = null;
//        int line =1;
//        try {
//            reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"GBK"));
//            while ((tempString = reader.readLine()) != null) {
//               sb.append(tempString);
//            }
//            reader.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally{
//            if(reader != null){
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return sb;
//    }


    public static File file(MultipartFile f){
        File file = new File("E:\\youku\\img\\Copy.xlsx");
        try {
            FileUtils.copyInputStreamToFile(f.getInputStream(), file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
//        StringBuffer sb = new StringBuffer();
//        BufferedReader reader = null;
//        String tempString = null;
//        int line =1;
//        try {
//            reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"GBK"));
//            while ((tempString = reader.readLine()) != null) {
//                sb.append(tempString);
//            }
//            reader.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally{
//            if(reader != null){
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return sb;
    }
}
