package chapter6;

import java.io.IOException;

public class FileWriter {

    public static void main(String[] args) throws IOException {
            try {
                java.io.FileWriter fileWriter = new java.io.FileWriter("/home/hardik/IdeaProjects/CoreJava-master/src/chapter6/user.txt",true);
                fileWriter.append("welcome to javatpoint");
                fileWriter.flush();
                fileWriter.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("success");
            }
    }
}
