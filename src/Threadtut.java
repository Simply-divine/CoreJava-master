public class Threadtut extends Thread {
    public static void main(String[] args) {
        Threadtut thread1 = new Threadtut();
        Threadtut thread2 = new Threadtut();
        Threadtut thread3 = new Threadtut();
        thread1.setName("thisIsThread1");
        thread2.setName("thisIsThread2");
        thread3.setName("thisIsThread3");
        thread1.start();
        thread2.start();
        thread3.start();
    }

    @Override
    public void run() {
        try {

            for (int i = 0; i <5 ; i++) {
                sleep(500);
                System.out.println(currentThread().getName()+"-->"+i);
            }
        }
        catch (Exception e){
            e.getMessage();
        }
    }
}
