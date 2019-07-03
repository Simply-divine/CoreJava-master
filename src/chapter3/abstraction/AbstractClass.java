package chapter3.abstraction;

/*
 * Abstract class is not fully hidden.
 *
 * it will be hidden from 0 to 100%.
 *
 * abstract keyword is used for declaring abstract method and it is forcefully implemented in each child class
 * */
interface Methods {
    /*
     * meth mothod is abstract(no body method)
     * */
     void meth ();
    //private int d;
    /**
     * power method n^pow
     *
     * @param n   takes number
     * @param pow exponential power of the given number
     * @return returns the power of the given number
     */

}

public class AbstractClass{
    public static void main (String[] args) {
        Methods m = () -> {
            System.out.println("hello");
        };
        m.meth();
        // m.meth();
    //    System.out.println(m.power(10, 5));
    }

}
