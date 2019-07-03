import chapter7.User;

public class AnonymsThread implements Runnable{
    String name = "sumit";

    public static void main(String[] args) {
        AnonymsThread anonymsThread = new AnonymsThread();
        Thread thead = new Thread(anonymsThread,"Task 1");
        Thread thead2 = new Thread(anonymsThread,"Task 2");



        thead.start();
        thead2.start();

        thead.setPriority(10);
        thead2.setPriority(5);

        try{
            Thread.sleep(1000);
           // System.out.println(Thread.name);
        }catch (Exception e){

        }

    }

    public void run() {
        try{

            if(Thread.currentThread().getName().endsWith("1")){
                Thread.sleep(1000);
                this.name = "New Name 1";
                System.out.println(this.name);
            }
            if(Thread.currentThread().getName().endsWith("2")){
                Thread.sleep(1000);
                this.name = "New Name 2";
                System.out.println(this.name);
            }
            User user = new User((int) Thread.currentThread().getId(),"sumit");
            System.out.println(user);
        }catch (Exception e){

        }

    }
}
