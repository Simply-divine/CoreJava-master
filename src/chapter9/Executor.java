package chapter9;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Executor implements Runnable {
    String message;
    public Executor(String s){
        this.message=s;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"(Start) message: "+message);
        //processMessage();
        System.out.println(Thread.currentThread().getName()+"(end)message: "+message);

    }
    private void processMessage(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
