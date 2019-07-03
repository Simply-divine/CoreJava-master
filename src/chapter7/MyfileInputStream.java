package chapter7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyfileInputStream {
    public static void main(String[] args) throws IOException {
        String path = "/home/hardik/IdeaProjects/CoreJava-master/src/chapter7/txt/Data.txt";
        try {
            File file = new File(path);
            if (file.exists()) {
                int i = 0;
                FileInputStream fileInputStream = new FileInputStream(file);
                if (file.isFile() && file.canRead() && !file.isHidden()) {
                    while ((i = fileInputStream.read()) != -1) {
                        System.out.println((char) i);
                    }
                } else {
                    throw new IOException("file permissihon denied");
                }
                fileInputStream.close();
            } else {
                throw new FileNotFoundException();
            }

        }catch (Exception e){
            System.out.println("file reading error: "+e.getMessage());
        }
    }
}
