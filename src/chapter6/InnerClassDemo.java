package chapter6;

interface DemoDer{

    void display();
    interface First{
        void display(String msg);
    }
}


class Demo implements DemoDer.First{
    static int count=0;
   static class Demo2{

   }

   Demo(){
       System.out.println("Demo called"+(count++));
   }


   public void display(String msg){
       String mymsg = msg;
       class displaydata{
           displaydata(){
               System.out.println("Display Data called"+(count++));
           }
           public void display(String msg){
               System.out.println("Inner Class-> "  + msg+(count++));
           }
       }
       displaydata d = new displaydata();
       d.display("Method Msg -> " + mymsg);
   }


   class Demo3{

   }
}



public class InnerClassDemo {
    public static void main(String[] args) {
       // Demo.Demo3 dfsd= new Demo().new Demo3();
       // Demo.Demo2 dfsds = new Demo.Demo2();

        DemoDer.First sumit = new Demo();
        sumit.display("I am sumit.");
    }
}
