package chapter6;

import java.io.*;

public class FileReader {
    public static void main(String[] args) throws IOException {
        File file =new File("/home/hardik/IdeaProjects/CoreJava-master/src/chapter6/user.txt");
        if(file.exists()&&file.isFile()&&!file.isHidden()){
            if(file.canRead()){
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int i;
                String name="";
                while(!name.equals("stop")){
                    name=br.readLine();
                    System.out.print(name);
                   // br.mark(3);
                    //br.reset();
                }
            }else{
                try {
                    throw new IOException("Permission to read is not allowed");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        else {
            throw new FileNotFoundException("The file either doesnt exists or is hidden");
        }
    }
}
