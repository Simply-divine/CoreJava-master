public class ThreadGroupDemo implements Runnable {
    int sum = 0, tg1 = 0, tg2 = 0;

    public static void main(String[] args) {
        ThreadGroupDemo runnable = new ThreadGroupDemo();

        try {
            if (args.length > 1) {
                runnable.tg1 = Integer.parseInt(args[0]);
                runnable.tg2 = Integer.parseInt(args[1]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");

        Thread t1 = new Thread(tg1, runnable, "one");
        t1.start();
        Thread t2 = new Thread(tg1, runnable, "two");
        t2.start();
        Thread t3 = new Thread(tg1, runnable, "three");
        t3.start();


        ThreadGroup tg2 = new ThreadGroup(tg1, "Child ThreadGroup");

        Thread t4 = new Thread(tg2, runnable, "four");
        t4.start();
        Thread t5 = new Thread(tg2, runnable, "five");
        t5.start();
        Thread t6 = new Thread(tg2, runnable, "six");
        t6.start();

        try {
            Thread.sleep(1000);
            System.out.println(runnable.sum);
        } catch (Exception e) {
            System.out.println(e);
        }
//        System.out.println("Thread Group Name: " + tg1.getName());
//        tg1.list();
//        System.out.println("Thread Group Name: " + tg2.getName());
//        tg2.list();

    }

    public void run() {
        try {
            Thread.sleep(100);
            if (Thread.currentThread().getThreadGroup().getName().contains("Parent")) {
                sum += tg1;
                System.out.println(Thread.currentThread().getThreadGroup().getName() + " " + Thread.currentThread().getName() + " " + sum);
            } else {
                sum -= tg2;
                System.out.println(Thread.currentThread().getThreadGroup().getName() + " " + Thread.currentThread().getName() + " " + sum);
            }
        } catch (Exception e) {

        }
    }
}
