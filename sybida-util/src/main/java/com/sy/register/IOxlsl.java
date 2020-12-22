package com.sy.register;

import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class IOxlsl {
    public static File file(MultipartFile f){
        File file = new File("E:\\upload\\download\\Copy.xlsx");
        try {
            FileUtils.copyInputStreamToFile(f.getInputStream(), file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public static void deleteFile(){
        File file = new File("E:\\upload\\download\\Copy.xlsx");
        file.delete();
    }
}
