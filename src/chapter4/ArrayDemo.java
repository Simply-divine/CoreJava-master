package chapter4;

import java.util.Arrays;

public class ArrayDemo {
    private static ArrayDemo arrayDemo[] = new ArrayDemo[1];
    private static int i = 1;
    private ArrayDemo(){
        System.out.println(i + " object Created");
    }

    public static ArrayDemo getInstance(){
        arrayDemo[i-1] = new ArrayDemo();
        arrayDemo = Arrays.copyOf(arrayDemo,++i);
        return arrayDemo[i-1];
    }


    public static void main(String[] args) {
        ArrayDemo demo = ArrayDemo.getInstance();

        ArrayDemo demo1 = ArrayDemo.getInstance();

    }
}
