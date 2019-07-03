public class ThreadingDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                String[] args  = new String[3];
                args[0] = "10";
                args[1] = "5";
                ThreadGroupDemo.main(args);
            }
        };
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                String[] args  = new String[3];
                args[0] = "20";
                args[1] = "10";
                ThreadGroupDemo.main(args);
            }
        };
        thread.start();
        thread1.start();
    }
}
