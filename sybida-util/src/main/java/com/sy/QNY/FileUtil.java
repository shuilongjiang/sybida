package com.sy.QNY;

public class FileUtil {
    // 图片允许的后缀扩展名
    public static String[] IMAGE_FILE_EXTD = new String[] { "png", "bmp", "jpg", "jpeg","pdf","xlsx","xls" };
    public static String[] IMAGE_FILE_EXTD1 = new String[] { "png", "bmp", "jpg", "jpeg"};
    public static String[] IMAGE_FILE_EXTD2 = new String[] { "pdf"};
    public static String[] IMAGE_FILE_EXTD3 = new String[] { "xlsx","xls"};
    public static boolean isFileAllowed(String fileName) {
        for (String ext : IMAGE_FILE_EXTD) {
            if (ext.equals(fileName)) {
                return true;
            }
        }
        return false;
    }
    public static boolean isFileAllowed(String fileName,String[] file) {
        for (String ext : file) {
            if (ext.equals(fileName)) {
                return true;
            }
        }
        return false;
    }
}