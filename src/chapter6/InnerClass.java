package chapter6;
interface i1{
    void display();
    interface i2{
        public void display(String msg);
    }
}
class Class1 implements i1.i2{

    Class1(){
        System.out.println("class1 called..");
    }
    public void display(String msg) {
     class Class3{
         Class3(){
                System.out.println("class 3");
            }
         void display(String msg){
             System.out.println("Message: "+msg);
         }
        }
        Class3 class3=new Class3();
        class3.display(msg);
    }

    static class Class2{
Class2(){
    System.out.println("this is class2");
}
    }

}

public class InnerClass {
    public static void main(String[] args) {
        Class1.Class2 gh=new Class1.Class2();
        Class1.Class2 ss=new Class1.Class2();
        i1.i2 hardik=new Class1();
        hardik.display("hardik is the greatest");
    }


}
