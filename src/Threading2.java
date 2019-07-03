public class Threading2 implements Runnable {
    long time;
    String name;
    int sum=0,sum2 =1,sum3 = 0,sum4 = 0;

    Threading2(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("Start " + start);

//        for (int i = 100; i <= 1000; i+=1+00) {
        Threading2 threading2 = new Threading2("Process ->" + 100);
        threading2.time = 100;
        Thread thread = new Thread(threading2, "Thread  " + 1);
        Thread thread1 = new Thread(threading2, "Thread " + 2);
        Thread thread2 = new Thread(threading2, "Thread " + 3);
        Thread thread3 = new Thread(threading2, "Thread " + 4);

        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            Thread.sleep(100*4*5);
//                threading2.sleep(i*4);
            System.out.println("--------------------------------------------------------");
            threading2.printAns();
        } catch (Exception e) {

        }
//        }

        try {
            Thread.sleep(100);
            System.out.println("End " + (System.currentTimeMillis() - start));
        } catch (Exception e) {

        }


    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            sleep(this.time);
            if (this.getName().endsWith("1")) {
                sum += i;
            }
            if (this.getName().endsWith("2")) {
                sum2 *= i;
            }
            if (this.getName().endsWith("3")) {
                sum3 -= i;
            }
            if (this.getName().endsWith("4")) {
                sum4 += (i + 1);
            }
        }
    }

    String getName() {
        return Thread.currentThread().getName();
    }

    void printAns() {
        System.out.println("final: " + sum);
        System.out.println("final: " + sum2);
        System.out.println("final: " + sum3);
        System.out.println("final: " + sum4);

    }

    void sleep() {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
