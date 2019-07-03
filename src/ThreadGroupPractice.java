public class ThreadGroupPractice implements Runnable{
    int sum;

    public static void main(String[] args) {
        ThreadGroupPractice threadGroupPractice=new ThreadGroupPractice();
        ThreadGroup tg=new ThreadGroup("parent thread");
        Thread t1=new Thread(tg,threadGroupPractice,"one");
        t1.start();
        Thread t2=new Thread(tg,threadGroupPractice,"two");
        t2.start();
        ThreadGroup childthreadgroup=new ThreadGroup(tg,"child threadgroup");
        Thread t3=new Thread(childthreadgroup,threadGroupPractice,"three");
        t3.start();
        Thread t4=new Thread(childthreadgroup,threadGroupPractice,"four");
        t4.start();

        try {
            Thread.sleep(1000);
            System.out.println(threadGroupPractice.sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
            if(Thread.currentThread().getThreadGroup().getName().contains("parent")){
                sum+=10;
            }
            else {
                sum-=10;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
