package chapter4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExample {
    private int data[] = new int[5];

    public int[] getData() {
        System.out.println("Data print");
        for (int a:data) {
            System.out.println(a);
        }
        System.out.println("Data over");
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int data[] = {1,2,3,4,5}, data1[] = new int[5];
        arrayExample.setData(data);
        System.out.println(Arrays.toString(arrayExample.getData()));

        for (int i = 0; i < data1.length; i++) {
            data1[i] = i + 10;
        }
        arrayExample.setData(data1);
        System.out.println(Arrays.toString(arrayExample.getData()));


        data = Arrays.copyOf(data1,data.length + 10);

        arrayExample.setData(data);
        System.out.println(Arrays.toString(arrayExample.getData()));

    }
}

