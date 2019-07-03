
public class AnonymousThreadexanoke implements Runnable{
    public static void main(String[] args) {
        AnonymousThreadexanoke anonymousThreadexanoke=new AnonymousThreadexanoke();
        Thread t1=new Thread(anonymousThreadexanoke,"thread1");
        Thread t2=new Thread(anonymousThreadexanoke,"thread2");
        Thread t3=new Thread(anonymousThreadexanoke,"thread3");
        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {

        if (Thread.currentThread().getName().endsWith("1")){


        }
    }
}
