public class ThreadTut2 implements Runnable {
    int time;
    int sum;
    public static void main(String[] args) {
        ThreadTut2 thr1=new ThreadTut2();
        for (int i = 1000; i <=1500 ; i+=100) {


            thr1.time = i;
            Thread t1 = new Thread(thr1, "thread1");
            Thread t2 = new Thread(thr1,"thread2");
            Thread t3 = new Thread(thr1,"thread3");
            t1.start();
            t2.start();
            t3.start();
            try {

            }catch (Exception e){

            }

        }

    }

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            try {
                Thread.sleep(this.time);
                System.out.println(Thread.currentThread().getName());

                System.out.println(i);


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
