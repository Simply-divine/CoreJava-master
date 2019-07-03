package chapter7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
class Date{
    private int month,date,year;
    Date(int month, int date, int year){
        this.month = month;
        this.date = date;

        this.year = year;
    }
}

public class ObjectStream {

    public static void main(String[] args) throws IOException {
        File file=new File("/home/hardik/IdeaProjects/CoreJava-master/src/chapter7/txt/Data1.txt");
        FileOutputStream fout=new FileOutputStream(file);
     ObjectOutputStream o=new ObjectOutputStream(fout);
     Date d=new Date(7,9,2019);
     try {
         o.writeObject(d);
     }catch (Exception e){
         e.getMessage();
     }


    }
}
