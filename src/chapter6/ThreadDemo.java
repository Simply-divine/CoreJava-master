package chapter6;

//import java.sql.SQLException;
import java.util.Arrays;

public final class ThreadDemo{

    private ThreadDemo(){

    }
    static void method1() throws ClassNotFoundException {
        //try {

//            if (true) {
                //ThreadDemo m = new ThreadDemo();

                System.out.println(Arrays.toString(Class.forName("chapter4.ArrayDemo").getFields()));
                throw new ClassNotFoundException("I am occuring in method 1");

       //     }
   //     } catch (Exception e) {
     //       System.out.println(e);
        //}
    }

    static void method2() throws ClassNotFoundException{
        method1();
    }

    public static void main(String[] args) throws ClassNotFoundException {
        //try {
            method2();
        //} catch (Exception e) {
        //    e.printStackTrace();
        //}
    }
}
