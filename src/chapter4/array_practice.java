package chapter4;
import java.util.Arrays;

public class array_practice {
    private static array_practice array[]= new array_practice[1];
    static int i=1;
 private array_practice(){
     System.out.println("the object "+i+" is created");
 }
 public array_practice getinstance(){
     array[i-1]=new array_practice();
     i++;
     return array[i-1];
 }



    public static void main(String[] args) {
        int data=100;
        Integer data2 = 0;
        Integer s = data;
        //System.out.println(s.compareTo(data2));

        //System.out.println(s instanceof Integer);
        Double d =  (0.001*10+0.002*10)/10 ;
        System.out.println(d.intValue());

    }
}
