import java.io.*;
import java.util.ArrayList;

public class SerializationArrayList {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("hardik");
        al.add("aditya");
        al.add("jay");
        File file=new File("/home/hardik/IdeaProjects/CoreJava-master/src/asjdj.txt");
        try {
            FileOutputStream fileOutputStream=new FileOutputStream(file);
            ObjectOutputStream obj1=new ObjectOutputStream(fileOutputStream);
            obj1.writeObject(al);
            fileOutputStream.close();
            obj1.flush();
            obj1.close();
            FileInputStream fin=new FileInputStream(file);
            ObjectInputStream oin=new ObjectInputStream(fin);
            ArrayList a= (ArrayList) oin.readObject();
            a.forEach(l-> System.out.println(l));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
